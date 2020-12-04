import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Student[] arr = new Student[10];
		
		String name;
		int kor,eng,mat;
		int menu;
		int count = 0 ; 
		
		while(true) {
			System.out.println("=====");
			System.out.println("1.등록");
			System.out.println("2.출력");
			System.out.println("0.종료");
			System.out.println("=====");
			System.out.println("메뉴를 입력해 주세요");
			menu = sc.nextInt();
			
			switch (menu) {
			case 1 :
				sc.nextLine();
				
				System.out.println("[학생정보 입력]");
				System.out.println("학생이름:");
				name = sc.nextLine();
				
				System.out.print("국어점수");
				kor = sc.nextInt();
				
				System.out.print("영어점수");
				eng = sc.nextInt();
				
				System.out.print("수학점수");
				mat = sc.nextInt();
				
				Student student = new Student();
				
				student.setName(name);
				
				student.setEng(eng);
				
				student.setKor(kor);
				
				student.setMat(mat);
				
				arr[count] = student;
				
				count++;//count 를 밖에서 선언하였기 떄문에 와일문이 한번 끝날떄마다 증가가 된채로 유지가 된다 
				break;
				
			case 2 : 
				
				for(int i=0 ; i < count; i++) {
					System.out.println(arr[i].getName()+"님의 총점은"+arr[i].getTotal()+"이고 평균은 "+arr[i].getAverage()+"입니다");
						} // 3번쨰학생 - 2번 배열에 저장됨 
				break;
					
		   case 0:
				System.exit(0);
				break;
				}
				
			}
			
		}

	}


