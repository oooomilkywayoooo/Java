/*
 for文での繰り返し
 for文とはwhile文と同じように指定条件が「true」の間、繰り返し処理を行う制御文。
 主に指定した回数分ループして処理を行いたい時に使用。
 */
public class For01 {
	public static void main(String[] args) {
		for (int number = 1; number <= 5; number++) {
			System.out.println("For01 = " + number);
		}
	}
}

/*
基本構文
for (初期化式; 条件式; 変化式) {
	ブロック(繰り返し処理)
}
*/