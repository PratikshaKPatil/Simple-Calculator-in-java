import java.util.*;
class cal
{
	public static void main(String args[])
	{
		calculator x=new calculator();
		x.input();
		x.disp();
		x.operations();
	}
}

class calculator
{
	private int a,b,c=0,choice;
	
	calculator()
	{
		a=b=1;
	}
	calculator(int n)
	{
		a=b=n;
	}
	calculator(int m,int n)
	{
		a=m;
		b=n;
	}
	 void input()
	 {
		 Scanner scan =new Scanner(System.in);
		 System.out.println("enter two no's:");
		 a=scan.nextInt();
		 b=scan.nextInt();
	 }
	 void disp()
	 {
		 System.out.println("result=" +c);
	 }
	 void operations()
	 {
		 Scanner scan =new Scanner(System.in);
		 System.out.println("enter choices");
		 System.out.println("press\n1.add\n2.sub\n3.div\n4.mult");
		 choice=scan.nextInt();
		 switch(choice)
		 {
			 case 1:c=a+b;
			        disp();
					break;
			 case 2:c=a-b;
			        disp();
	         		break;
			 case 3: if(b==0)
				     System.out.println("div not possible");
				     else
						 c=a/b;
					 disp();break;
			 case 4:c=a*b;
			        disp();
					break;
			 default:System.out.println("invalid choices");
		 }
	 }
					
	 }

		 
