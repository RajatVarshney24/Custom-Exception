// custom exception
// Declaring of custom Exception 
/*class myexception extends Exception
{
	myexception(String par)
	{
	super();
	}
}*/
//Example
class AgeException extends Exception
{
	AgeException(String arg)
	{
	super(arg);	
	}
}
class age
{
	void getage(int age)throws AgeException
	{
		if(age<18)
		{
		throw new AgeException("invalid age");
		}
		else
		{
		System.out.println("valid age");
		}
	}
public static void main(String...s)
{
age a = new age();
try
{
a.getage(10);
}
catch(AgeException e)
{
System.out.println(e);
}}
}