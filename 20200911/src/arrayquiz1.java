
public class arrayquiz1 {

	
	public static void main(String[] args) {
		int[] arr = { 5, 3, 8, 1 };
		int i,j,temp;
       /*System.out.println("������");
        for(i=0;i<arr.length;i++) {
        	System.out.println("\t"+arr[i]);
        }
        System.out.println();*/
        
		
        for(i=0;i<arr.length;i++) {
        	for(j=0;j<arr.length-1-i;j++) {
        		//�̹� ���� �޺κ��� �ϵ� ���ϵ� ��� �����ϱ� �̷��� �ϱ� !!
                //?-i�� �ϴ� ���ϴ� ���� ���� ���´� ?
        		if(arr[j]>arr[j+1]) {
        			temp=arr[j+1];
        			arr[j+1] = arr[j];
        			arr[j] = temp;
        		}
        	}      	
        }
        System.out.println("������");
        for(i=0;i<arr.length;i++) {
        	
        	System.out.println(arr[i]);
        }
	}
}
//������ ���̽��� ������� ����ä�� ����� ��µ� 