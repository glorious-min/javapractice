
public class BookMain {

	public static void main(String[] args) {
		Book book1= new Book();
		
		book1.setTitle("�׸����� ���� ���� �ڹ� ");
		book1.setPage(200);
		book1.setPrice(18000);
		//�� ������ Ŭ������ ��������� �ƴ϶� ��ü�� ��������� ������ �Ǵ°� ?o
		String title = book1.getTitle();//�޼ҵ忡�� ����������
		//�׸��� ��� ���°� ??
		//å ������ ����ϴµ� ������ ���� ��� ����
		//�ʿ���� �ڵ� . �׳� ��Ÿ��Ʋ�޼ҵ带 ������Ѹ��ϰ��� �޴´ٴ°��� �ǹ��� 
		book1.printBookInfo();//�̰� �־�� ������ ��µ� 
		//����ϴ� �޼ҵ��̱� ������ �̰� �־�� å ������ ��µ� 
		
		Book book2 = new Book();
		book2.setTitle("��ó�� 2020");
		book2.setPage(570);
		book2.setPrice(23000);
		book2.printBookInfo();
		
		

	}

}
