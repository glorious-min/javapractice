import java.util.Scanner;

public class Caltest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 클래스를 이용해 인스턴스 생성 
		Cal calculator = new Cal(); // 설계서의 정보들을 담고 있는 객체가 만들어진것 
		//생성된 인스턴스의 메서드를 호출 
		
		System.out.println("num1 입력");
		int num1 = sc.nextInt();
		System.out.println("num2 입력");
		int num2 = sc.nextInt();
		int sum = calculator.plus(num1,num2);// 반환되는 값이 sum 으로 들어가게 된다 
		// int sum = 반환되는 값 인셈 !!! 
	    System.out.println("plus메소드실행결과"+sum);
		
	    int result = calculator.minus(num1, num2); // 리턴되어서 리턴된 값이 오른쪽 대신 들어옴 
	    System.out.println("minus 실행결과 "+result);
	    //System.out.println(" 실행결과 "+calculator.minus(num1, num2)); 라고 쓸수고 있음 하지만 잘 쓰이지는 않음 
	    //가독성이 떨어짐 
	    
	    double conclude = calculator.devide(num1,num2); // result를 다른 이름으로 바꾸어야 실행됨 
	    //오류났던것 = 변수명 중복 
	    System.out.println("devide 실행결과"+result);
	    
	    System.out.println("어떤 계산을 할까요 ? ");
	    String op = sc.nextLine();
	    sc.nextLine(); // 이걸 넣어야 정상 도착함 
	    
	    if(op.equals("+")) {
	    	System.out.println(num1 + "+" + num2 + "=");
	    	System.out.println(cal.plus(num1,num2));
	    }  else if(op.equals("-")) {
	    	System.out.println(num1+op+num2 + "=");
	    	System.out.println(cal.minus(num1,num2));
	    }
	    
	    else {
	    	System.out.println("연산자를 잘못입력했습니다");
	    }
	}
	
	   

}
