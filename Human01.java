
/*
クラス　基本構文
修飾子 class クラス名 {
	修飾子 コンストラクタ(引数) {
		初期化処理
	}
}
*/

public class Human01 {
	public String name; //メンバー変数
	public int age; //メンバー変数

	//引数なしのコンストラクタ
	public Human01() {
		name = "山田";
		age = 20;
	}

	//引数２つのコンストラクタ
	public Human01(String name, int age) {
		this.name = name;
		this.age = age;
	}
}

/*
Human01クラス
・アクセス修飾子publicを用いてどこからでもアクセスできるクラスHuman01を定義する
・アクセス修飾子publicを用いてどこからでもアクセスできるメンバー変数nameとageを定義する
・引数なしのコンストラクタを定義する。これを用いて初期化した場合、nameは「山田」、ageは「20」という値で初期化される
(それぞれ変数にセットされる)
・引数2つ(String型とint型)のコンストラクタを定義する。これを用いて初期化した場合、nameもageも引数として渡した値で初期化される。
初期化対象は生成したインスタンスのメンバー変数なので、thisキーワードを用いて指定する
*/