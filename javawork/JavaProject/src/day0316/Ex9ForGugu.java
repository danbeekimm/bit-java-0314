
package day0316;

import java.util.Scanner;

public class Ex9ForGugu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int dan=2; dan<10;dan++) {
			System.out.print("["+dan+"��]\t");
		}
			System.out.println("\n");
			for(int j=1; j<10;j++)
			{
				
			
			
				for(int dan=2; dan<10;dan++)
			{
				System.out.print(dan+"x"+j+"="+dan*j+"\t");
			}
			System.out.println();
		}
	}

}
