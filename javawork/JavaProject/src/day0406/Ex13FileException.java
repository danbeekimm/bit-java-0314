package day0406;

import java.io.FileWriter;
import java.io.IOException;
public class Ex13FileException {
 //파일은 익셉션이 언제될지모르니까 대부분 트라이케치로함.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileWriter fw=null;
		try {
			//2번째인자인 true는 추가모드
			fw=new FileWriter("C:/bit java 0314/memo1.txt",true);
			fw.write("이름:최준혁\n");
			fw.write("주소:강릉\n");
			fw.write("--------------\n");
			System.out.println("파일을 확인하세요");
		} catch (IOException e) {  //익셉션발생하면밑으로가는데 사실 파일은발생할리별로없음
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally { //파이널리에 클로스작성.언제 익셉션생길지몰라서
			try {
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
