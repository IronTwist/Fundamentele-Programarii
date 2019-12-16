import java.util.Scanner;
public class Problema2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int startDay = scan.nextInt();
		int startMonth = scan.nextInt();
		int startYear = scan.nextInt();
		
		int endDay = scan.nextInt();
		int endMonth = scan.nextInt();
		int endYear = scan.nextInt();
		int nrZile = 0;
		scan.close();
		
		for(int i=startYear+1; i < endYear; i++) {
			if(isLeapYear(i)) {
				nrZile +=366;
			}else {
				nrZile +=365;
			}
		}
		
		for(int i=startMonth; i < endMonth; i++) {
			
		}
		
	}
	
	public static boolean isLeapYear( int year) {
		if(year % 4 != 0) {
			return false;
		}
		if(year % 100 != 0) {
			return true;
		}
		
		if(year % 400 != 0) {
			return false;
		}
		
		return true;
	}
	
	public static int zileLuna(int luna, int an) {
		switch (luna) {
			case 1:	return 31;
			case 2: if(isLeapYear(an)) {
						return 29;
					}else {
						return 28;
					}
			case 3: return 31;
			case 4: return 30;
			case 5: return 31;
			case 6: return 30;
			case 7: return 31;
			case 8: return 31;
			case 9: return 30;
			case 10: return 31;
			case 11: return 30;
			case 12: return 31;
			default: return 0;
			}
			
		}
			
	}

}
