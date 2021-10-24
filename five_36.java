package the_five;

import java.util.Scanner;

public class five_36 {

	public static void main(String[] args) {
Scanner input=new Scanner(System.in);
		
		//String s=new String(input.nextLine());是错误使用。String s=new String(“123”)；正确
		System.out.print("输入9个数字：");
		String s=input.nextLine();  
		int i,sum=0;
		char w;
		for(i=0;i<9;i++)
		{
			w=s.charAt(i);
			//System.out.print((int)w-48); 数字字符变成int整数：(int)w-48
			sum=sum+(i+1)*((int)w-48);
		}
		
		int x=sum%11;
		System.out.print(s);
		if(x==10)
		{
			System.out.println('X');
		}
		else
			System.out.println(x);

	}

}
