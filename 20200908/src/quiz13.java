//�б��� �ο����� �Է� �޾� �� ����ŭ �迭�� �����ϰ� 
//�� �迭�� ũ���� �л� ���� ������ �Է� �޾� ������ �迭�� ������ ��,
//�б��� ����� ���ϴ� �ڵ带 �ۼ��Ͻÿ�.

import java.util.Scanner;

public class quiz13 {

	public static void main(String[] args) {
		System.out.println("�б޿� ����� �ֽ��ϱ�?");
	Scanner sc = new Scanner(System.in);
	int num = sc.nextInt();
	int arr []= new int [num];
	int score=0;
	int index=0;
	int sum=0;
	for(index=0;index<num;index++) {
		System.out.println(index+1+"��° �л��� ������ �Է����ּ���");
	    score = sc.nextInt();
	    arr[index]=score;
	    sum+=score;
	}
	 
     System.out.println((double)(sum/num));
	}

}
