import java.util.Random;

public class RandomTest {

	public static void main(String[] args) {
		String[] sarray= new String[5];
		sarray[0] = "�ǿ���";
		sarray[1]="�赿��";
		sarray[2]="����";
		sarray[3]="������";
		sarray[4]="��μ�";
		
		
		// ������ �߻���Ű�� !!
		Random ran = new Random();
		//0-4������ ���� ���� �߻���Ű�� 
		int num = ran.nextInt(5); // ������ ��Ʈ�� ���� �߻��� //��������
		//0���� ��ȣ�ȿ� �Է��� ������ 1���� ������ �����ϰ� �߻� 
		//1-5���� ������ ���ڸ� �߻���Ű�� �ڵ� 
		//int num = ran.nextInt(5)+1;
		System.out.println(sarray[num]);
	}

}
