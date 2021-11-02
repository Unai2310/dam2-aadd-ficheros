package es.iestetuan.jjuar;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactoryConfigurationError;

import es.iestetuan.jjuar.dao.fictexto.Metodos;
import es.iestetuan.jjuar.dao.vo.Alumno;

public class Aplicacion {

	public static void main(String[] args) throws ParserConfigurationException, TransformerFactoryConfigurationError, TransformerException, IOException {
		Metodos metodos = new Metodos();
		//COMENTA LOS METODOS QUE NO USES
		
		System.out.println("****************************");
		System.out.println("Buscar el alumno con Id 171");
		System.out.println("****************************");
		System.out.println(metodos.getAlumno("619"));
		System.out.println("");
		
		System.out.println("****************************");
		System.out.println("Array con todos los alumnos");
		System.out.println("****************************");
		System.out.println(metodos.getAlumnos());
		System.out.println("");
		
		System.out.println("****************************");
		System.out.println("Crear fichero Xml a partir del metodo anterior");
		System.out.println("****************************");
		metodos.getXml(metodos.getAlumnos());
		System.out.println("");
		
		System.out.println("****************************");
		System.out.println("Incluye nuevo alumno en el Xml");
		System.out.println("****************************");
		Alumno alumno = new Alumno("300", "44444444D","Unai","Anton","Rios","unaiyanton@gmail.com");
		metodos.getXml(metodos.altaAlumno(metodos.getAlumnos(), alumno));
		System.out.println("");
		
		System.out.println("****************************");
		System.out.println("Eliminar alumno con id 300 en el Xml");
		System.out.println("****************************");
		metodos.getXml(metodos.bajaAlumno(metodos.getAlumnos(), "300"));
		System.out.println("");
		
		System.out.println("****************************");
		System.out.println("Sustituir el id del alumno con id 171 po 172 en el Xml");
		System.out.println("****************************");	
		metodos.getXml(metodos.modId(metodos.getAlumnos(), "171", "172"));
		System.out.println("");
	}
}


