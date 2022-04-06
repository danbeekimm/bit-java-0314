package day0405;

import java.util.Scanner;
//모든 클래스가 추상이면 위클래스는 굳이 추상으로안해도돼인터페이스가 더좋음
//근데 하나라도일반클래스포함되어있으면ㅁㅁ 추상으로
//인터페이스:여러개구현. 
abstract class Command{
	abstract public void process(); //프로세스추상메서드
		
		
}
	
class List extends Command
{
	@Override
	public void process() {
		// TODO Auto-generated method stub
		System.out.println("데이터출력");
	}	
}

class Add extends Command
{
	@Override
	public void process() {
		// TODO Auto-generated method stub
		System.out.println("데이터추가");
	}	
}

class Delete extends Command
{
	@Override
	public void process() {
		// TODO Auto-generated method stub
		System.out.println("데이터삭제");
	}	
}

class Update extends Command
{
	@Override
	public void process() {
		// TODO Auto-generated method stub
		System.out.println("데이터수정");
	}	
}

public class Ex8Abstract {
	public static void process(Command comm)
	{
		comm.process();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		while (true) {
			System.out.println("1.추가 2.수정 3.삭제 4.출력 5.종료");
			int n=sc.nextInt();
			if(n==5) {
				System.out.println("프로그램종료");
				break;
			}
			switch(n) {
			case 1:
			process(new Add());
			break;
			case 2:
			process(new Update());
			break;
			case 3:
			process(new Delete());
			break;
			case 4:
			process(new List());
			break;
			}
			

	}

}
}