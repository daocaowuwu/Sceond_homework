package the_five;

import java.util.Scanner;

public class five_36 {

	public static void main(String[] args) {
Scanner input=new Scanner(System.in);
		
		//String s=new String(input.nextLine());�Ǵ���ʹ�á�String s=new String(��123��)����ȷ
		System.out.print("����9�����֣�");
		String s=input.nextLine();  
		int i,sum=0;
		char w;
		for(i=0;i<9;i++)
		{
			w=s.charAt(i);
			//System.out.print((int)w-48); �����ַ����int������(int)w-48
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
