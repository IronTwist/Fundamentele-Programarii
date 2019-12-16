import java.util.Scanner;

public class Curs1 {

	public static void main(String[] args) {
		
	}
	
	public static void Biblioteca() {
Scanner scan = new Scanner(System.in);
		
		int ziLimita, lunaLimita, anLimita;
		int ziReturnare, lunaReturnare, anReturnare ;
		int amenda = 0;
		
		ziLimita = scan.nextInt();
		lunaLimita = scan.nextInt();
		anLimita = scan.nextInt();
		ziReturnare = scan.nextInt();
		lunaReturnare = scan.nextInt();
		anReturnare = scan.nextInt();
		
		
		if(anReturnare <= anLimita && lunaReturnare <= lunaLimita && anReturnare <= anLimita) {
			System.out.println(0);
		}
		
		if(anReturnare <= anLimita && lunaReturnare <= lunaLimita && anReturnare > anLimita) {
			System.out.println(5*(ziReturnare - ziLimita));
		}
		
		if(anReturnare <= anLimita && lunaReturnare <= lunaLimita && anReturnare > anLimita) {
			System.out.println(5*(ziReturnare - ziLimita));
		}
		
		System.out.println(amenda);

	}

}
