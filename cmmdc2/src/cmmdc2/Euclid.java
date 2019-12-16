package cmmdc2;

public class Euclid {
	private long x;
	private long y;
	
	public Euclid(long x, long y) {  //constructor cu parametrii  
		this.x = x;
		this.y = y;
	}
							                                     
	public long euclid() {	//metoda determinare cmmdc din x si y
		while(x != y) {
			if(x > y) {
				x = x - y;
			}else {
				y = y - x;
			}
		}
		
		return x;
	}

	public long getX() {
		return x;
	}

	public void setX(long x) {
		this.x = x;
	}

	public long getY() {
		return y;
	}

	public void setY(long y) {
		this.y = y;
	}
}
