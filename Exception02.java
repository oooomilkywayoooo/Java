package exception;

public class Exception02 {
	public static void main(String[] args) {
		try {
			System.out.println("100 ÷ 0 は？");
			int result = 100 / 0;
			System.out.println("計算結果" + result);
		} catch (ArithmeticException e) {
			System.out.println("例外が発生");
		} finally {
			System.out.println("プログラム終了");
		}
	}
}

/*
基本構文
try {
	tryブロック(例外が発生する可能性がある処理)
} catch (例外クラス 変数名) {
	catchブロック (例外が発生した時に実行する処理)
} catch (例外クラス 変数名) {
	catchブロック (例外が発生した時に実行する処理)
} finally {
	finallyブロック (例外発生の有無にかかわらず必ず実行する処理)
}
 */
/*
・try文
tryブロックには、例外が発生する可能性がある処理を記述する。
try文は必ず記述する必要がある。

・catch文
catchブロックには、例外が発生した時に実行する処理を記述する。
tryブロックで発生した例外のクラスとcatch文に記述した例外クラスの型が一致した場合、
そのcatch文のブロックの処理が実行される。
catch文は、例外ごとに処理する場合は複数記述することもできる。
実行する例外処理がなければ記述の必要はない。

・finally文
finallyブロックに、例外発生の有無にかかわらず必ず実行する処理を記述する。
finally文もcatch文と同じように必ず実行する処理がなければ記述に必要はない。
 */