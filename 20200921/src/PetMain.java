import java.util.Scanner;

public class PetMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Pet arr [] = new Pet [10];
		
		int leg;
		String name;
		String food;
		String fur;
		int menu;
		int count = 0;
		
		while(true) {
			System.out.println("======");
			System.out.println("1.���");
			System.out.println("2.���");
			System.out.println("0.����");
			System.out.println("======");
			
			System.out.println("�޴��� �Է��� �ּ���");
			menu = sc.nextInt();
			
			switch(menu) {
			case 1 :
			sc.nextLine();
			System.out.println("�� ���� �Է� ");
			System.out.println("�� �̸�;");
			name = sc.nextLine();
			
			System.out.println("�ٸ��� ����");
			leg = sc.nextInt();
			System.out.println("���� ����");
			fur = sc.nextLine();
			sc.nextLine();
			System.out.println("����");
			food = sc.nextLine();
			sc.nextLine();
			
			Pet pet = new Pet();
			
			pet.setName(name);
			pet.setLeg(leg);
			pet.setFur(fur);
			pet.setFood(food);
			
			arr[count] = pet;
			
			count++;
			break;
			
			/*case 2 :
				for(int i = 0 ;i <count ; i++) {
					System.out.println(arr[i].getName()+"�� �ٸ���"+
				arr[i].getFur()   ); // getLeg���ٰ� ����  // Pet Ŭ������ �������� �� �� ���� !!!
				}*/
			
			case 0 :
				System.exit(0);
				break;
			}
		}	
	}
	
}
