
public class FinalVar2 {

	final int i =9;
	
	public void go() {
		//final Ű���尡 ���� ������ ����ÿ��� �ʱ�ȭ�� ���� 
		//i =10; //error
		System.out.println(i);
		}
	
	public static void main(String[] args) {
		FinalVar2 fv = new FinalVar2();
		fv.go(); //��ü���� go() �޼ҵ�f ȣ�� 

	}

}
