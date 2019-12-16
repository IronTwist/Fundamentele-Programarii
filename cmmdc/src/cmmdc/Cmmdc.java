/**
 * 
 */
package cmmdc;
import java.util.Scanner;

public class Cmmdc {
	public static long citLong(String prompter) {
		System.out.print(prompter); 	//sirul prompter e parametrul primit din exterior 
		
		try {
			Scanner s = new Scanner(System.in); //obiectul s se asociaza cu fluxul de intrare
			long l  = s.nextLong();   //nextLong parseaza (analiza si conversie) 
			return l;	//return un nr long
		} 
		catch(Exception exp) {
			System.out.println("n-ai dat intreg!!!");
			return citLong(prompter);  //apel recursiv pe orice eroare
		}
	}
	
	public static long euclidScadere(long a, long b) { //alg euclid prin scadere
		while(a != b) {
			if(a > b) {
				a -= b; //a=a-b
			}else {
				b -= a; //b = b - a
			}
			
		}
		return a;
	}
	
	public static long Meniu() {
		System.out.println("\n1. Introducere primul numar");
		System.out.println("2. Introducere al 2-lea numar");
		System.out.println("3. Determinare CMMDC");
		System.out.println("0. Exit");
		return citLong("Ce optiune alegi?:");
	}

	public static void main(String[] args) {
		long a=0, b=0;
		long opt = Meniu();
		
		while(opt != 0) {
			switch((int)opt) {   //conversie cast (explicita la intreg) 
				case 1: a = citLong("da intreg");
						break;
				case 2: b = citLong("da al 2-lea intreg");
						break;
				case 3:	
						System.out.println("cmmdc(" + a +","+ b+ ")= " + euclidScadere(a, b));
						break;
				default:		
						System.out.println("Nu ai dat optiune valida");
			}
			
			opt=Meniu();
		}
		System.out.println("Program terminat");
		
	}

}
