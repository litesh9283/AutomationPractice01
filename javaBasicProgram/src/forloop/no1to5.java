package forloop;

public class no1to5 {

	public static void main(String[] args) {
		int i,num=10,sum=0;
		for(i=1;i<=num;++i)
			sum=num*(num+1)/2;
        System.out.println("sum of first 10 natural num is="+sum);
	}

}
