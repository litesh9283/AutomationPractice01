package functions;

public class Method4 {



		public static void main(String[] args) {
			System.out.println("Result of addition1: "+getAdditionResult(250.36, 45));
			System.out.println("******************************");
			System.out.println("Result of addition2: "+Method4.getAdditionResult(250.36, 45));
			System.out.println("******************************");
			int sum=getAdditionResult(10, 30);
			System.out.println("Sum of two numbers: "+sum);
			double finalResult =sum*100;
			System.out.println("Result after some operation: "+finalResult);
		}
		/*
		 * accessmodifier:
		 * non-accessmodifier:
		 * return type:
		 * methodName:
		 * argument/parameter: 
		 * return value:
		 */
		static double getAdditionResult(int num1,int num2) {
			System.out.println("Number1 is: "+num1);
			System.out.println("Number2 is: "+num2);
			double res = num1+num2;
			return res;
		}
		
	
	}


