package the_five;

import java.util.Stack;
import java.util.Scanner;

public class five_38 {

	public static void main(String[] args) {
		int x;     
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		Stack<Integer> stack = new Stack<>();     //Õ»ÀàÐÍ
		while(n>0){      
			x=n%8;       
			stack.push(x);      
			n/=8;        }    
		while(!stack.empty()){       
			int num = stack.pop();      
			System.out.format("%d",num);    
			}


	}

}
