package forloop;


public class pallndromeNo {

	public static void main(String[] args)
	{
		int num1=123,rev=0,rem=0;
		int temp=num1;
		for (int num=123; num>0;num=num/10)
		        {
				rem=num1%10;
				rev=rev*10+rem;
				}
		System.out.println("reverse no: "+rev);
		if(temp==rev)
		{
		System.out.println("given no. is pallndrone: "+temp);
		}     else {
	
		
		System.out.println("given no. is not pallndrone: "+temp);

		}

}
}