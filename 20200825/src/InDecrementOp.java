import java.util.Scanner;

public class InDecrementOp {

	public static void main(String[] args) {
	//스캐너를 사용하기 위해서는 import해야함 
		//scanner는 키보드를 통해 입력한 내용을 자바에서 사용할 수 있도록 도와주는 객체 
		//sc는 객체의 명칭 - scnner 사용하기 위한 이름 마음대로 정해도 된다 
	   //new- 생성의 의미 
		//scanner () 생성자, new와 함께쓰임 
		//new scanner() - "생성자를 실행해서 객체를 생성한다 "
		
		Scanner sc = new Scanner(System.in);//스캐너 객체 생성
		System.out.print("숫자를 입력해 주세요 .");
		
	int cnt = sc.nextInt(); // int형의 값을 입력 받겠다
	//콘솔에 20을 입력후 엔터 (입력끝 표시 ) 를 해 20이 cnt에 대입됨 
       //int cnt = 10;
		
       
       System.out.println("cnt : " + cnt);
       
      System.out.println("cnt ++ : " + cnt++);
      System.out.println("cnt++ 처리후 :" + cnt);
      System.out.println("++cnt : " + ++cnt);
      
      System.out.println(++cnt + cnt++);
      
	}

}
