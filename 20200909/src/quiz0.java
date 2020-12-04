import java.util.Scanner;

public class quiz0 {

	public static void main(String[] args) {
		//정수 5개를 입력 받아서 가장 큰 숫자를 출력하는 코드를 작성 
		//배열,반복문,조건문,변수도 활용 
		
		
		Scanner sc = new Scanner(System.in);
		//정수 하나하나 선언이 아닌 배열을 만들어 인덱스에 5개 정수를 넣기 
		int [] arr = new int[5];
		int max = 0; //최대값 넣는 변수이자 비교하는 가장 큰 숫자 . 
		//입력 받기전에는 
		//0이 가장 큰 수이지만 이후에 입력 받으며 달라질것 !
		for (int i = 0; i<arr.length;i++ ) {
			
			//최대값을 출력해야하니까 이를 저장할 변수가 필요함 ! 처음에 선언 max
			//방법1 5번 입력 다 받고 끝난 후에 숫자를 비교해서 가장 큰 수 찾기 
			//이거 쓰기 ! 방법2 입력 받을떄마다 비교를 해서 입력이 끝났을 떄 가장 큰 수 찾기 
			
			System.out.println((i+1)+"번째  정수를 입력해 주세요");
			if(i==0) {
				max=arr[i];
			}//가장 작은 값 구할때 음수를 입력했음에도 가장작은수로 0이 
			//나온다면 이걸 입력해야함 /... 왜 ?? 이해 안감 
			
			arr[i]=sc.nextInt();//중요 =값을 넣어주기 
			if (max>arr[i]) {
				max=arr[i];
			}
		}
		
		System.out.println("최대값은 "+max);
		
	}

}
