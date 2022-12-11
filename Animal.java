package extend.animal;

//abstract修飾子を設定して、抽象クラスとして宣言
public abstract class Animal {
	protected String name;

	//　共通メソッドを記述
	public void eat() {
		System.out.println(name + "が食事をしました！");
	}

	// サブクラスごとに違う処置は、抽象メソッドにしてサブクラスに実装させる
	public abstract void cry();
}

/*
基本構文
抽象クラスの基本構文
//抽象クラスの宣言
アクセス修飾子 abstract class クラス名 {
	//抽象メソッドの宣言
	アクセス修飾子 abstract 戻り値の型 メソッド名（引数）;
}

「abstract」修飾子を指定してクラスを宣言することで抽象クラスになります。
また、メソッドに「abstract」修飾子を指定すると抽象メソッドになります。
抽象メソッドではメソッドブロックの記述せずに宣言のみ行います。メソッドブロックを記述するとコンパイルエラーになります。
*/
