import java.util.Scanner;

public class HassadNumber {

	public static void main(String[] args) {
	 Scanner sc = new Scanner (System.in);
	 System.out.println("하샤드의 수를 입력해 주세요");
	 int X = sc.nextInt();
	 int sum=0;
	 int a =X; // 사용자가 입력하는 수를 일단 보호해주어야한다. 이의 나머지와 몫을 구하는 과정에서 값이 변화하기 때문임 !!!
	
	 while (a>0) {
		sum+=a%10;
		a/=10;
		//System.out.println(sum);
		//System.out.println(a);
		
	 }
	
	 if(X%sum==0) { // a는 변하는 값 ㅋㅋㅋㅋ 사용자가 입력한 수로 판별을 해야하므로  X로 바꾸어야 한다 ! 
		 System.out.println("참");
	 }
	 else {
		 System.out.println("거짓");
	 }
    
	}

}
