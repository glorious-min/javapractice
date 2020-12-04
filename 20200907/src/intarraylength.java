import java.util.Scanner;

public class intarraylength {

	public static void main(String[] args) {
		int[] intarr = new int[5];
		
		Scanner sc = new Scanner(System.in);
		
	
		for (int index=0;index<intarr.length;index++) {
			System.out.println(index+1+"번쨰수를 입력하세요 ");
			intarr[index]=sc.nextInt();
		}
		
		System.out.println("배열의 길이는 "+ intarr.length);
        
		for(int i =0;i<intarr.length;i++) {
			System.out.println(intarr[i]);
		}
	}

}
