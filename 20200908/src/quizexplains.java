import java.util.Scanner;

public class quizexplains {
//������ �迭 array �� �����ϴµ� ũ��� 50���� ���� 
	//���� 1-100 ������ Ȧ���� �迭�� �����ؼ� ����ϴ� �ڵ带 �ۼ� 

	
		int[] array = new int[50];//0���� 49������ �ε��� ���� 
		int index = 0; //�̸� ����� ���� �迭�� �ε����� ���� �����ϴ� ������ ����ϱ� ���� ����� 
		
		for (int i =1; i<=100;i++) {
			if(i%2!=0) {
				array[index]=i;
				index++	;	
			
		}
			
		for (int i=0; i<array.length;i++) {
			System.out.println((i+1)+"������ ��" +array[i]);
		}}}

	/*nt[] intArr= new int[50];
		for (int i =1; i<101; i++) { 
			 if(i%2!=0) {
				 	intArr[(i-1)/2] = i;
	//������ �ϳ��� ���� ���

}}
