
public class quiz11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr =new int [10];
		int [] arr1 =new int[10];
		int index=0;
		int a=0; 
		arr[index]=a;
		arr1[index]=a;//�� �ΰ��� �� �ʿ� ���� // �Ʒ��� �ʱ�ȭ �Ǿ��� ������ �� �ʿ䰡 ���� 
		arr[0]=11;//������� �ʱ�ȭ�Ǿ ���� ������ 0����  �� �ʿ� ����
		arr[1]=12;
		arr[2]=13;
		arr[3]=14;
		arr[4]=25;
		arr[5]=30;
		arr[6]=54;
		arr[7]=65;
		arr[8]=68;
		arr[9]=77;
		for(index=1;index<10;index++) {
			arr1[index]=arr[index];
			
			System.out.println(arr1[index]);
		}
	}

}
