package day0406;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ex14FileReadException {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		FileReader fr=null;
		BufferedReader br=null; //줄단위로 읽는 메서들을 가지고잇음
		try {
			fr=new FileReader("C:bit java 0314/memo1.txt");
			br=new BufferedReader(fr); //이거쓰는이유:줄단위읽는메서드불러오기위해
			while(true)
			{
				String s=br.readLine();//한줄읽기
				if(s==null)//마지막줄까지 읽으면 null값반환
					break;
				System.out.println(s);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("파일이 없어요"+e.getMessage());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
				
		}finally {
			try {
				if(br!=null) br.close();
				if(fr!=null) fr.close();
				
			}catch (IOException e) {
				
			}
		}
		
	}

}
