package the_three;

import java.util.Scanner;

public class three_15 {

	public static void main(String[] args) {
		int x=(int)(Math.random()*1000);
		System.out.print("输入一个三位整数：");
		Scanner input=new Scanner(System.in);
		int num=input.nextInt();
		System.out.println(x);
		int t,i;
		int c=num%10;
		int b=(int)(num/10)%10;
		int a=(int)(num/100)%10;
		
		if(a>b)
		{
		  t=a;
		  a=b;
		  b=t;
		}
		if(a>c)
		{
			  t=c;
			  c=a;
			  a=t;
		}
		if(b>c)
		{
			t=b;
			b=c;
			c=t;
		}
		int C=x%10;
		int B=(int)(x/10)%10;
		int A=(int)(x/100)%10;
		if(A>B)
		{
		  t=A;
		  A=B;
		  B=t;
		}
		if(A>C)
		{
			  t=C;
			  C=A;
			  A=t;
		}
		if(B>C)
		{
			t=B;
			B=C;
			C=t;
		}
		
		int []array= {a,b,c}; //定义并初始化一个数组
			
		if(x==num)
			System.out.println("赢得10000美元！");
		else if(a==A&&b==B&&c==C)
			System.out.println("赢得3000美元！");
		else
		{
			for(i=0;i<3;i++)
			{
				if(array[i]==A||array[i]==B||array[i]==C)
				{
					System.out.println("赢得1000美元！");
					break;
				}
				else
				{
					System.out.println("未获奖···");
					break;
				}
			}
		}
		input.close();

	}

}
