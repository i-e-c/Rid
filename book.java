
package System;
import java.util.Scanner;

public class book {
	public int Pass (int z, int n){
		Scanner input = new Scanner(System.in);
			if(z==1){
				System.out.println("THANK YOU FOR BOOKING WITH US");
				//The user will see this alert to make them remember to reach their ride.
				System.out.println("GET ON THE BUS STOP 10 MINUTES BEFORE");
				System.out.println("DON'T MISS YOUR RIDE!");
			}
			else{
				System.out.println("YOUR BOOKING IS CANCELED ");
				System.out.println("PLEASE TRY AGAIN");
			}
			return 0;
		}

}

