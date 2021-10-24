package the_three;

public class three_24 {

	public static void main(String[] args) {
		int x=(int)(1+Math.random()*53);
		if(x>0&&x<=40)
		{
			if(x<=10)
			{
				if(x==1)
					System.out.println("你抽到的是黑梅花Ace");
				else
					System.out.println("你抽到的是黑梅花"+x);
			}
			else if(x<=20)
			{
				if(x==11)
					System.out.println("你抽到的是红方块Ace");
				else
				{
					x-=10;
					System.out.println("你抽到的是红方块"+x);
				}
			}
			else if(x<=30)
					{
						if(x==21)
							System.out.println("你抽到的是红心Ace");
						else
						{
							x-=20;
							System.out.println("你抽到的是红心"+x);
						}
					}
			else
			{
				if(x==31)
					System.out.println("你抽到的是黑桃Ace");
				else
				{
					x-=30;
					System.out.println("你抽到的是黑桃"+x);
				}
			}

	}
		else
		{
			x-=40;
			if(x>0&&x<=3)
			{
				if(x%3==1)
					System.out.println("你抽到的是黑梅花j");
				else if(x%3==2)
					System.out.println("你抽到的是黑梅花q");
				else
					System.out.println("你抽到的是黑梅花k");
			}
			else if(x<=6)
			{
				if(x%3==1)
					System.out.println("你抽到的是红方块j");
				else if(x%3==2)
					System.out.println("你抽到的是红方块q");
				else
					System.out.println("你抽到的是红方块k");
			}
			else if(x<=9)
			{
				if(x%3==1)
					System.out.println("你抽到的是红心j");
				else if(x%3==2)
					System.out.println("你抽到的是红心q");
				else
					System.out.println("你抽到的是红心k");
			}
			else 
			{
				if(x%3==1)
					System.out.println("你抽到的是黑桃j");
				else if(x%3==2)
					System.out.println("你抽到的是黑桃q");
				else
					System.out.println("你抽到的是黑桃k");
			}
		}

}
}
