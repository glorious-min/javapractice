
public class FinalRef {
	static final MyDate2 date = new MyDate2();
	
	
	public static void main(String[] args) {
		//���� ������ final ����Ǿ����Ƿ� ����ÿ��� ������ �����ϴ� 
		date = new MyDate2();
		
		date.year = 1999; // �����̺� �޼ҵ忡 ���������� �����ѰͰ� ����� �ǰ� ???
		System.out.println(date.year);

	}

}
