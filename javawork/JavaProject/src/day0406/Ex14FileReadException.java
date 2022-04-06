package day0406;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ex14FileReadException {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		FileReader fr=null;
		BufferedReader br=null; //�ٴ����� �д� �޼����� ����������
		try {
			fr=new FileReader("C:bit java 0314/memo1.txt");
			br=new BufferedReader(fr); //�̰ž�������:�ٴ����д¸޼���ҷ���������
			while(true)
			{
				String s=br.readLine();//�����б�
				if(s==null)//�������ٱ��� ������ null����ȯ
					break;
				System.out.println(s);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("������ �����"+e.getMessage());
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
