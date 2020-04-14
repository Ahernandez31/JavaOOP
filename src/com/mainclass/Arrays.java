package com.mainclass;

import java.util.Iterator;

import com.abtraction.Animal;
import com.animals.*;

public class Arrays {

	public static void main(String[] args) {
		Ostrich o = new Ostrich("Rocky");
		Ostrich o2 = new Ostrich("Rocky II");
		Ostrich o3 = new Ostrich("Rocky III");
		Ostrich o4 = new Ostrich("Rocky IV");
		Ostrich o5 = new Ostrich("Rocky V");
		Dog d = new Dog("Simba");
		Cat c = new Cat("Osiris");
		
		
		Ostrich [] arreglo =new Ostrich[5];
		Animal [] listaAnimales= new Animal[7];
		
		
		//arreglo[0]=o;arreglo[1]=o2;arreglo[2]=o3;arreglo[3]=o4;arreglo[4]=o5;
		
		listaAnimales[0]=o;
		listaAnimales[1]=o2;
		listaAnimales[2]=o3;
		listaAnimales[3]=o4;
		listaAnimales[4]=o5;
		listaAnimales[5]=d;
		listaAnimales[6]=c;
		
		for (Animal puntero : listaAnimales) {
		System.out.println("The animal : "+ puntero.getName());
			
		}
		
		
		/*
		for (int i = 0; i < arreglo.length; i++) {
			System.out.println("The ostrich in position "+i +" is: "+arreglo[i].getName());
		}

		System.out.println("********************");
		
		for (Ostrich puntero : arreglo) {
		System.out.println("The ostrich :"+ puntero.getName());
			
		}
		 */		
	}

}
