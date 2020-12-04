//학급의 인원수를 입력 받아 그 수만큼 배열을 생성하고 
//그 배열의 크기의 학생 수의 점수를 입력 받아 생성된 배열에 저장한 후,
//학급의 평균을 구하는 코드를 작성하시오.

import java.util.Scanner;

public class quiz13 {

	public static void main(String[] args) {
		System.out.println("학급에 몇명이 있습니까?");
	Scanner sc = new Scanner(System.in);
	int num = sc.nextInt();
	int arr []= new int [num];
	int score=0;
	int index=0;
	int sum=0;
	for(index=0;index<num;index++) {
		System.out.println(index+1+"번째 학생의 점수를 입력해주세요");
	    score = sc.nextInt();
	    arr[index]=score;
	    sum+=score;
	}
	 
     System.out.println((double)(sum/num));
	}

}
