
public class SttringEquals {

	public static void main(String[] args) {
		String s1 = new String("Hello");
		String s2 = new String("Hello");
		
		if(s1==s2) {
			System.out.println("s1�� s2�� ����");
		} else {
			System.out.println("s1�� s2�� ���� �ʴ� ");
		}
		
		if(s1.contentEquals(s2)) {
			System.out.println("s1�� s2�� ����");
		} else {
			System.out.println("s1�� s2�� ���� �ʴ�");
		}
	
	}

}
