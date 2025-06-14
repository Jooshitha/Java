package pattern;

public class DollarSquarePattern {

	public static void main(String[] args) {
		int n = 4; // size of the square

        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n; j++) {
                // print $ at borders only
                if(i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("$ ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
