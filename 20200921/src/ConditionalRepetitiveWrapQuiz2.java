import java.util.Scanner;

public class ConditionalRepetitiveWrapQuiz2 {

	public static void main(String[] args) {
		// 두개의 정수를 입력받고 실행하고자 하는 연산을 입력 받아서 연산을 완성하는 코드를 작성하시오.
		//스위치문 작성법 잊어버리지 말기 !!
		Scanner sc = new Scanner(System.in);
	    System.out.println("첫번쨰 수 입력 ");
		int i = sc.nextInt();
		System.out.println("두번째수 입력");
		int j = sc.nextInt();
		System.out.println("=========");
		System.out.println("메뉴선택 : ");
		int num=sc.nextInt();
		switch(num) {
		case 1 : 
		     System.out.println(i+j);
		     break;
		case 2 : 
		     System.out.println(i-j);
		case 3 :
			System.out.println(i*j);
		case 4 :
			System.out.println((double)i/j);
			
		
		}

	}

}
