
public class Libraryquiz {

	public static void main(String[] args) {
		int day=1;
		int reader = 2;//이 부분이 가장 문제
		int rest = 300000; // 남은책의 양 
		
		
		while(rest>0) {
			day+=1;// 이걸  while문 안 맨뒤에 두면 90 일이 아니라 91 이라고 나온다 ?
			//위치 진짜 주의하기 !!!!!!
			rest = rest-reader*30; // 
			if(day%10==0) {
				reader*=2;
			}
			
		}
             System.out.println("걸리는 날은"+day+"그때의 인원수는"+reader);
	}
//왜 걸리는 날이 91 이라고 나오지 ??
}
