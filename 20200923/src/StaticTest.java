
public class StaticTest {
	int i = 10;
	
	public void go() {
		int i= 1;
		System.out.println(this.i);
		System.out.println(i);
		
	}
	
	public static int goStatic() {
		//this.i = 10; ���� ����
		int j = 2;// ���������� ������ �ȵ� ������ �� 
		System.out.println(j);// ��µ� 
		return j; // ����ƽ �޼ҵ� ������ ������ ���� ��ȯ�� 
	}

	public static void main(String[] args) { // ;���� �޼ҵ嵵 ���� �޼ҵ� 
		// ���θ޼ҵ忡 ��� ������ �ɰ� 
		StaticTest st = new StaticTest(); // Ŭ���� �ڽ��� ��ü ���� 
		st.go();// ����ƽ�� ������ ���� �����ؼ� ������̿��� ��� ���� // ��ü�� ������� �־ ���� ���� // 
		// ����ƽ�� �ƴ� �޼ҵ带 ����ƽ �޼ҵ� �ȿ��� ���� ������ ,�� �� ���� 
		//  �����Ѱ��� �ƴ϶� ������ ��ü�� '����' �Ѱ��̶� ����  ?������ ������ ���� ������ ?
		
		System.out.println(goStatic());
		//System.out.println(go());// �Ұ��� // ��ü�� ����� ���� �ʾƼ� ���� �Ұ��� 
	}
}
