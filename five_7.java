package the_five;

public class five_7 {

	public static void main(String[] args) {
		int i;
		double [] money = new double[15]; //数组定义方法
	    money[0]=10000.0;
		for(i=1;i<15;i++)
		{
			money[i]=money[i-1]*(1+0.05);
		}
		double x=money[11]+money[12]+money[13]+money[14];
		System.out.println("十年后的学费是："+String.format("%.2f", money[11]));//保留两位小数且四舍五入的方法
		System.out.println("十年后的四年总学费是："+String.format("%.2f", x));

	}

}
