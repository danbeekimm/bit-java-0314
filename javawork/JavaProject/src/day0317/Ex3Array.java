package day0317;

public class Ex3Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[]ch;
		ch=new char[4];
		System.out.println("length="+ch.length);
		System.out.println("초기값출력");
		for(int i=0; i<ch.length;i++) {
			System.out.println((int)ch[i]);
		}
		
		ch[0]='A';
		ch[1]=67;
		ch[2]=90;
		ch[3]='*';
		
		System.out.println("배열출력방법1");
		for(int i=0; i<ch.length; i++) {
			System.out.printf("%3c",ch[i]);
		}
		System.out.println("\n배열출력방법2");
		for(char a:ch)//a에 숫자들어가면서출력됨
			System.out.printf("%3c",a);
	}

}
