Throw文
意図的に例外を発生させたい場合に使用する。(この事を「例外をスローする」と表現する)
 */

package exception;

public class Exception03 {
	public static void main(String[] args) {
		try {
			Exception03.division(100, 0);
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException例外が発生");
		} catch (IllegalArgumentException e) {
			System.out.println("IllegalArgumentException例外が発生");
			throw e;
		}
		System.out.println("プログラム終了");
	}
	public static void division(int a, int b) {
		System.out.println(a + "÷" + b + "は？");
		if(b == 0) {
			throw new IllegalArgumentException("引数が不正です");
		}
		int result = a / b;
		System.out.println("計算結果" + result);
	}
}
/*
基本構文
例外インスタンスをスロー
throw 例外インスタンス;

例外インスタンスを生成してスロー
throw new 例外クラス;
 */