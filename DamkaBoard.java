public class DamkaBoard {
	public static void main(String[] args) {
				int n = Integer.parseInt(args[0]);

		for (int i = 1; i <= n ;i++ ) {


						if (i % 2 == 0) {
				for (int j = 1; j <= n  ; j++ ) {
					System.out.print(" *");
					
				}
				System.out.println("");
			}
			else{
					for (int j = 1; j <= n  ; j++ ) {
						System.out.print("* ");


				}
				System.out.println("");



		}




		}


	}
}
