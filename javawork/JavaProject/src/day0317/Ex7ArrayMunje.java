package day0317;

import java.util.Scanner;

public class Ex7ArrayMunje {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		String []members = {"강소라","이진","강호동","이효리","손미나","유재석"
				,"손철수","유미리","이제니","강민"};
		String name;// 입력받을 이름
		int cnt; //인원수 변수
		//문제: 성을입력하면 해당 성을 가진 사람을 출력하고
		//총몇명인지 출력하기
//		검색할 성:이
//		1:이진
//		3:이효리
//		8:이제니
//		총 3명
//		검색할 성 : 끝(이쿼스사용)
//		종료합니다
		
		while(true) {
			cnt=0;
			System.out.println("검색할 성:");
			name=sc.nextLine();
			if(name.equals("끝")) {
				System.out.println("프로그램종료");
				break;
			}
			for(int i=0;i< members.length;i++) {
				if(members[i].startsWith(name)) {//name해당성으로시작하면
					System.out.println(i+":"+members[i]);
					cnt++;
				}
				}
				if(cnt==0)
					System.out.println(name+"씨성은 없음");
				else
					System.out.println("총"+cnt+"명");
				System.out.println();
		}
		}
		
	}


