package the_three;

import java.util.Scanner;

public class three_27 {

	public static void main(String[] args) {
		System.out.print("����x��y��");
		Scanner input=new Scanner(System.in);
		double x=input.nextDouble();
		double y=input.nextDouble();
		if(x>=0&&x<=200&&y>=0&&y<=100&&0.5*x+y<=100)
		{
			System.out.println("���������������");
		}
		else 
			System.out.println("����㲻����������");
	}

}
