package the_five;

import java.util.Scanner;

public class five_45 {

	public static void main(String[] args) {
		double []x=new double[10];
		Scanner input=new Scanner(System.in);
		System.out.println("输入十个数字：");
		for(int j=0;j<10;j++)
		{
			x[j]=input.nextDouble();
		}
		int m=x.length;
		          double sum=0;
		          for(int i=0;i<m;i++){//求和
		              sum+=x[i];
		          }
		          double dAve=sum/m;//求平均值
		          double dVar=0;
		         for(int i=0;i<m;i++){//求方差
		             dVar+=(x[i]-dAve)*(x[i]-dAve);
		         }
		         dVar=Math.sqrt(dVar/m);
		         System.out.println("平均值： "+dAve);
		         System.out.println("方差： "+dVar);

	}

}
