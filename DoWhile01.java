
public class DoWhile01 {
	public static void main(String[] args) {
		int number = 1;
		do {
			number *= 2;
			System.out.println("DoWhile01 = " + number);
		} while (number < 50);
	}
}

/*
 基本構文
 do {
 	ブロック(繰り返し処理)
 } while(条件式);
 */