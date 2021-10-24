package the_three;

import java.util.Scanner;

public class three_23 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("输入一个坐标：");
		float a=input.nextFloat();
		float b=input.nextFloat();
		if(a<=5&&a>=-5&&b<=2.5&&b>=-2.5)
		{
			System.out.println("在矩形内！");
		}
		else
			System.out.println("不在矩形内！");
		

	}

}
