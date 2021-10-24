package the_five;

import java.util.Scanner;

public class five_17 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("输入一个1~15的数字：");
		int n=input.nextInt();
		int i,j;
		for(i=0;i<n;i++)
		{
			for(j=1;j<=2*n-1;j++)
			{
				if(j<n-i||j>n+i)
					System.out.print("  ");
				else if(j>=n-i&&j<=n)
					System.out.print(String.format("%2d",n-j+1));
				else if(j>n&&j<=n+i)
					System.out.print(String.format("%2d",j-n+1));//j-n+1
			}
			System.out.print("\n");
		}

	}

}
