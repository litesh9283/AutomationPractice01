package functions;

public class Method1 {


	
		
		   
		  // salary  variable is a static variable
		   static double salary=10000.67;
		   static int empId=1001;  
		   
		   public static int getEmpID(){
			   System.out.println("printEmpID is running..");
			   return empId;
		   }   
		   public static double printEmpSal(){
			   System.out.println("printEmpSal is running.."+salary);
			   return salary;
		   }   
		   public static void main(String args[]) {
			
			System.out.println("Program Starts");
			double res1= printEmpSal();
			double sum2=res1+100;
			System.out.println("Final result: "+sum2);
			//System.out.println(printEmpSal());// compile time error as void method won't return any value to JVM
			
			//getEmpID();//method body gets executed but you won't get its return value in the console as its stored on method
						//or
			//System.out.println(getEmpID());//method body gets executed and also print its return value in the console
						//or
			int res=getEmpID();//method body gets executed and its return value will be stored in variable for future use
			System.out.println(res);
			
			int sum=res+100;
			System.out.println("Final result: "+sum);
			System.out.println("Program Ends");
		   }
		

	}


