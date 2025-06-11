package array;

public class EnhancedForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4};
		System.out.println("Array 1");
		
		for(int k:a)
		{
			System.out.print(k+" ");
		}
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		
		int b[][]= {
				{1,2,3,4},
				{3,4,5,6,7,8,9},
				{0,9,8}
		};
		System.out.println("Array 2");
		
		for(int k[]:b)
		{
			for(int i:k)
			{
				System.out.print(" "+i);
			}
			System.out.println();
		}

	}

}
