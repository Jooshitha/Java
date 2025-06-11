package array;

class calc
{
	int sum=0;
	public int add(int ... n)//here the n is treated as an array 
	{
		for(int i:n)
		{
			sum+=i;
		}
		return sum;
	}
}

public class VarArgs {

	public static void main(String[] args) {
		
			calc obj=new calc();
			obj.add(1,2,3,4,5,6,7,89,10,20,89,976,98); //These numbers are passed as an array to the method above
			System.out.println(obj.sum);
	}

}
