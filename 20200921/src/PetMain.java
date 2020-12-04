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
			System.out.println("1.등록");
			System.out.println("2.출력");
			System.out.println("0.종료");
			System.out.println("======");
			
			System.out.println("메뉴를 입력해 주세요");
			menu = sc.nextInt();
			
			switch(menu) {
			case 1 :
			sc.nextLine();
			System.out.println("펫 정보 입력 ");
			System.out.println("펫 이름;");
			name = sc.nextLine();
			
			System.out.println("다리의 개수");
			leg = sc.nextInt();
			System.out.println("털의 유무");
			fur = sc.nextLine();
			sc.nextLine();
			System.out.println("먹이");
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
					System.out.println(arr[i].getName()+"은 다리가"+
				arr[i].getFur()   ); // getLeg없다고 나옴  // Pet 클래스에 만들었어야 쓸 수 있음 !!!
				}*/
			
			case 0 :
				System.exit(0);
				break;
			}
		}	
	}
	
}
