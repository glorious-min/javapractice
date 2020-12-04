
public class AreeayTest2 {

	public static void main(String[] args) {
		// 이차원 배열의 선언과 생성 
		int [][] iarrays = new int[3][5];
		//배열의 렝스 속성을 이용하여 이차배열을 순회하면서 값을 초기화 한다 .
		int initval = 0 ; //지금배열에 넣을 값을 가지고 있는 변수 
		for (int i=0;i<iarrays.length;i++) {
			for(int j = 0; i <iarrays[i].length;j++) {
				iarrays[i][j] = initval++;
			}
		}
//이차배열을 순회하면서 값을 출력 
	 for(int i =0;i<iarrays.length;i++) {
		 for(int j=0;j<iarrays[i].length;j++) {
			 System.out.println("["+i+"]["+j+"]:"+
			 		+ iarrays[i][j]);
		 System.out.println("\t");
		 }
		 System.out.println();
		 
	 }
	}

}
