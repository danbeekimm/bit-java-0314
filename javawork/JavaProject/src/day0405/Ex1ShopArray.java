package day0405;

public class Ex1ShopArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Shop �� �迭�� ����� �Ұ��
		Shop []shop=new Shop[3];//�޸� �Ҵ�
		shop[0]=new Shop();
		shop[1]=new Shop("����");
		shop[2]=new Shop("������", 5, 2000);
		
		//�ι�° ���
		Shop []shop2= {
			new Shop(), new Shop("�������"),new Shop("���ڷ�"),
			new Shop("�����",3,1200)
		};
		
		//���
		System.out.println("shop �� �� "+shop.length+"��");
		for(int i=0;i<shop.length;i++)
		{
			System.out.println(shop[i].getSangpum()+"\t"+
					shop[i].getSu()+"\t"+shop[i].getDan()+"\t"
					+shop[i].getResult());
		}
		
		System.out.println();
		System.out.println("shop2 �� �� "+shop2.length+"��");
		for(Shop s:shop2)
		{
			System.out.println(s.getSangpum()+"\t"+s.getSu()
			+"\t"+s.getDan()+"\t"+s.getResult());
		}
		
		System.out.println("shop2�� 2���迭���� ����");
		shop2[2].setData("�˻���", 5, 900);
		for(Shop s:shop2)
		{
			System.out.println(s.getSangpum()+"\t"+s.getSu()
			+"\t"+s.getDan()+"\t"+s.getResult());
		}
		
		
	}

}


