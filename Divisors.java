public class Divisors {
	public static void main (String[] args) {
		int x = Integer.parseInt(args[0]);
		int potentialDevisor = 1;

		while (potentialDevisor < x+1)
		{
			if (x % potentialDevisor == 0){

				System.out.println(potentialDevisor);
			}
				

			potentialDevisor ++;


		}







	}
}
