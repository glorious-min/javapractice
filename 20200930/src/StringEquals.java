
public class StringEquals {

	public static void main(String[] args) {
		String s1 = new String(); 
		String s2= new String();
		
		if(s1==s2) {
			System.out.println("����");
		} else {
			System.out.println("�����ʴ�");
		}
		
		if(s1.equals(s2)) {
			System.out.println("����");
		} else {
			System.out.println("�����ʴ�");
		}

	}

}
