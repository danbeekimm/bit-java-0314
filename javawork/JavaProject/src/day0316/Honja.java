package day0316;

import java.util.Scanner;

public class Honja {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//������ �����
		for (int dan=2; dan<10; dan++) {
			System.out.print("["+dan+"��]\t");}
			System.out.println("\n");
			for (int dan=2; dan<10; dan++) {
			for (int j=1; j<10; j++) {
				System.out.print(dan+"*"+j+"="+(dan*j)+"\t");
			}System.out.println();
			}
	}

}