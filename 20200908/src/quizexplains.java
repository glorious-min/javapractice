import java.util.Scanner;

public class quizexplains {
//정수형 배열 array 를 생성하는데 크기는 50으로 생성 
	//정수 1-100 사이의 홀수를 배열에 저장해서 출력하는 코드를 작성 

	
		int[] array = new int[50];//0에서 49까지의 인덱스 지님 
		int index = 0; //이를 만들어 놓은 배열에 인덱스의 값을 지정하는 변수로 사용하기 위해 만든것 
		
		for (int i =1; i<=100;i++) {
			if(i%2!=0) {
				array[index]=i;
				index++	;	
			
		}
			
		for (int i=0; i<array.length;i++) {
			System.out.println((i+1)+"번쨰의 수" +array[i]);
		}}}

	/*nt[] intArr= new int[50];
		for (int i =1; i<101; i++) { 
			 if(i%2!=0) {
				 	intArr[(i-1)/2] = i;
	//변수를 하나로 쓰는 방법

}}
