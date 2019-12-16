
public class TriunghiPascal {

	public static void main(String[] args) {
	  
				  
			    int []t[] =new int[10][];		//declarare matrice variabila
			    t[0]   	=new int[1];		//initializare primele 2 linii
			    t[1]   	=new int[2];
			    t[0][0]	=t[1][0]=t[1][1]=1;		
			
			    for(int i=2; i<t.length; i++){		//generare triunghi
			      t[i]=new int[i+1];
			      t[i][0]=t[i][i]=1;
			      for(int j=1; j<t[i].length-1; j++)
			        t[i][j]=t[i-1][j-1]+t[i-1][j];
			    }
			
			    for(int i=0; i<t.length; i++){		//afisare triunghi
			      for(int j=0; j<t[i].length; j++)
			        System.out.print(t[i][j]+" ");
			      System.out.println("");
			    }  
			  }
	}

