package day0317;

import java.util.Scanner;

public class Ex8ArrayMunje {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//검색할 이름:이진
		//이진님은 2번째에 있습니다
		//검색할이름:이준희
		// 이준희님은 명단에 없습니다.
		//exit 쓰면 검색을 종료합니다.
		Scanner sc= new Scanner(System.in);

		String []members = {"강소라","이진","강호동","이효리","손미나","유재석"
				,"손철수","유미리","이제니","강민"};
		String name;// 입력받을 이름
		int cnt; 

		while (true) {
			cnt=0;
			System.out.print("검색할 이름:");
			name = sc.nextLine();
			if(name.equalsIgnoreCase("exit")) {//대소문자상관없음
				System.out.println("프로그램종료");
				break;}

			for(int i=0;i<members.length;i++) {
				if(name.equals(members[i])) {//이름이 멤버스와 같으면
					System.out.println("\t"+name+"님은"+(i+1)+"번째에 있습니다.");
					cnt=1;
					break;
				}

			}
			if (cnt==0) {
				System.out.println("\t"+name+"은 명단에 없습니다.");
			}

		}

	}
}

	

