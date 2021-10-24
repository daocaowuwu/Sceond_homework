package the_five;

import java.util.Scanner;

public class five_37 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		String str = "";
		      while(n!=0){
		          str = n%2+str;  //java中数字+字符串会把数字也变成字符串与字符串连接起来
		          n = n/2;
		      }
		          System.out.println(str);

	}

}
