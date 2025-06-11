/**
 * Inner class types:
 * 	-> Member class
 * 	-> static class
 * 	-> anonymous class
 */

package innerClassDemo;

class outer
{
	int a=9,b=10;
	public void show()
	{
		System.out.println("From outer"+a);
	}
	
	class inner //member class
	{
		public void display()
		{
			System.out.println("From inner"+b);
		}
	}
	static class staticInner //static class
	{
		public void output()
		{
			System.out.println("From static method");
		}
	}
}

public class InnerClassDemo {

	public static void main(String[] args) {
		
			outer obj=new outer();
			obj.show();
			
			outer.inner obj1=obj.new inner(); //This is how Inner class is used and object is created
			obj1.display();
			
			outer.staticInner obj2=new outer.staticInner();//Static class don't require object of main class to create object of static class 
			obj2.output();
	}

}
