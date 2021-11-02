package es.iestetuan.jjuar.dao;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactoryConfigurationError;

import es.iestetuan.jjuar.dao.vo.Alumno;

public interface Ixml {
	public Alumno getAlumno(String id);
	public List<Alumno> getAlumnos();
	public void getXml(List<Alumno> lista) throws TransformerException, ParserConfigurationException, TransformerFactoryConfigurationError, FileNotFoundException, IOException;
	public List<Alumno> altaAlumno(List<Alumno> lista, Alumno alumno);
	public List<Alumno> bajaAlumno(List<Alumno> lista, String id);
	public List<Alumno> modId(List<Alumno> lista, String id, String nuevo);

}
