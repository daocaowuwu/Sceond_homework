package the_five;

import java.util.Scanner;

public class five_21 {

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
	      System.out.println("�����������ܶ�Ⱥʹ�������");
	      int num =input.nextInt();//num�����ܶ��
	      int year =input.nextInt(); //year��������
	      double yearrate =0.05,monthPayment,totalPayment;//yearrate�����ʣ�monthPayment��֧�����,totalPayment��֧�����
	      System.out.println("yearrate       monthPayment       totalPayment");
	      for(yearrate=0.05;yearrate<=0.08;yearrate+=0.00125)
	      {
	       double monthrate=yearrate/12;
	       monthPayment =(num*monthrate)/(1-1/Math.pow(1+monthrate,year*12)); 
	       totalPayment =monthPayment*12*year;;
	       System.out.printf("%7f%13.2f%21.2f\n",yearrate,monthPayment,totalPayment);//���Ƹ�ʽ���
	      }

	}

}
