
public class LibarayQuiz2rightanswer {

	
	public static void main(String[] args) {


		
		int reader=2; // ����� �� 
		int day= 1; // ���� 
		int book = 300000; //å�� �� 
		
		
		while(book>0) { // å�� ��Ȯ�� 0���� �Ǹ� ����ϸ� �ȵȴ� !!!
			day++;
			book=book-30*reader;
			if(day%10==0) {
				reader=reader*2;
			}// ������ ������ �� if ���� ���⿡ �ξ �Ǵ°��� �𸣰��� 
			System.out.println(book);
			System.out.println(day);
			System.out.println(reader);
		}
		System.out.println(reader);
		System.out.println(day);
		
		
		
		

	}



	}

