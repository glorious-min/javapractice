
public class Count2Test {

	public static void main(String[] args) {
		Count2 c1 = new Count2();
		Count2 c2 = new Count2();
		Count2 c3 = new Count2();
		
		System.out.println("c1.serialNumber"+c1.serialNumber);
		System.out.println("c2.serialNumber"+c2.serialNumber);
		System.out.println("c3.serialNumber"+c3.serialNumber);
		
		//Static ����� Ŭ���� ������ Ŭ������ �̸����� ������ �����ϴ� 
		System.out.println("Count2.count:"+Count2.counter);
		
		//�������ó�� ��ü�� �̸����ε� ������ �����ϴ� // Ŭ���� ������ ��ü������ ���� �����ϴٴ� ���ε� ?
		System.out.println("c2.counter:"+c2.counter);
	}

}
