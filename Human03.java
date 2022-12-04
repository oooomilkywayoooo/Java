package classMethod.human;

public class Human03 {
	public String name;
	public int age;
	public String profession;

	public Human03() {
		this.name = "山田";
		this.age = 20;
		this.profession = "プログラマー";
	}

	//String型の戻り値を返す引数なしのメソッドを定義
	public String getProfile() {
		return "年齢は" + this.age + "、職業は" + this.profession;
	}

	//戻り値を返さない、String型の引数を１つとるメソッドを定義
	public void greet(String friend) {
		if (friend == null) { //String型の値はnullの可能性があるのでチェック
			System.out.println("挨拶する友達がわかりません！");
			return;
		}
		System.out.println(friend + "さん、こんにちは！");
	}
}

/*
Human03クラス
・String型の戻り値を返すgetProfileメソッドを定義する
・戻り値を返さない、String型の引数を1つとるgreetメソッドを定義する
・上記メソッド内でString型の引数としてnullが渡される可能性があるためnullチェックを行う
(nullをそのまま扱うと、NullPointerExceptionを始め様々なエラーのもととなるためチェックする癖をつけましょう)
・上記以外はHuman01クラスと同様