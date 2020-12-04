
public class LibraryQuiz1 {

	
	public static void main(String[] args) {
		int day;
		int reader = 2;
		
		int rest = 300000;
		for (day = 1; rest > 0; day++) {
			rest-=reader * 30;
			if (day % 10 == 0) {
				reader *= 2;
			}

		}
          System.out.println(day+" "+reader);
	}

}
