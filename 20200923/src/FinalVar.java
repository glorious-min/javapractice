
public class FinalVar {
	final int i = 9; // �� i�� final �پ ����� �� 9�� �ʱ�ȭ�Ǿ� �ٲ����ʴ´�
	
	public static final String GENDERCODE = "M01";
	//����ƽ ���� ���̳� ������ �ʴ� ���ڿ� ���������� �ְ� ���� ���� �� ������ �ʴ� ���ڿ�
	//�빮�� - ����ƽ ���̳� ������ �빮�ڷ� ���´� . ����� ǥ�� 
	//���뺯���� �ʴµ� ��ӻ���ؾ��ϴ� ��� �̷��� ���� 
	//FianlVar.GENDRCODE  ���ϸ� ������ �ʴ� ���� ��� ��� ���� - 
	//�������������� �������ϴ� Ư�� �������鿡�� �ڵ�ȭ�ؼ� ��밡�� �Ź� ����°� �ƴ� �ѹ� ����� �������� ����ϤѤ��� 
	
	public void go() {
		//fianl �� ���� ������ ����ÿ��� �ʱ�ȭ�� �����ϴ� 
		i=10; // ���� ������ �� �� ���� 
		System.out.println(i);
	}
	public static void main(String[] args) {
		FinalVar fv = new FinalVar();
		fv.go();

	}

}
