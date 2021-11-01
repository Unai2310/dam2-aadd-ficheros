package es.iestetuan.jjuar.dao.fictexto;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.TransformerFactoryConfigurationError;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import es.iestetuan.jjuar.dao.Ixml;
import es.iestetuan.jjuar.dao.vo.Alumno;


public class Metodos implements Ixml {
	
	@Override
	public Alumno getAlumno(String id) {
		Alumno nuevo = new Alumno();
		Properties config = new Properties();
		InputStream Entrada = null;
		try {
			Entrada = new FileInputStream("C:\\Users\\Unai\\Desktop\\config.properties");
			config.load(Entrada);
			File inputFile = new File(config.getProperty("RutaOrigen"));
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(inputFile);
			doc.getDocumentElement().normalize();
			NodeList nList = doc.getElementsByTagName("alumno");
			for (int temp = 0; temp < nList.getLength(); temp++) {
				Node Nodo = nList.item(temp);
				if (Nodo.getNodeType() == Node.ELEMENT_NODE) {
					Element Elemento = (Element) Nodo;
					String nia = Elemento.getAttribute("id");
					if (id.equals(nia)) {
						nuevo.setId(Elemento.getAttribute("id"));
						nuevo.setNie(Elemento.getElementsByTagName("dni").item(0).getTextContent());
						nuevo.setNombre(Elemento.getElementsByTagName("nombre").item(0).getTextContent());
						nuevo.setApellido1(Elemento.getElementsByTagName("apellido1").item(0).getTextContent());
						nuevo.setApellido2(Elemento.getElementsByTagName("apellido2").item(0).getTextContent());
						nuevo.setEmail(Elemento.getElementsByTagName("email").item(0).getTextContent());
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return nuevo;
	}
	

	@Override
	public List<Alumno> getAlumnos() {
		ArrayList<Alumno> lista = new ArrayList<Alumno>();
		Properties config = new Properties();
		InputStream Entrada = null;
		try {
		Entrada = new FileInputStream("C:\\Users\\Unai\\Desktop\\config.properties");
		config.load(Entrada);
		File inputFile = new File(config.getProperty("RutaOrigen"));
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
		Document doc = dBuilder.parse(inputFile);
		doc.getDocumentElement().normalize();
		NodeList nList = doc.getElementsByTagName("alumno");
			for (int temp = 0; temp < nList.getLength(); temp++) {
				Alumno nuevo = new Alumno();
				Node Nodo = nList.item(temp);
				if (Nodo.getNodeType() == Node.ELEMENT_NODE) {
					Element Elemento = (Element) Nodo;
					nuevo.setId(Elemento.getAttribute("id"));
					nuevo.setNie(Elemento.getElementsByTagName("dni").item(0).getTextContent());
					nuevo.setNombre(Elemento.getElementsByTagName("nombre").item(0).getTextContent());
					nuevo.setApellido1(Elemento.getElementsByTagName("apellido1").item(0).getTextContent());
					nuevo.setApellido2(Elemento.getElementsByTagName("apellido2").item(0).getTextContent());
					nuevo.setEmail(Elemento.getElementsByTagName("email").item(0).getTextContent());
		        }
				lista.add(nuevo);			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return lista;
	}

	@Override
	public void getXml(List<Alumno> lista) throws ParserConfigurationException, TransformerFactoryConfigurationError, TransformerException, IOException {
		Properties config = new Properties();
		InputStream Entrada = null;
		Entrada = new FileInputStream("C:\\Users\\Unai\\Desktop\\config.properties");
		config.load(Entrada);
		var document = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
		  
		document.setXmlVersion("1.0");
		  
		var alumnosguia = document.createElement("alumnos");
		document.appendChild(alumnosguia);
		  
		createAlumno(document,alumnosguia,lista.get(0));
		createAlumno(document,alumnosguia,lista.get(1));
		createAlumno(document,alumnosguia,lista.get(2)); 
		var domSource = new DOMSource(document);
		var result = new StreamResult(config.getProperty("RutaDestino"));
		var transformer = TransformerFactory.newInstance().newTransformer();
		  
		transformer.setOutputProperty(OutputKeys.INDENT, "yes");
		transformer.transform(domSource, result);	
	}
	
	private static void createAlumno(Document document, Element empDad, Alumno alumno) {
		
		var alumnos = document.createElement("alumno");
		alumnos.setAttribute("id", alumno.id);
		empDad.appendChild(alumnos);
		
		var nie = document.createElement("dni");
		nie.appendChild(document.createTextNode(alumno.nie));
		alumnos.appendChild(nie);
		
		var nombre = document.createElement("nombre");
		nombre.appendChild(document.createTextNode(alumno.nombre));
		alumnos.appendChild(nombre);
		
		var apellido1 = document.createElement("apellido1");
		apellido1.appendChild(document.createTextNode(alumno.apellido1));
		alumnos.appendChild(apellido1);
		
		var apellido2 = document.createElement("apellido2");
		apellido2.appendChild(document.createTextNode(alumno.apellido2));
		alumnos.appendChild(apellido2);
		
		var Email = document.createElement("email");
		Email.appendChild(document.createTextNode(alumno.email));
		alumnos.appendChild(Email);
	}
}
