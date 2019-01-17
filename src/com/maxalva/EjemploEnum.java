package com.maxalva;

public class EjemploEnum {
	
	public static void main(String[] args) {
		System.out.println("Valor 1: " + Dias.LUNES);
		indicarDia(Dias.LUNES);
		
		System.out.println("");
		
		System.out.println("Continente 4: " + Continentes.AMERICA);
		System.out.println("Paises en América: " + Continentes.AMERICA.getPaises());
		
		System.out.println("");
		
		indicarPais(Continentes.AFRICA);
		indicarPais(Continentes.ASIA);
		
		System.out.println("");
		
		imprimirContinentes();
	}

	private static void imprimirContinentes() {
		for (Continentes c: Continentes.values()) {
			System.out.println("Continente " + c + " contiene " + c.getPaises() + " paises");
		}
	}

	private static void indicarPais(Continentes continente) {
		System.out.println("Paises en " + continente + ": " + continente.getPaises());
	}

	private static void indicarDia(Dias dias) {
		switch (dias) {
		case LUNES:
			System.out.println("Primer día de la semana");
			break;
		case MARTES:
			System.out.println("Segundo día de la semana");
		default:
			System.out.println("Otro día de la semana");
			break;
		}
	}

}
