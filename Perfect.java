public class Perfect {
	public static void main (String[] args) {
		
		int x = Integer.parseInt(args[0]);
		int potentialDevisor = 2;
		String PositiveResult = x + " is a perfect number since " + x + " = 1";
		String NegativeResult = x + " is not a perfect number";
		int sum = 1;

		while (potentialDevisor < x)
		{
			if (x % potentialDevisor == 0){

				PositiveResult +=" + " + potentialDevisor;
				sum += potentialDevisor;
			}
				

			potentialDevisor ++;
		}
		if (sum == x) {
			
			System.out.print(PositiveResult);			
		}
		else{
			System.out.print(NegativeResult);
		}

		
}
}
//check wether the input is indeed perfect and execute accordingly