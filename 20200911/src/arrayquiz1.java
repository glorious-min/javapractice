
public class arrayquiz1 {

	
	public static void main(String[] args) {
		int[] arr = { 5, 3, 8, 1 };
		int i,j,temp;
       /*System.out.println("정렬전");
        for(i=0;i<arr.length;i++) {
        	System.out.println("\t"+arr[i]);
        }
        System.out.println();*/
        
		
        for(i=0;i<arr.length;i++) {
        	for(j=0;j<arr.length-1-i;j++) {
        		//이미 끝난 뒷부분은 하든 안하든 상관 없으니까 이렇게 하기 !!
                //?-i를 하던 안하던 값이 같게 나온다 ?
        		if(arr[j]>arr[j+1]) {
        			temp=arr[j+1];
        			arr[j+1] = arr[j];
        			arr[j] = temp;
        		}
        	}      	
        }
        System.out.println("정렬후");
        for(i=0;i<arr.length;i++) {
        	
        	System.out.println(arr[i]);
        }
	}
}
//마지막 페이스가 실행되지 않은채로 결과가 출력됨 