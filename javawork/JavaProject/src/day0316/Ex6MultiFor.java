package day0316;

public class Ex6MultiFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int a=1;a<=3;a++) {
			System.out.println("Hello");
			for(int b=1;b<=4;b++) {
				System.out.print("\tkitty!!");
			}
			System.out.println("******");
		}
		System.out.println("____________________");
		for (int a=1;a<=4;a++) {
			System.out.println("Hello");
			for(int b=1;b<=4;b++) {
				System.out.print("\tkitty!!");
				if(b==2)
					break;
			}
			System.out.println("******");
	}
		System.out.println("____________________");
		Loop:
		for (int a=1;a<=3;a++) {
			System.out.println("Hello");
			for(int b=1;b<=4;b++) {
				System.out.print("\tkitty!!");
				if(b==2)
					break Loop;//break 레이블;//바깥쪽반복문 빠져나옴.
			}
			System.out.println("******");
		}
	}
}
