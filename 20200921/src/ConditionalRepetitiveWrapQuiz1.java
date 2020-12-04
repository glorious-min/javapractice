import java.util.Scanner;

public class ConditionalRepetitiveWrapQuiz1 {

	public static void main(String[] args) {
		// 한 과목의 점수를 입력받아 학점을 구하는 프로그램을 작성하시오.
	    Scanner sc = new Scanner(System.in);
	    System.out.println("점수입력");
	    int i = sc.nextInt();
	    
	    if(i>=90&&i<=100) {
	    	System.out.println("에이입니다");
	    }
	    else if(i>=80&&i<=89) {
	    	System.out.println("비입니다");
	    }
	    else if(i>=70&&i<=79) {
	    	System.out.println("씨입니다");
	    }
	    else if (i>=60&&i<=69) {
	    	System.out.println("디입니다");
	    }
	    else {
	    	System.out.println("에프입니다");
	    }

	}

}
