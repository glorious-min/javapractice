import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		// 사용자로부터 입력받기 위한 스캐너 객체
		Scanner sc = new Scanner(System.in);

		// 최대 10명의 학생의 정보를 저장할 학생객체 배열 생성
		Student[] sArray = new Student[10];

		String name;
		int kor, eng, mat;
		int menu;
		int count = 0; // 배열에 저장된 객체개수

		// 반복해서 입력받기 위한 반복문

		while (true) {
			// 화면에 출력할 메뉴
			System.out.println("================");
			System.out.println("1.등록");
			System.out.println("2.출력");
			System.out.println("0.종료");
			System.out.println("================");
			// 메뉴번호 입력받기
			System.out.print("메뉴를 입력하세요 ");
			menu = sc.nextInt();

			// 입력받은 메뉴번호에따라서 동작이 되도록 스위치문 작성
			switch (menu) {
			case 1:
				// 문자열 입력을 위해 스캐너 객체 비워두기
				sc.nextLine();

				System.out.println("[학생 정보 입력]");
				System.out.println("학생이름 :");
				name = sc.nextLine();
				System.out.println("국어점수:");
				kor = sc.nextInt();
				System.out.println("영어점수:");
				eng = sc.nextInt();
				System.out.println("수학점수:");
				mat = sc.nextInt();

				// 입력받은 정보를 저장할 student객체 생성
				Student student = new Student();
				// 입력받은 학생 이름을 생성한 Student 객체에 저장하는 메소드 호출
				// 코드를 작성하시오.
				name = student.setName(name);
				// 입력받은 국어 점수를 생성한 Student 객체에 저장하는 메소드 호출
				// 코드를 작성하시오.
				kor = (int) student.setKor(kor);
				// 입력받은 영어 점수를 생성한 Student 객체에 저장하는 메소드 호출
				// 코드를 작성하시오.
				eng = student.setEng(eng);
				// 입력받은 수학 점수를 생성한 Student 객체에 저장하는 메소드 호출
				// 코드를 작성하시오.
				mat = student.setMat(mat);
				// Student 객체를 배열에 대입
				// 코드를 작성하시오.
				    int i = 0;
					sArray[i] = student; 
				
				// 배열에 저장된 객체의 갯수 증가
				// 코드를 작성하시오.
				for (i = 0; i < sArray.length; i++) {
					student= new Student();
					sArray[i] = student;
				}
				break;
			case 2:
				// 배열에 저장된 인원만 출력하는 반복문 작성
				// 코드를 작성하시오.
				
				break;
			case 0:
				System.exit(0);
				break;
			}
		}
	}

}
