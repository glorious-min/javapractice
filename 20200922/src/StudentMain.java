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
			System.out.println("1.���");
			System.out.println("2.���");
			System.out.println("0.����");
			System.out.println("=====");
			System.out.println("�޴��� �Է��� �ּ���");
			menu = sc.nextInt();
			
			switch (menu) {
			case 1 :
				sc.nextLine();
				
				System.out.println("[�л����� �Է�]");
				System.out.println("�л��̸�:");
				name = sc.nextLine();
				
				System.out.print("��������");
				kor = sc.nextInt();
				
				System.out.print("��������");
				eng = sc.nextInt();
				
				System.out.print("��������");
				mat = sc.nextInt();
				
				Student student = new Student();
				
				student.setName(name);
				
				student.setEng(eng);
				
				student.setKor(kor);
				
				student.setMat(mat);
				
				arr[count] = student;
				
				count++;//count �� �ۿ��� �����Ͽ��� ������ ���Ϲ��� �ѹ� ���������� ������ ��ä�� ������ �ȴ� 
				break;
				
			case 2 : 
				
				for(int i=0 ; i < count; i++) {
					System.out.println(arr[i].getName()+"���� ������"+arr[i].getTotal()+"�̰� ����� "+arr[i].getAverage()+"�Դϴ�");
						} // 3�����л� - 2�� �迭�� ����� 
				break;
					
		   case 0:
				System.exit(0);
				break;
				}
				
			}
			
		}

	}


