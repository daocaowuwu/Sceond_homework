package the_five;

public class five_26 {

	public static void main(String[] args) {
		int i,j;
		double k;
		//double []num=new double[100010];
		double sum;
		for(i=10000;i<=100000;i=i+10000)
		{
			
			//num[0]=1;
			//num[1]=1;
			//sum=num[0]+num[1];
			sum=2;
			k=1;
			for(j=2;j<i;j++)
			{
				//num[j]=num[j-1]*(1.0/j);
				k=k*j;
				sum=sum+1.0/k;
			}
			System.out.println(sum);
		}

	}

}
