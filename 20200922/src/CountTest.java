
public class CountTest {

	public static void main(String[] args) {
		Count c1 = new Count(); // ī��Ʈ Ŭ���� ������ ����� ��ü ����⵵���� 0 �� ������ �־��� 
		// c1�� ��������鼭 ī���Ͱ� 0���� 1�� ������ �׸��� �̸� ������ѹ��� �ֱ� 
		Count c2 = new Count(); // c2 ����� ī���Ͱ� �ٽ� 1���� �̴� Ŭ������ ������ ������ 2�� ������ 
		//c2�� �ø���ѹ��� 2���� 
		Count c3 = new Count();
		//c3�� �ø��� �ѹ� 3�̵� 
		//�ø���ѹ� = ������� = ����ü�� ����  ���� 
		System.out.println("c1.serialNumber :" + c1.serialNumber);
        System.out.println("c2.serialNumber :" + c2.serialNumber);
        System.out.println("c3.serialNumber :" + c3.serialNumber);
		
		System.out.println("Count.counter:"+Count.counter);
		System.out.println("c2.counter:" + c2.counter);
	}

}
