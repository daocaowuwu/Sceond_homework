package the_five;

public class five_19 {

	public static void main(String[] args) {
		int n=8;
		int i,j,k;
		for(i=0;i<n;i++)
		{
			for(j=1;j<n-i;j++)
			{
				System.out.print("    ");
			}
			for(k=0;k<i+1;k++)
			{
				System.out.print(String.format("%4.0f",Math.pow(2,k))); //pow() 函数参数和返回值为double型
			}
			for(k=0;k<i;k++)
			{
				System.out.print(String.format("%4.0f",Math.pow(2,i-k)));
			}
			for(j=1;j<n-i;j++)
			{
				System.out.print("    ");
			}
			System.out.print("\n");

	}
	}

}
