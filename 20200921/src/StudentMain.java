
import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		//����ڷ� ���� �Է¹ޱ� ���� Scanner ��ü
		Scanner sc = new Scanner(System.in);
		
		//�ִ�10���� �л��� ������ ������ �л���ü �迭 ����
		Student[] sArray = new Student[10];
		//�Է¹��� �л��̸� ������ ����
		String name;
		//�Է¹��� �л����� ������ ����
		int kor,eng,mat;
		//�Է¹��� �޴���ȣ
		int menu;
		//�迭�� ����� ��ü ����
		int count = 0;
		
		//�ݺ��ؼ� �Է¹ޱ� ���� �ݺ���
		while(true) {
			//ȭ�鿡 ����� �޴�
			System.out.println("=====================");
			System.out.println("1.���");
			System.out.println("2.���");
			System.out.println("0.����");
			System.out.println("=====================");
			//�޴���ȣ �Է¹ޱ�
			System.out.print("�޴��� �Է��� �ּ��� > ");
			menu = sc.nextInt();
			
			//�Է¹��� �޴���ȣ�� ���� ����� ���۵ǵ��� switch�� �ۼ�
			switch (menu) {
			case 1:
				//���ڿ� �Է��� ���� Scanner ��ü ����ֱ�
				sc.nextLine();

				System.out.println("[ �л� ���� �Է� ]");
				System.out.print("�л� �̸� : ");
				name = sc.nextLine();
			
				//����ڷ� ���� ���� ������ �Է� ����.
				System.out.print("���� ���� : ");
				kor = sc.nextInt();
				//����ڷ� ���� ���� ������ �Է� ����.
				System.out.print("���� ���� : ");
				eng = sc.nextInt();
				//����ڷ� ���� ���� ������ �Է� ����.
				System.out.print("���� ���� : ");
				mat = sc.nextInt();
			
				//�Է¹��� ������ ������ Student ��ü ���� // ��ü������ ���߿� �ϳ� ??
				//�ڵ带 �ۼ��Ͻÿ�.
				Student student = new Student();
				//�Է¹��� �л� �̸��� ������ Student ��ü�� �����ϴ� �޼ҵ� ȣ��
				student.setName(name);
				//�Է¹��� ���� ������ ������ Student ��ü�� �����ϴ� �޼ҵ� ȣ��
				student.setKor(kor);
				//�Է¹��� ���� ������ ������ Student ��ü�� �����ϴ� �޼ҵ� ȣ��
				student.setEng(eng);
				//�Է¹��� ���� ������ ������ Student ��ü�� �����ϴ� �޼ҵ� ȣ��
				student.setMat(mat);
				//Student ��ü�� �迭�� ����
				sArray[count]=student;
				//�迭�� ����� ��ü�� ���� ���� / ö�� ��ü �̳� ��ü ��ΰ�ü���� ����°� ! 
				//�л��� �̸�, ��������, �׸��� ��ɵ��� �������ִ� ��ü ������ �迭�� �����ϴ°�!! 
				count++;
				break;
			case 2:
				//�迭�� ����� �ο���ŭ�� ����ϴ� �ݺ��� �ۼ� 
				for(int i = 0 ; i < count ; i++) // ���⿡�� count�� length������ �ϴµ� ?? ��ü�� ����� ���Ŵϱ�
				{ System.out.println(sArray[i].getName()+"���� ������ "+sArray[i].getTotal()+"�̰� �����"+sArray[i].getAverage()+"�Դϴ�"); }
				break;
			case 0:
				System.exit(0);
				break;
			}
		}
	}

}