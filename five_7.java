package the_five;

public class five_7 {

	public static void main(String[] args) {
		int i;
		double [] money = new double[15]; //���鶨�巽��
	    money[0]=10000.0;
		for(i=1;i<15;i++)
		{
			money[i]=money[i-1]*(1+0.05);
		}
		double x=money[11]+money[12]+money[13]+money[14];
		System.out.println("ʮ����ѧ���ǣ�"+String.format("%.2f", money[11]));//������λС������������ķ���
		System.out.println("ʮ����������ѧ���ǣ�"+String.format("%.2f", x));

	}

}
