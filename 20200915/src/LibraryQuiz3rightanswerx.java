
public class LibraryQuiz3rightanswerx {

	
	public static void main(String[] args) {

		int reader = 2; // 사람의 수
		int day = 1; // 몇일
		int book = 300000; // 책의 수

		while (true) {
			book -= reader * 30;
			if (day % 10 == 0) {
				reader *= 2;
			}
			if (book <= 0) {
				break;
			}
			day++;
		}
		System.out.println(day + " " + reader);
	} // 이건 왜 되는거지 ???

}
