package forloop;

public class uppercase {

	public static void main(String[] args) {
	 char ch;
     
     for(ch='A'; ch<='Z'; ++ch);
     System.out.println("Uppercase Alphabates are: \n");
     System.out.print(ch+" ");
  
     System.out.print("\n");
     System.out.println("Lowercase Alphabate are: \n");
     for(ch='a'; ch<='z'; ch++) {
    	 System.out.print(ch+" ");
     }
     }
	 

	
	}