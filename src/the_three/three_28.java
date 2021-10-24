package the_three;

import java.util.Scanner;

public class three_28 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("输入第一个矩形的x y 宽度 高度：");
        double x1=input.nextDouble();
        double y1=input.nextDouble();
        double w1=input.nextDouble();
        double h1=input.nextDouble();
		System.out.print("输入第二个矩形的x y 宽度 高度：");
		double x2=input.nextDouble();
        double y2=input.nextDouble();
        double w2=input.nextDouble();
        double h2=input.nextDouble();
        if(x2-w2/2>=0&&y2-h2/2>=0&&x2+w2/2<=x1+w1/2&&y2+h2/2<=y1+h1/2)
        {
        	System.out.println("2在1内");
        }
        else if(x2-w2/2<=x1+w1/2||x2+w2/2>=0||y2-h2/2<=y1+w1/2||y2+w2/2>=0)
        {
        	System.out.println("1和2重叠");
        }
        else
        	System.out.println("1和2不重叠");
	}

}
