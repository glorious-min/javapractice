
public class Cal {

	//1. 더하기 
	public int plus(int num1 , int num2) { //리턴가능
	
	int result = num1+num2;
	return result;
	}
	
	public int minus(int num1 , int num2 ) { // 여기에서 값을 받고 
		
		int result = num1 -num2; // 매개변수끼리 더하기  // 여기에서 처리하고 
		return result; //여기에서 반환한다 
		//return = num1 -num2 로도 바꿀수 있다 ! 메소드 호출한곳으로 보냄 
		// 리절트 값의 데이터를 minus(메소드를 부른곳으로) 로보낸다 
		
	}
	
	public int multiple (int num1 , int num2) {
		int result = num1*num2;
		return result;// 인트자료형은 리턴을 반드시 해야한다 
	}
	
	
	
	public double devide (int num1 , int num2 ) {
		double result = 0.0;
		if(num2 == 0)
			System.out.println("0으로 나눌수 없습니다");
		else {
		result = ((double)num1)/((double)num2);
		//double result = ((double)num1)/ num2 ; 도 가능함 ! 
		//double temp = (double)(num1/num2) 로하면 안됨 
		// 형변환 먼저하고 계산을 해야한다
		}
		return result; 
				
	}
}
