*
throws文
throws文は、例外が発生した場合にcatch文を記述してメソッド内で例外処理するのではなく、
例外をスローして呼び出し元に例外処理させたい場合に使用します。
 */

package exception;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Exception04 {
	public static void main(String[] args) {
		// readFileメソッドを呼び出し
		try {
			Exception04.readFile("exception.txt");
		// 呼び出し元も例外処理を記述しないとコンパイルエラーになる
		} catch (FileNotFoundException e) {
			// 例外処理が実行される
			System.out.println("FileNotFoundException例外が発生");
		}
		// catch文で例外処理されるので、処理が実行される
		System.out.println("プログラム終了");
	}

	// 検査例外のFileNotFoundException例外をスロー
	public static void readFile(String fileName) throws FileNotFoundException {
		System.out.println("ファイルの読み込み開始");
		// ファイルが存在しないため例外が発生
		FileReader fr = new FileReader(fileName);
		System.out.println(fileName + "の読み込み完了");
	}
}

/*
基本構文
修飾子 戻り値の型 メソッド名(引数) throws 例外クラスの型 {
	処理
	return 戻り値;
}
メソッド構文の後ろにthrows文を記述する。スローする例外クラスの型は、
カンマで区切り複数指定できる。
 */