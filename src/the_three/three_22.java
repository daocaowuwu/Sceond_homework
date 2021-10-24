package the_three;

import java.util.Scanner;

public class three_22 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("输入一个坐标：");
		//char q=input.next().charAt(0); 没有nextChar()
		String s=input.nextLine();
		int a=(int)(s.charAt(1)-48);
		int b=(int)(s.charAt(3)-48);
		if(a*a+b*b<=100)
			System.out.println(s+" is in the circle");
		else
			System.out.println(s+" isn't in the circle");
        input.close();
	}

}
