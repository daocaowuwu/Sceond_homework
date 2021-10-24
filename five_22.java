package the_five;

import java.util.Scanner;

public class five_22 {

	public static void main(String[] args) { //太难，后面做
		//principal:本金，balance:余额
		Scanner input=new Scanner(System.in);
		System.out.print("Enter loan amount, for example 120000.95  ：  ");
		double loan=input.nextDouble();
		System.out.print("Enter number of years as an integer ,for example  5  :   ");
		int years=input.nextInt();
		System.out.print("Enter yearly interest rate ,for example 8.25  ： ");
		double rate=input.nextDouble();
		double mon_rate=rate/1200.0;//月利率
		double interest,interest1,principal,balance=loan,Total_Payment=0 ;
		
		System.out.println("payment#"+"\t\t"+"Interest"+"\t\t"+"Principal"+"\t\t"+"Balance");
		int i=1;
		double mon_payment=(loan*mon_rate*Math.pow(1+mon_rate,years*12)/(Math.pow(1+mon_rate,years*12)-1));
		System.out.println("Monthly Payment ： "+mon_payment);
		for(i=1;i<=years*12;i++) 
		{
			interest1=mon_rate*balance;
		Total_Payment+=interest1;
		}
		System.out.println("Total Payment  ： "+(Total_Payment+loan));
		System.out.println("payment#"+"\t"+"Interest"+"\t"+"Principal"+"\t"+"Balance");
		for(i=1;i<=years*12;i++) 
		{
			interest=mon_rate*balance;
			principal=mon_payment-interest;
			balance=balance-principal;
			//System.out.println(i+"\t\t"+interest+"\t\t"+principal+"\t\t"+balance);
			System.out.printf("%d\t\t%.2f\t\t%.2f \t\t%.2f\n",i,interest,principal,balance);
		}

	}

}
