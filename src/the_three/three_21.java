package the_three;

import java.util.Scanner;

public class three_21 {

	public static void main(String[] args) {
		int h;
		Scanner input=new Scanner(System.in);
		System.out.print("输入年份：");
		int y=input.nextInt();
		System.out.print("输入月份：");
		int m=input.nextInt();
		System.out.print("输入日期：");
		int q=input.nextInt();
		if(m==1||m==2)
		{
			m+=12;
			y-=1;
		}
		int j=(int)y/100;
		int k=y%100;
		h=(int)(q+26*(m+1)/10+k+k/4+j/4+5*j)%7;
		if(h==0)
			System.out.println("Saturday");
		else if(h==1)
			System.out.println("Sunday");
		else if(h==2)
			System.out.println("Monday");
		else if(h==3)
			System.out.println("Tuesday");
		else if(h==4)
			System.out.println("Wednesday");
		else if(h==5)
			System.out.println("Thursday");
		else 
			System.out.println("Friday");

	}

}
