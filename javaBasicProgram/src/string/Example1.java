package string;

public class Example1 {

	public static void main(String[] args) {
		String A1="Nasik";
		String A2="Mumbai";
		String A3="Nasik";//no new object will be created as its a duplicate object
		System.out.println("s1: "+A1);
		System.out.println("s2: "+A2);
		System.out.println("s3: "+A3);
		System.out.println("Compare s1 and s2 object based on address: "+(A1==A2));
		System.out.println("Compare s2 and s3 object based on address: "+(A3==A2));
		System.out.println("Compare s1 and s3 object based on address: "+(A1==A3));
		System.out.println("Compare s1 and s2 object based on value: "+A1.equals(A2));
		System.out.println("Compare s2 and s3 object based on value: "+A3.equals(A2));
		System.out.println("Compare s1 and s3 object based on value: "+A1.equals(A3));

	}

}
