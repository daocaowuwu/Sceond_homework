package the_three;

import java.util.Scanner;

public class three_15 {

	public static void main(String[] args) {
		int x=(int)(Math.random()*1000);
		System.out.print("����һ����λ������");
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
		
		int []array= {a,b,c}; //���岢��ʼ��һ������
			
		if(x==num)
			System.out.println("Ӯ��10000��Ԫ��");
		else if(a==A&&b==B&&c==C)
			System.out.println("Ӯ��3000��Ԫ��");
		else
		{
			for(i=0;i<3;i++)
			{
				if(array[i]==A||array[i]==B||array[i]==C)
				{
					System.out.println("Ӯ��1000��Ԫ��");
					break;
				}
				else
				{
					System.out.println("δ�񽱡�����");
					break;
				}
			}
		}
		input.close();

	}

}
