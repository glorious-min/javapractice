


	/**
	 * 학생의 정보와 성적을 저장하는 클래스
	 * */
	public class Student {
		
		String name;						//학생 이름
		int kor;								//국어 점수
		int eng;								//영어 점수
		int mat;
	    //멤버변수이므로 초기화 반드시 할 필요 없음 . 기본값으로 초기화 자동으로 됨 
		
		/*
		 * 메소드 이름 : setName
		 * 파라메타 : 입력받은 학생 이름 // 사용자가 어플을 실행했을때 입력한 정보가 괄호안으로 들어감 
		 * 리턴타입 : 없음
		 * 동작 : 입력받은 학생 이름을 Student객체의 학생 이름 멤버변수에 대입하시오.
		 * Student 클래스로 만들 객체의 학생이름을 
		 * */
		public void setName(String name) { // 이 메소드 실행완료후 반환값은 없다 
			this.name = name; 
		}
		
		/*
		 * 메소드 이름 : getName
		 * 파라메타 : 없음
		 * 리턴타입 : 저장된 학생 이름
		 * 동작 : Student객체에 저장된 학생 이름을 반환하시오. 
		 * */
		public String getName() {
			return this.name;
		}
		
		/*
		 * 메소드 이름 : setKor
		 * 파라메타 : 입력받은 국어 점수
		 * 리턴타입 : 없음
		 * 동작 : 입력받은 국어 점수를 Student객체의 국어 점수 멤버변수에 대입하시오.
		 * */
		public void setKor(int kor) {
			this.kor = kor;
		}
		
		/*
		 * 메소드 이름 : setEng
		 * 파라메타 : 입력받은 영어 점수
		 * 리턴타입 : 없음
		 * 동작 : 입력받은 영어 점수를 Student객체의 영어 점수 멤버변수에 대입하시오.
		 * */
		public void setEng(int eng) {
			this.eng = eng;
		}
		
		/*
		 * 메소드 이름 : setMat
		 * 파라메타 : 입력받은 수학 점수
		 * 리턴타입 : 없음
		 * 동작 : 입력받은 수학 점수를 Student객체의 수학 점수 멤버변수에 대입하시오.
		 * */
		public void setMat(int mat) {
			this.mat = mat;
		}
		
		/*
		 * 메소드 이름 : getTotal
		 * 파라메타 : 없음
		 * 리턴타입 : 국어,수학,영어 점수의 합계
		 * 동작 : 입력받은 국어,수학,영어 점수의 합계를 반환하시오.
		 * */
		public int getTotal() {
			return kor + eng + mat;
			
		}
		
		/*
		 * 메소드 이름 : getAverage
		 * 파라메타 : 없음
		 * 리턴타입 : 국어,수학,영어 점수의 평균
		 * 동작 : 입력받은 국어,수학,영어 점수의 평균를 반환하시오.
		 * */
		public double getAverage() {
			return (double)getTotal()/3;
		}
		
	}

