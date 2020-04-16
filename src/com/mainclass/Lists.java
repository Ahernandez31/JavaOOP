package com.mainclass;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.abtraction.Animal;
import com.animals.Cat;
import com.animals.Dog;
import com.animals.Ostrich;

public class Lists {

	public static void main(String[] args) {
		
		Ostrich avestruz = new Ostrich("Rocky");
		Dog perro = new Dog("Dog");
		Cat gato = new Cat("Cat");
		
		List<Animal> lista= new ArrayList<Animal>();
		lista.add(avestruz);
		lista.add(perro);
		lista.add(gato);
		
		Scanner scan = new Scanner(System.in);
		boolean controlador=true;
		
		do {
			System.out.println("Estos son los animales actuales: ");
			System.out.println(getNamesInList(lista));
			System.out.println("¿Que accion quieres hacer? \n"
					+ "1. Agregar animal \n"
					+ "2. Eliminar animal \n"
					+ "3. Salir del ciclo \n");
			int option;
			try {
				option=Integer.parseInt(scan.nextLine());	
			} catch (Exception e) {
				continue;
			}
			
			switch (option) {
			case 1:
				System.out.println("¿Que tipo de animal quieres agregar? \n"
						+ "1. Avestruz \n"
						+ "2. Perro \n"
						+ "3. Gato \n"
						+ "4. Cancelar \n");
				int option2;
				try {
					option2=Integer.parseInt(scan.nextLine());
				} catch (Exception e) {
					continue;
				}
				
				switch (option2) {
				case 1:
					System.out.println("Ingresa el nombre para la avestruz");
					Ostrich o = new Ostrich(scan.nextLine());
					lista.add(o);
					break;
				case 2:
					System.out.println("Ingresa el nombre para el perro");
					Dog d = new Dog(scan.nextLine());
					lista.add(d);
					break;
				case 3:
					System.out.println("Ingresa el nombre para el gato");
					Cat c = new Cat(scan.nextLine());
					lista.add(c);
					break;
				case 4:
					continue;
					// El break se quita porque seria una linea inalcanzable
				default:
					break;
				}
				
				
				break;
			case 2:
				System.out.println("Ingrese el nombre o la posicion del animal a eliminar");
				String eliminar = scan.nextLine();
				int integerToDelete = 0;
				boolean isString=true;
				
				try {
					integerToDelete = Integer.parseInt(eliminar);
					isString=false;
				}catch(NumberFormatException e) {

				}
				
				if(isString) {
					int index;
					for(index=0; index < lista.size(); index ++) {
						if(lista.get(index).getName().equals(eliminar)) {
							break;
						}
					}	
						if (!(index > lista.size())) {
							lista.remove(index);
						}
				}else {
					lista.remove(integerToDelete);
				}
				break;
			case 3:
				controlador=false;
				break;
			default:
				break;
			}
			
			
		}while(controlador);
		
		
		
		/*
		List <Object> lista = new ArrayList<Object>();
		List <String> lista2 = new ArrayList<>();	
		List <Ostrich> listaAvestruz = new ArrayList<Ostrich>();
		
		lista.add("Primer Elemento");
		lista.add(100);
		lista.add('c');
		lista.add(2.43);
		
		
		lista2.add("String");
		
		Ostrich avestruz1 = new Ostrich("Rocky");
		listaAvestruz.add(avestruz1);
		System.out.println("********************");
		//For each
		for (Object objetos : lista) {
			System.out.println(objetos);
		}
		System.out.println("********************");
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
			
		}
		
		Iterator<Object> iterator=lista.iterator();
		System.out.println("*************");
		while(iterator.hasNext()) {
			Object actualObject=iterator.next();
			System.out.println(actualObject);
		}
		*/
	}
	
	public static String getNamesInList(List<Animal> lista) {
		String retorno="";
		
		for (int i = 0; i < lista.size(); i++) {
			retorno=retorno+lista.get(i).getName() + " Index : ["+ i +"] + Class "+ lista.get(i).getClass() + "\n";
			
		}
		
		
		return retorno;
	}

}
