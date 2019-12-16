
public class SuperClasa {
	public static int main (String args) {
	private int priv; //nu am acces direct in clasa doar prin get
	protected int prot; // am acces la obiecte din subclasa
	
	public SuperClasa() {
		priv = 1;
		prot = 2;
	}
	
	SubClasa ob = new SubClasa();
	ob.setCeva(3);
	ob.getCeva();
	System.out.println(ob.getCeva());
	}
}

