package lab9;

import java.util.Scanner;

public class excep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner obj=new Scanner(System.in);
char s=0;
do
{
	System.out.println("enter number");
	int a=obj.nextInt();
	switch(a)
	{
   	case 1:
   	{
   		try
   		{
   			System.out.println("enter the number");
   			int b=Integer.parseInt(obj.next());
   			System.out.println("enter the number");
   			int c=Integer.parseInt(obj.next());
   			System.out.println(b/c);
   		}
      catch(ArithmeticException e)
   		{
    	  System.out.println(e);
   		}
   		break;
   	}
    
   	case 2:
   	{
   		try
   		{
   			int d[]=new int[5];
   			System.out.println("enter the number to insert");
   			int w=obj.nextInt();
   			for(int i:d)
   			{
   				d[i]=obj.nextInt();
   			}
   			for(int i:d)
   			{
   			System.out.println(d[i]);
   		}
   		}
      catch(ArrayIndexOutOfBoundsException e)
   		{
    	  System.out.println(e);
   		}
   		break;
   	}
   	case 3:
   	{
   		try
   		{
   			System.out.println("enter the number");
   			int b=Integer.parseInt(obj.next());
   			System.out.println("enter the number");
   			int c=Integer.parseInt(obj.next());
   			
   		}
      catch(NumberFormatException n)
   		{
    	  System.out.println(n);
   		}
   		break;
   	}	
   	case 4:
   	{
   		try
   		{
   			String s1=new String("helloworld");
   		    System.out.println(s1.substring(12));
   		}
   		catch(Exception k)
   		{
   			System.out.println(k);
   			
   		}
   	break;
   	}
   	default:
   	{
   		System.out.println("invalid number");
   		
   	}
	}
	System.out.println("enter y to continue");
	s=obj.next().charAt(0);
}while(s=='y'||s=='Y');
	}

}
