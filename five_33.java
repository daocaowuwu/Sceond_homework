package the_five;

//import java.util.Scanner;

public class five_33 {

	public static void main(String[] args) {
		

		System.out.println("10000以内的完数如下：");

		fun();

	}

	//求完数；完数的定义：一个数恰好等于它的所有因子之和

	public static void fun(){

		for(int i=1;i<=10000;i++){

			int factor=0; //定义因子变量和，初始值0

			for(int j=1;j<i/2+1;j++){  //注意这里不用到i-1！

				if(i%j==0)

					factor+=j;

			}//内层循环结束；

			if(factor==i)

				System.out.println("  "+i);

		}//外层循环结束

		

	}

}
