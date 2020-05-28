abstract  class Abc
{
   abstract void display();
   void result()
   {
   	System.out.println("hey this is me");
   } 
}
 class Abstract extends Abc
{  
	void display()
	{

		System.out.println("this is your abstract class");

	}

}
class Main
{
	public static void main(String [] args)
	{
		Abstract a = new Abstract();
		a.display();
		a.result();

	}
}