package day0406;

public class Ex7Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {4,6,7,8};
		for(int i=0;i<=arr.length;i++)
		{
			try {
				System.out.println(arr[i]);
			}catch (ArrayIndexOutOfBoundsException e) {
				//e.printStackTrace(); : 에러메세지 추적해서확인 라인번호까지알고싶으면이거해야됌
				System.out.println("배열오류:"+e.getMessage()); //에러메세지임
			}
		}
		System.out.println("***정상종료***");

	}

}
