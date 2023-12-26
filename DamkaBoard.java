public class DamkaBoard {
	public static void main(String[] args) {
		
		int n = Integer.parseInt(args[0]);

		for (int i = 1; i <= n ;i++ ) {
			for (int j = 1; j <= n  ; j++ ) {

				System.out.print("* ");
				
			}
				if (i % 2 != 0) {
					System.out.println("");
					System.out.print(" ");

				}
				else{


					System.out.println("");
				}


		}


	}
}
