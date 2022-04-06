package day0406;

import java.util.Scanner;

//사용자 예외 클래스구현
//throw throws차이 
class UserException extends Exception
{
	public UserException(String msg) {
		super (msg);//예외 메세지로 등록
	}
}
public class Ex11UserException {

	public static void writeContent(String msg) throws UserException //유저익셉션은던진다 호출하는곳에서처리하렴
	{
		if(msg.contains("바보") || msg.contains("멍청")) //둘중하나포함되어있다면
			throw new UserException("고운말을씁시다!!"); //강제로 유저익셉션시행
		else
			System.out.println("메세지:"+msg);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//여기서호출
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			System.out.println("아무문장이나 입력하시오");
			String msg=sc.nextLine();
			if(msg.equals("끝"))
				break;
			try {
				writeContent(msg); //위에 writecontent로 보내기
			}catch (UserException e) {
				System.out.println("오류메세지:"+e.getMessage());
			}
		}
		System.out.println("**정상종료 **");
	}

}
