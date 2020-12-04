import java.util.Scanner;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //문자열을 저장하는 법 
	    Scanner sc = new Scanner(System.in);
	    
	    
		int num; // 정수변수를 선언 
		String str; 
		System.out.println("정수를 입력해 주세요 ");
		//문자열 변수를 선언//기초바료형이 아닌 참조자료형임
		// 그냥 참고<차이점 >
		//= 기초자료형 = 생겨난 상자에 값이 들어감 
		//"값이 대입된다 '
		//참조자료형  스트링 - 문자열이 다른 공간에 있고 그 공간의 주소값이 만들어진 공간에 들어가게됨 
		//값이 아닌 값을 가지고 있는 위치를 가지고 있는 것 !!
		
		System.out.println("정수 입력 ");
		num= sc.nextInt(); 
		
		System.out.println("문자열 입력 ");
		str =sc.nextLine() ; // 엔터가 쳐져야 입력이 끝났다고 
		sc.nextLine();
		
		
		
		
	}

}
