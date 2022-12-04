package classMethod;

import classMethod.human.Human02;

public class ClassMethod02 {
	public static void main(String[] args) {
		Human02 yamada = new Human02();
		System.out.println("名前は" + yamada.name + "で、年齢は" + yamada.age + "です");

		Human02 sato = new Human02("佐藤", 25);
		System.out.println("名前は" + sato.name + "で、年齢は" + sato.age + "です");

	}
}

/*
ClassMethod02クラス
・パッケージ宣言をしてclassMethod.ClassMethod02とクラスのパッケージを指定する
・インポート文を記載してclassMethod.human.Human02クラスを参照できるようにする
(この記載がない場合、 new classMethod.human.Human02() という風に毎度パッケージの指定が必要です)
・上記以外はClassMethod01クラスと同様
*/