package week2;

import acm.program.*;

public class Fibonacci extends ConsoleProgram {

	private static int TENSTACKS = 10000;
	int x = 0;
	int y = 1;
	
	
	public void run() {
		while (x < 10000) {
			int z = x + y; 
			println(x);
			
			 x = y;
			 y = z;	
		}
	}
}
