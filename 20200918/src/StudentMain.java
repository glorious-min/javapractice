import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		// ����ڷκ��� �Է¹ޱ� ���� ��ĳ�� ��ü
		Scanner sc = new Scanner(System.in);

		// �ִ� 10���� �л��� ������ ������ �л���ü �迭 ����
		Student[] sArray = new Student[10];

		String name;
		int kor, eng, mat;
		int menu;
		int count = 0; // �迭�� ����� ��ü����

		// �ݺ��ؼ� �Է¹ޱ� ���� �ݺ���

		while (true) {
			// ȭ�鿡 ����� �޴�
			System.out.println("================");
			System.out.println("1.���");
			System.out.println("2.���");
			System.out.println("0.����");
			System.out.println("================");
			// �޴���ȣ �Է¹ޱ�
			System.out.print("�޴��� �Է��ϼ��� ");
			menu = sc.nextInt();

			// �Է¹��� �޴���ȣ������ ������ �ǵ��� ����ġ�� �ۼ�
			switch (menu) {
			case 1:
				// ���ڿ� �Է��� ���� ��ĳ�� ��ü ����α�
				sc.nextLine();

				System.out.println("[�л� ���� �Է�]");
				System.out.println("�л��̸� :");
				name = sc.nextLine();
				System.out.println("��������:");
				kor = sc.nextInt();
				System.out.println("��������:");
				eng = sc.nextInt();
				System.out.println("��������:");
				mat = sc.nextInt();

				// �Է¹��� ������ ������ student��ü ����
				Student student = new Student();
				// �Է¹��� �л� �̸��� ������ Student ��ü�� �����ϴ� �޼ҵ� ȣ��
				// �ڵ带 �ۼ��Ͻÿ�.
				name = student.setName(name);
				// �Է¹��� ���� ������ ������ Student ��ü�� �����ϴ� �޼ҵ� ȣ��
				// �ڵ带 �ۼ��Ͻÿ�.
				kor = (int) student.setKor(kor);
				// �Է¹��� ���� ������ ������ Student ��ü�� �����ϴ� �޼ҵ� ȣ��
				// �ڵ带 �ۼ��Ͻÿ�.
				eng = student.setEng(eng);
				// �Է¹��� ���� ������ ������ Student ��ü�� �����ϴ� �޼ҵ� ȣ��
				// �ڵ带 �ۼ��Ͻÿ�.
				mat = student.setMat(mat);
				// Student ��ü�� �迭�� ����
				// �ڵ带 �ۼ��Ͻÿ�.
				    int i = 0;
					sArray[i] = student; 
				
				// �迭�� ����� ��ü�� ���� ����
				// �ڵ带 �ۼ��Ͻÿ�.
				for (i = 0; i < sArray.length; i++) {
					student= new Student();
					sArray[i] = student;
				}
				break;
			case 2:
				// �迭�� ����� �ο��� ����ϴ� �ݺ��� �ۼ�
				// �ڵ带 �ۼ��Ͻÿ�.
				
				break;
			case 0:
				System.exit(0);
				break;
			}
		}
	}

}
