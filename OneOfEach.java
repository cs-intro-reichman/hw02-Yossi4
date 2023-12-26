import java.util.*;
public class OneOfEach {
	public static void main (String[] args) {

		boolean boyWasBorn = false;//1
		boolean girlWasBorn = false;//0
		int childrenCounter = 1;

		int sexIndicator = (int) (Math.random() *2);
		
		if (sexIndicator == 1) {
				System.out.print("b ");
				boyWasBorn = true;
			}
		else
			{
				System.out.print("g ");
				girlWasBorn = true;


			}

		while (boyWasBorn != girlWasBorn )
		{
			sexIndicator = (int) (Math.random() *2);
			if (sexIndicator == 1) {
				System.out.print("b ");
				boyWasBorn = true;
			}
			else
			{
				System.out.print("g ");
				girlWasBorn = true;


			}
			childrenCounter ++;


		}

		System.out.println("");
		System.out.print("You made it... and you now have " + childrenCounter + " children.");

		




		}
}
