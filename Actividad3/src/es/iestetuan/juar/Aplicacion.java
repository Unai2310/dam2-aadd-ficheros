package es.iestetuan.juar;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactoryConfigurationError;

import es.iestetuan.jjuar.dao.fictexto.Metodos;

public class Aplicacion {

	public static void main(String[] args) throws ParserConfigurationException, TransformerFactoryConfigurationError, TransformerException, IOException {
		Metodos metodos = new Metodos();
		metodos.getXml(metodos.getAlumnos());
	}

}
