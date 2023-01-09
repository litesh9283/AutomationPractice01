package string;

public class RemoveAllSpace {

	public static void main(String[] args) {
		   String str = "India     Is My    Country";  
	        //1st way  
	        String noSpaceStr = str.replaceAll("\\s", "");
	        
	        System.out.println(noSpaceStr); 
	     
	    }  
	}


