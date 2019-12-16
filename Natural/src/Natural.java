
public class Natural {
	private long n;								//n este variabila membru
	
	public Natural(long numar) {				//constructor de initialiare cu parametru
		if(numar < 0) {								//compilatorul nu mai construieste constr implicit
			this.n = 0;
		}else {
			this.n = numar;
		}
	}
	
	public Natural() {							//constructor creat de programator
		n=0;
	}
	
	public Natural scade(Natural n1) {			//s=this.n-n1, return s
		Natural s = new Natural();				//metoda instanta
		if(this.n > n1.n) {
			s.n = this.n-n1.n;
		}else {
			s.n = 0;
		}
		return s;
	}
	
	public void scade (Natural n1, Natural n2) { //se face scaderea obisnuita (supraincarcare scade(1 param)
		if(n1.n > n2.n) this.n=n1.n - n2.n;			//daca descazutul < scazatorul
		else 			this.n=0;
	}
	
	public static Natural radical(Natural n1) { //metoda statica a clase
		Natural r = new Natural(0);				
			
		r.n = (long) Math.sqrt(n1.n);			//Math.sqrt(long) returneaza double
		
		return r;								//obligatoriu conversia cast la long
	}
	
	public void cmmdc(Natural n1, Natural n2) {
		//Natural s = new Natural(0);
		if(n1.n==0 && n2.n > 0) {				//conditii aritmetice legate de cmmdc
			this.n=n2.n;							//cmmmdc(0,n) = n
			//return s;
		}
		if(n1.n > 0 && n2.n == 0) {				//cmmdc(n,0);
			this.n=n1.n;
			//return s;
		}
		if(n1.n==0 && n2.n==0) {				//in exterior trebuie testat daca r.n=0
			this.n=0;
			//return s;
		}
		
			/*while(n1.n != n2.n)					//aici n1.n>0, n2.n > 0
			 * 	if(n1.n > n2.n) n1.n -= n2.n;
			 * 	else 			n2.n -= n1.n;
			 * 
		 *  s.n = n1.n;
		 *  return s;
		 */
		
		long a = n1.n;
		long b = n2.n;							//n1 si n2 nemodificate
		
		while(a!=b) 
			if(a>b) a-=b;
			else	b-=a;
			
		this.n=a;
		//return s;
			
		}
	
	public boolean egalZero() {					//return n==0
		if(n == 0) return true;
		/*else*/   return false;
	}
	
	public long getN() {
		return n;
	}
	
	public void setN(long n) {
		this.n = n;
	}
	
	public boolean prim() {
		if(n < 2) {
			return false;			//0 si 1 nu sunt prime
		}else if(n>2 && n%2==0) {
			return false;			//n=numar par => nu-i prim
		}
									//n=2 sau n>2 si impar
		for(long d = 3; d*d <=n; d+=2) {
			if(n%d == 0)  return false;
		}							//la iesire din for numarul este prim	
		
		return true;
	}
}

	
	
	



















