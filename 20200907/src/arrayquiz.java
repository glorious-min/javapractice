
public class arrayquiz {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // ������ �迭 ��̸� �����ϴµ� ũ��� 50�� �� ���� 
		//���� 1-100������ Ȧ���� �迭�� �����Ͽ� ����ϴ� �ڵ带 �ۼ��϶� 
		int[] intArr = new int[50];
		int a=0;
		int b =1;
		
		
		    while ( a>=0&&a<50     ) {
		    	intArr[a]=b;
		    	
		    	System.out.print(a+"��° �迭�� �� ");
		    	System.out.println(intArr[a]);
		    	a++;
		    	b+=2;
		    	
		    }
		
			
			
	}

}
