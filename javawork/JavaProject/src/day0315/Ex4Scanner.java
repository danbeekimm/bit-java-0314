package day0315;

import java.util.Scanner;

public class Ex4Scanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //system.in은키보드를읽음.
		String msg="";//지역변수는 선언만하면에러남,쓰레기값이생길수있음. 초기화시켜야함.
		//class는 초기화안시켜도됨. ""나 null로.
		System.out.println("당신의 이름을 입력하세요");
		msg=sc.nextLine();//입력한 한줄을 통째로 읽어온다(문자열타입
		//msg=sc.next(); //한단어만 읽어온다.
		System.out.println("내이름은 "+msg+"입니다");
		
		int age;
		System.out.println("당신의 나이는?");
		age=sc.nextInt();//int타입으로 읽어온다.
		System.out.println(msg+"님의 나이는"+age+"세 입니다.");
		

	}

}
