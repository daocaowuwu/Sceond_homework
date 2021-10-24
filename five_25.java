package the_five;

public class five_25 {

	public static void main(String[] args) {
		int i,j;
		double pi,sum;
		for(i=10000;i<=100000;i=i+10000)
		{
			sum=0;
			for(j=1;j<=i;j++)
			{
				sum=sum+Math.pow(-1, j+1)/(2*j-1);
			}
			pi=4*sum;
			System.out.println(pi);
		}
		

	}

}
