
public class Count {

	public int serialNumber; // ������� 1�̵� 
	public static int counter = 0 ; 
	
	public Count() { // �Ķ���� ��� ���� �������� �ؾ��ϴ� ����� ���� 
		counter++;
		serialNumber = counter; // count�� ������Ų�� ���� 

	}

}
