package the_three;

public class three_24 {

	public static void main(String[] args) {
		int x=(int)(1+Math.random()*53);
		if(x>0&&x<=40)
		{
			if(x<=10)
			{
				if(x==1)
					System.out.println("��鵽���Ǻ�÷��Ace");
				else
					System.out.println("��鵽���Ǻ�÷��"+x);
			}
			else if(x<=20)
			{
				if(x==11)
					System.out.println("��鵽���Ǻ췽��Ace");
				else
				{
					x-=10;
					System.out.println("��鵽���Ǻ췽��"+x);
				}
			}
			else if(x<=30)
					{
						if(x==21)
							System.out.println("��鵽���Ǻ���Ace");
						else
						{
							x-=20;
							System.out.println("��鵽���Ǻ���"+x);
						}
					}
			else
			{
				if(x==31)
					System.out.println("��鵽���Ǻ���Ace");
				else
				{
					x-=30;
					System.out.println("��鵽���Ǻ���"+x);
				}
			}

	}
		else
		{
			x-=40;
			if(x>0&&x<=3)
			{
				if(x%3==1)
					System.out.println("��鵽���Ǻ�÷��j");
				else if(x%3==2)
					System.out.println("��鵽���Ǻ�÷��q");
				else
					System.out.println("��鵽���Ǻ�÷��k");
			}
			else if(x<=6)
			{
				if(x%3==1)
					System.out.println("��鵽���Ǻ췽��j");
				else if(x%3==2)
					System.out.println("��鵽���Ǻ췽��q");
				else
					System.out.println("��鵽���Ǻ췽��k");
			}
			else if(x<=9)
			{
				if(x%3==1)
					System.out.println("��鵽���Ǻ���j");
				else if(x%3==2)
					System.out.println("��鵽���Ǻ���q");
				else
					System.out.println("��鵽���Ǻ���k");
			}
			else 
			{
				if(x%3==1)
					System.out.println("��鵽���Ǻ���j");
				else if(x%3==2)
					System.out.println("��鵽���Ǻ���q");
				else
					System.out.println("��鵽���Ǻ���k");
			}
		}

}
}
