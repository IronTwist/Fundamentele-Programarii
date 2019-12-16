
public class Client {
	
	public static void afisareNat(String sir, Natural n) {
		System.out.println(sir + n.getN());
	}
	
	public static void main(String[] args) {
		
		Natural n1 = new Natural (36);
		Natural n2 = new Natural (48);
		
		afisareNat("n1=", n1);
		afisareNat("n2=", n2);
		
		Natural s=new Natural();
		s=n1.scade(n2);							//apelare un singur parametru
		afisareNat("n1 - n2=", s);
		
		afisareNat("n1=", n1);
		afisareNat("n2=", n2);
		s.scade(n2, n1);
		
		afisareNat("n2 - n1=", s);
		
		Natural cmd= new Natural();
		cmd.cmmdc(n1, n2);
		afisareNat("cmmdc=", cmd);
		
		n1.setN(7);
		if(n1.prim()) afisareNat("numarul este prim: ", n1);
		else afisareNat("Numarul nu este prim: ", n1);
	
		
		System.out.println("Program terminat");

	}

}
