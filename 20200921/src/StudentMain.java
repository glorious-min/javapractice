
import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		//사용자로 부터 입력받기 위한 Scanner 객체
		Scanner sc = new Scanner(System.in);
		
		//최대10명의 학생의 정보를 저장할 학생객체 배열 생성
		Student[] sArray = new Student[10];
		//입력받은 학생이름 저장할 변수
		String name;
		//입력받은 학생점수 저장할 변수
		int kor,eng,mat;
		//입력받은 메뉴번호
		int menu;
		//배열에 저장된 객체 개수
		int count = 0;
		
		//반복해서 입력받기 위한 반복문
		while(true) {
			//화면에 출력할 메뉴
			System.out.println("=====================");
			System.out.println("1.등록");
			System.out.println("2.출력");
			System.out.println("0.종료");
			System.out.println("=====================");
			//메뉴번호 입력받기
			System.out.print("메뉴를 입력해 주세요 > ");
			menu = sc.nextInt();
			
			//입력받은 메뉴번호에 따라서 기능이 동작되도록 switch문 작성
			switch (menu) {
			case 1:
				//문자열 입력을 위해 Scanner 객체 비워주기
				sc.nextLine();

				System.out.println("[ 학생 정보 입력 ]");
				System.out.print("학생 이름 : ");
				name = sc.nextLine();
			
				//사용자로 부터 국어 점수를 입력 받음.
				System.out.print("국어 점수 : ");
				kor = sc.nextInt();
				//사용자로 부터 영어 점수를 입력 받음.
				System.out.print("영어 점수 : ");
				eng = sc.nextInt();
				//사용자로 부터 수학 점수를 입력 받음.
				System.out.print("수학 점수 : ");
				mat = sc.nextInt();
			
				//입력받은 정보를 저장할 Student 객체 생성 // 객체생성을 나중에 하네 ??
				//코드를 작성하시오.
				Student student = new Student();
				//입력받은 학생 이름을 생성한 Student 객체에 저장하는 메소드 호출
				student.setName(name);
				//입력받은 국어 점수를 생성한 Student 객체에 저장하는 메소드 호출
				student.setKor(kor);
				//입력받은 영어 점수를 생성한 Student 객체에 저장하는 메소드 호출
				student.setEng(eng);
				//입력받은 수학 점수를 생성한 Student 객체에 저장하는 메소드 호출
				student.setMat(mat);
				//Student 객체를 배열에 대입
				sArray[count]=student;
				//배열에 저장된 객체의 갯수 증가 / 철수 객체 미나 객체 경민객체들을 만드는것 ! 
				//학생의 이름, 성적정보, 그리고 기능들을 가지고있는 객체 정보를 배열에 대입하는것!! 
				count++;
				break;
			case 2:
				//배열에 저장된 인원만큼만 출력하는 반복문 작성 
				for(int i = 0 ; i < count ; i++) // 여기에서 count는 length역할을 하는듯 ?? 객체가 몇개인지 센거니까
				{ System.out.println(sArray[i].getName()+"님의 총점은 "+sArray[i].getTotal()+"이고 평균은"+sArray[i].getAverage()+"입니다"); }
				break;
			case 0:
				System.exit(0);
				break;
			}
		}
	}

}