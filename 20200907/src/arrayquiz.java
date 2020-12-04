
public class arrayquiz {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // 정수형 배열 어레이를 생성하는데 크기는 50개 로 생성 
		//정수 1-100사이의 홀수를 배열에 저장하여 출력하는 코드를 작성하라 
		int[] intArr = new int[50];
		int a=0;
		int b =1;
		
		
		    while ( a>=0&&a<50     ) {
		    	intArr[a]=b;
		    	
		    	System.out.print(a+"번째 배열의 값 ");
		    	System.out.println(intArr[a]);
		    	a++;
		    	b+=2;
		    	
		    }
		
			
			
	}

}
