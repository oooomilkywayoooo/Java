/*
パッケージ　基本構文
パッケージを宣言する基本構文。必ずクラスファイルの先頭に記述する必要がある。
package パッケージ名;

関連して、インポートを宣言する基本構文。パッケージ宣言直後に記述。
 import パッケージ名.クラス名;
 次のように書くと指定したパッケージ下全てのクラスがインポートされる。
 import パッケージ名.*;
*/

// パッケージ宣言
package classMethod.human;

public class Human02 {
	public String name;
	public int age;

	public Human02() {
		name = "山田";
		age = 20;
	}

	public Human02(String name, int age) {
		this.name = name;
		this.age = age;
	}
}

/*
Human02クラス
・パッケージ宣言をしてclassMethod.human.Human02とクラスのパッケージを指定する
・上記以外はHuman01クラスと同様
*/