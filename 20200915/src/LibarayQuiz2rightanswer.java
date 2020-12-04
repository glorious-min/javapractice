
public class LibarayQuiz2rightanswer {

	
	public static void main(String[] args) {


		
		int reader=2; // 사람의 수 
		int day= 1; // 몇일 
		int book = 300000; //책의 수 
		
		
		while(book>0) { // 책이 정확히 0권이 되면 계산하면 안된다 !!!
			day++;
			book=book-30*reader;
			if(day%10==0) {
				reader=reader*2;
			}// 하지만 아직도 왜 if 문을 여기에 두어도 되는건지 모르겠음 
			System.out.println(book);
			System.out.println(day);
			System.out.println(reader);
		}
		System.out.println(reader);
		System.out.println(day);
		
		
		
		

	}



	}

