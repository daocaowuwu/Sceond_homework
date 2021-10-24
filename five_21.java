package the_five;

import java.util.Scanner;

public class five_21 {

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
	      System.out.println("请输入贷款的总额度和贷款期限");
	      int num =input.nextInt();//num贷款总额度
	      int year =input.nextInt(); //year贷款期限
	      double yearrate =0.05,monthPayment,totalPayment;//yearrate年利率，monthPayment月支付额度,totalPayment总支付额度
	      System.out.println("yearrate       monthPayment       totalPayment");
	      for(yearrate=0.05;yearrate<=0.08;yearrate+=0.00125)
	      {
	       double monthrate=yearrate/12;
	       monthPayment =(num*monthrate)/(1-1/Math.pow(1+monthrate,year*12)); 
	       totalPayment =monthPayment*12*year;;
	       System.out.printf("%7f%13.2f%21.2f\n",yearrate,monthPayment,totalPayment);//控制格式输出
	      }

	}

}
