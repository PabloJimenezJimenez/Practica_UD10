package alumnos;

import java.util.Arrays;
import java.util.Scanner;

public class Alumno {
	static Scanner sc=new Scanner(System.in);
	private String nombre;
	private String curso;
	private int [] notas;
	
	//Creo un constructor que reciba tres argumentos por parametro
	public Alumno(String nombre, String curso, int asignatura) {
		this.nombre = nombre;
		this.curso = curso;
		this.notas= new int [asignatura];
	}
	
	//Creo un constructor que reciba dos argumentos por parametro y llame al anterior constructor
	public Alumno(String nombre, String curso) {
		this(nombre,curso,5);
		
	}
	
	//Creo un constructor que reciba un argumentos por parametro y llame al anterior constructor
	public Alumno(String nombre) {
		this(nombre,"DAM");
	}
	
	//Creo un metodo que ponga notas aleatorias
	public void setNotasDefault() {
		for(int i=0;i<notas.length;i++) {
			notas[i]=(int)(Math.random()*10);
		}
	}
	
	//Creo un mmetodo que me permita cambiar el nombre 
	public void cambiarNombre(String nombre) {
		this.nombre=nombre;
	}
	
	//Creo un metodo que me devuelva las notas del alumno
	public void notasAlumno(){
		for(int i=0;i<notas.length;i++) {
			System.out.println(notas[i]);
		}	
	}
	
	//Creo un metodo que me permita cambiar una nota del array
	public void cambiarNota(int nota, int posicion) {
		if(posicion<notas.length && posicion>-1) {
			notas[posicion] = nota;
		}else System.out.println("Posicion no encontrada");
		
	}
	
	//Creo un metodo que permita poner las notas
	public void setNota() {
		int nota=-1;
		for(int i=0;i<notas.length;i++) {
			System.out.println("Introduce una nota del 0 al 10");
			while(nota<0 || nota>10) {
				nota=sc.nextInt();
			}
			notas[i]=nota;
			nota=-1;
		}	
	}
	
	//Creo un metodo que me permita cambiar el curso
	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	//Creo un metodo que me permita saber el nombre
	public String getNombre() {
		return nombre;
	}
	
	//Creo un metodo que me permita saber el curso
	public String getCurso() {
		return curso;
	}
	
	
	//Creo un metodo toString
	@Override
	public String toString() {
		return "Alumno -> nombre" + nombre + " curso " + curso + " notas " + Arrays.toString(notas) + "\n";
	}
	
}
