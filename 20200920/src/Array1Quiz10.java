
public class Array1Quiz10 {

	public static void main(String[] args) {
		//11, 12, 13, 14, 25, 30, 54, 65, 68 ,77 의 값을 가진 int형 배열을 생성하고
		//같은 크기의 다른 배열로 그 값들을 복사하는 코드를 작성 하시오.

		int arr [] = {11,12,13,14,25,30,54,65,68,77};
		int arr2 [] = new int[10];
		
		for(int i = 0 ; i < arr.length; i++) {
			arr2[i]=arr[i];
			//System.out.println(arr2[j]);
		}
		System.out.println(arr2[7]);
		//arr2에 값이 제대로 안들어갔음 !! arr2의 인덱스도 하나씩 늘리면서 대입해주어야한다 
	    // 어떻게 하지 ??? 
		// 두 배열의 변수를 하나로 통일하면 된다 !!
	}

}
