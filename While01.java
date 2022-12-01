//while文とは指定条件が「true」の間、繰り返し処理を行う制御文。
public class While01 {
	public static void main(String[] args) {
		int number = 1;
		while (number < 50) {
			number *= 2;
			System.out.println("While01 =" + number);
		}
	}
}

/*基本構文
while (条件式){
	ブロック（繰り返し処理）
}
*/