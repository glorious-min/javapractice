
public class AccessModifierTest {

	public static void main(String[] args) {
		AccessModifier am = new AccessModifier(); 
		am.age =30 ; //age ������ ���ؼ� ���� ������ �Ұ��� 
		//�̰� ������ �����̾� Ŭ������ age ������°� ��� ���� ??
		//������ ������̾� Ŭ������ ��ü��°��� 5���� �ٿ��� ���� 
		//�� Ŭ���������� ���� ���� ������ ���� �ʾұ� ������ ���⿡���� age �� ������ ������̾� Ŭ������ ������ �����µ� 
		//���࿡ ������ �̸����� ������ �����Ѵٸ� ��� �ɱ� ??
		int geAge = am.getAge();//getAge()�޼ҵ�� ��𿡼��� ���� ���� 

	}

}
