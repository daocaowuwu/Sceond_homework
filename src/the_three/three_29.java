package the_three;

import java.util.Scanner;

public class three_29 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("�����һ��Բ��Բ������Ͱ뾶��");
		double x1=input.nextDouble();
		double y1=input.nextDouble();
		double r1=input.nextDouble();
		System.out.print("����ڶ���Բ��Բ������Ͱ뾶��");
		double x2=input.nextDouble();
		double y2=input.nextDouble();
		double r2=input.nextDouble();
		if((x1*x1-x2*x2)+(y1*y1-y2*y2)<=(r1-r2)*(r1-r2))
		{
			System.out.println("Բ2��Բ1�ڣ�");
		}
		else if((x1*x1-x2*x2)+(y1*y1-y2*y2)<=(r1+r2)*(r1+r2))
		{
			System.out.println("Բ2��Բ1�ص���");
		}
		else 
			System.out.println("Բ2��Բ1���ص���");
	}

}