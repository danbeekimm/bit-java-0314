package day0315;

import java.util.Scanner;

public class Ex2Munje {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a;
		int b;
		int c;
		int max;
		
		System.out.println("���ڸ� �Է��Ͻÿ�");
		
		
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
//		max = (a > b)? a : b;
//		max= (c>max)?c:max;
		max=a>b&&a>c?a:b>a&&b>c?b:c;
		System.out.printf("3�� �ִ��� %d\n �Դϴ�.",max);

}
}