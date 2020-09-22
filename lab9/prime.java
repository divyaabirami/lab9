package lab9;

public class prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int a=Integer.parseInt(args[0]);
    int b=Integer.parseInt(args[1]);
    try
    {
    	primenumber obj=new primenumber();
    	obj.display(a, b);
    	obj.validity(a, b);
    }
    catch(checkingvalidexception e)
    {
    	System.out.println(e);
    }
	}

}
class primenumber
{
	void display(int a,int b) throws checkingvalidexception
	{
		for(int i=a;i<=b;i++)
		{
			int counter=0;
			for(int j=a;j<=b;j++)
			{
				if((i%j)==0)
				{
					counter=counter+1;
				}
			}
			if(counter==2)
			{
				System.out.println(i);
			}
		}
	}
	void validity(int a,int b) throws checkingvalidexception
	{
		if((a<=0 || b<=0)&&(a>b))
		{
			throw new checkingvalidexception("invalid input");
		}
	}
}
class checkingvalidexception extends Exception
{
	checkingvalidexception(String str)
	{
		super(str);
	}
}