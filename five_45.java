package the_five;

import java.util.Scanner;

public class five_45 {

	public static void main(String[] args) {
		double []x=new double[10];
		Scanner input=new Scanner(System.in);
		System.out.println("����ʮ�����֣�");
		for(int j=0;j<10;j++)
		{
			x[j]=input.nextDouble();
		}
		int m=x.length;
		          double sum=0;
		          for(int i=0;i<m;i++){//���
		              sum+=x[i];
		          }
		          double dAve=sum/m;//��ƽ��ֵ
		          double dVar=0;
		         for(int i=0;i<m;i++){//�󷽲�
		             dVar+=(x[i]-dAve)*(x[i]-dAve);
		         }
		         dVar=Math.sqrt(dVar/m);
		         System.out.println("ƽ��ֵ�� "+dAve);
		         System.out.println("��� "+dVar);

	}

}
