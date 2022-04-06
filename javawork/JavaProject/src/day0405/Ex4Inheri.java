package day0405;

class Color{
	private String colorName;
	
	Color()
	{
//		System.out.println("super 디폴트 생성자");
	}
	Color(String colorName)
	{
		this.colorName=colorName;
//		System.out.println("super 2번째 생성자");
	}
	//출력하는 메서드
	public void write() {
		System.out.println("자동차색"+colorName);
	}
}
class Red extends Color
{
	private String myCar;
	
	Red()
	{
//		super("노랑");// 생략되어있음 , 부모의 디폴트 생성ㅇ자 호출
		//인자가있는 생성자는 생략안됨("노랑"), 반드시첫줄
//		System.out.println("sub 디폴트 생성자");
	}
	Red (String myCar,String colorName)

	{
			super(colorName);
			this.myCar=myCar;
			}
	@Override //부모와 똑같은형식으로만져짐
	public void write() {
		// TODO Auto-generated method stub
		super.write(); //
		//순서상관없고 먼저 일처리시 쓰고부모의 write를 가져옴 this시 계속 자기꺼가져옴무한정
	System.out.println("내차이름:"+myCar);
	
	
	}
}
public class Ex4Inheri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Red r1=new Red();
		r1.write(); //부모의 롸이트를가져옴 근데내께잇으면 내껄가져옴
		
		System.out.println("=====================");
		Red r2=new Red("소나타","진주펄색");
		r2.write();
	}

}
