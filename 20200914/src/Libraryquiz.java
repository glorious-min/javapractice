
public class Libraryquiz {

	public static void main(String[] args) {
		int day=1;
		int reader = 2;//�� �κ��� ���� ����
		int rest = 300000; // ����å�� �� 
		
		
		while(rest>0) {
			day+=1;// �̰�  while�� �� �ǵڿ� �θ� 90 ���� �ƴ϶� 91 �̶�� ���´� ?
			//��ġ ��¥ �����ϱ� !!!!!!
			rest = rest-reader*30; // 
			if(day%10==0) {
				reader*=2;
			}
			
		}
             System.out.println("�ɸ��� ����"+day+"�׶��� �ο�����"+reader);
	}
//�� �ɸ��� ���� 91 �̶�� ������ ??
}
