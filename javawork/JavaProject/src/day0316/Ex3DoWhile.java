
package day0316;

public class Ex3DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0;
		
		System.out.println("while��");
		while(a<10) {
			System.out.println(a++);
		}
//		
//		a=10;
//		do {
//			System.out.println(a++);
//		}while(a<10);
////		
		
		
		
		a=10;
		System.out.println("do~while��");
		do {
			System.out.println(a++);
		}while(a<10);
		
		System.out.println("---------------");
		
		
		System.out.println("1����100���� �հ�");
		a=0;
		int sum=0;
		while(++a<=100) {
			sum+=a;
		}
		System.out.println("���հ�:"+sum);
		
		
		a=0;
		int esum=0,osum=0; //esum�� ¦����. osum�� Ȧ����
		System.out.println("1~100���� ¦����, Ȧ���� ���ϱ�");
		while(++a<=100) {
			if (a%2==0)
				esum+=a;
			else osum +=a;
		}
		System.out.println("¦����:"+esum+"Ȧ����:"+osum);
	}
}
