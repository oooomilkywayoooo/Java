
public class If01 {
	public static void main(String[] args) {
		/*
		基本構文
		if (条件式){
			ブロック(処理文);
		}
		 */
		int number = 7;
		if (number < 5) {
			System.out.println(number + "は5未満です");
		}
		if (number < 10) {
			System.out.println(number + "は10未満です");
		}
		if (number < 15) {
			System.out.println(number + "は15未満です");
		}
	}
}