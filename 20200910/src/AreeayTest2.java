
public class AreeayTest2 {

	public static void main(String[] args) {
		// ������ �迭�� ����� ���� 
		int [][] iarrays = new int[3][5];
		//�迭�� ���� �Ӽ��� �̿��Ͽ� �����迭�� ��ȸ�ϸ鼭 ���� �ʱ�ȭ �Ѵ� .
		int initval = 0 ; //���ݹ迭�� ���� ���� ������ �ִ� ���� 
		for (int i=0;i<iarrays.length;i++) {
			for(int j = 0; i <iarrays[i].length;j++) {
				iarrays[i][j] = initval++;
			}
		}
//�����迭�� ��ȸ�ϸ鼭 ���� ��� 
	 for(int i =0;i<iarrays.length;i++) {
		 for(int j=0;j<iarrays[i].length;j++) {
			 System.out.println("["+i+"]["+j+"]:"+
			 		+ iarrays[i][j]);
		 System.out.println("\t");
		 }
		 System.out.println();
		 
	 }
	}

}
