package the_three;

import java.util.Scanner;

public class three_19 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int a=input.nextInt();
		int b=input.nextInt();
		int c=input.nextInt();
		if(a+b>c&&a+c>b&&b+c>a) 
		{
			System.out.println(a+b+c);
		}
		else
			System.out.println("���벻�Ϸ���");

	}

}
