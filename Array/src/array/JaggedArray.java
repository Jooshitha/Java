package array;

public class JaggedArray {

	public static void main(String[] args) {
		int d[][]=
			{
					{1,2,3,4},
					{1,2},
					{1,2,3,4,5}
			};
		
		for(int i=0;i<d.length;i++)
		{
			for(int j=0;j<d[i].length;j++)
			{
				System.out.print(" "+d[i][j]);
			}
			System.out.println();
		}

	}

}
