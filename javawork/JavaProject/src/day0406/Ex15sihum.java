package day0406;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ex15sihum {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		FileReader fr=null;
		BufferedReader br=null; 
		try {
			fr=new FileReader("C:/bit java 0314/score.txt");
			br=new BufferedReader(fr); 

				String s;
				int cou=0;
				double avg = 0;
				int n;
				int tot=0;
				
				while(true) {
					s=br.readLine();
					if(s==null)
						break;
				n=Integer.parseInt(s);
					System.out.println(n);
					cou++;
					tot += n;
					avg = (double)tot/cou;
				}

				System.out.println("�Ѱ���"+cou);
				System.out.println("����:"+tot);
				System.out.println("���"+avg);
				
			
			
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
