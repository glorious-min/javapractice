
public class CountTest {

	public static void main(String[] args) {
		System.out.println(Count.counter);
		Count c1 = new Count();
		Count c2 = new Count();
		Count c3 = new Count();
		
		System.out.println(c1.serialNumber);
		System.out.println(c2.serialNumber);
		System.out.println(c3.serialNumber);
		
		System.out.println(c1.counter);//c1�̶�� ��ü������ ī���� ������ Ŭ�������� �̱⋚���� ������ ���� ���� �����Ѵ� \
		//���� c3��ü�� ��������� ���� �� 3�� �״�� ������ �ִ� ���� 
		System.out.println(c2.counter);
	}

}
