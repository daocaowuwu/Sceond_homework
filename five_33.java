package the_five;

//import java.util.Scanner;

public class five_33 {

	public static void main(String[] args) {
		

		System.out.println("10000���ڵ��������£�");

		fun();

	}

	//�������������Ķ��壺һ����ǡ�õ���������������֮��

	public static void fun(){

		for(int i=1;i<=10000;i++){

			int factor=0; //�������ӱ����ͣ���ʼֵ0

			for(int j=1;j<i/2+1;j++){  //ע�����ﲻ�õ�i-1��

				if(i%j==0)

					factor+=j;

			}//�ڲ�ѭ��������

			if(factor==i)

				System.out.println("  "+i);

		}//���ѭ������

		

	}

}
