package day0406;

import java.io.FileWriter;
import java.io.IOException;
public class Ex13FileException {
 //������ �ͼ����� ���������𸣴ϱ� ��κ� Ʈ������ġ����.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileWriter fw=null;
		try {
			//2��°������ true�� �߰����
			fw=new FileWriter("C:/bit java 0314/memo1.txt",true);
			fw.write("�̸�:������\n");
			fw.write("�ּ�:����\n");
			fw.write("--------------\n");
			System.out.println("������ Ȯ���ϼ���");
		} catch (IOException e) {  //�ͼ��ǹ߻��ϸ�����ΰ��µ� ��� �������߻��Ҹ����ξ���
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally { //���̳θ��� Ŭ�ν��ۼ�.���� �ͼ��ǻ���������
			try {
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}