package cmmdc2;

import java.util.Scanner;


public class Aplicatie {
	
	public static long citLong(String prompter) {
		System.out.println(prompter);
		try {
			Scanner s = new Scanner(System.in);
			long lung  =s.nextLong();
			//s.close();  //eroare
			return lung;
			
		}
		catch(Exception exp){
			System.out.println("Ai gresit optiunea!, da alt intreg: ");
			return citLong(prompter);
		}
	}
	
	public static long Meniu() {
		System.out.println("\n1. Introducere primul numar");
		System.out.println("2. Introducere al 2-lea numar");
		System.out.println("3. Determinare CMMDC");
		System.out.println("0. Exit");
		return citLong("Ce optiune alegi?:");
	}

	public static void main(String[] args) {
		long a = 0;
		long b = 0;
		Euclid ob = new Euclid(a, b); //declarare obiect nou de tipul Euclid instantiere
		long optiune = Meniu();
		
		while (optiune != 0 ) {
			switch ((int)optiune) {
				case 1: a = citLong("Da primul numar: ");
						ob.setX(a);
						break;
				case 2: b = citLong("Da al 2-lea numar: ");
						ob.setY(b);
						break;
				case 3: 
						System.out.println("cmmdc(" + a +","+ b + ")= " + ob.euclid());	
						break;
				default: System.out.println("Nu ai introdus optiune valida");		
			}
			optiune = Meniu();
		}
		System.out.println("Program terminat!");
	}

}
