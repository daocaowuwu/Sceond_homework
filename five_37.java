package the_five;

import java.util.Scanner;

public class five_37 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		String str = "";
		      while(n!=0){
		          str = n%2+str;  //java������+�ַ����������Ҳ����ַ������ַ�����������
		          n = n/2;
		      }
		          System.out.println(str);

	}

}
