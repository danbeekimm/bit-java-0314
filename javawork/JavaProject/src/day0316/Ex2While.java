package day0316;

public class Ex2While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=65;
		while(true) {
			System.out.print((char)a);
			a++;
			if(a>=91)
				break;
		}
		System.out.println();
		
		int c = 65;
		while(true) {
			System.out.print((char)c);
			c++;
			if(c>=91)
				break;
		}System.out.println();
		
		
		
		
		char b='A';
		while(true) {
			System.out.print(b++);
			if(b>'Z')
				break;
			
		}
		System.out.println();
	}

}
