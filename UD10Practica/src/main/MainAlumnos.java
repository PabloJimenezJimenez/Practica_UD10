package main;
import alumnos.*;

public class MainAlumnos {

	public static void main(String[] args) {
		Alumno constructorA = new Alumno("A", "Curso", 2);
		Alumno constructorB = new Alumno("B", "Curso 2");
		Alumno constructorC = new Alumno("C");
		//Cambio el nombre del constructorA
		constructorA.cambiarNombre("Juan");
		//Relleno de notas random constructorA
		constructorA.setNotasDefault();
		//Muestro el metodo to String() de constructorA
		System.out.println(constructorA.toString());
		
		//Relleno de notas el constructorB
		constructorB.setNota();
		//Cambio una nota del constructorB
		constructorB.cambiarNota(10, 3);
		//Muestro el metodo to String() de constructorB
		System.out.println(constructorB.toString());
		
		//Relleno el constructorC de notasDefault
		constructorC.setNotasDefault();
		//Muestro el metodo to String() de constructorC
		System.out.println(constructorB.toString());
	}

}
