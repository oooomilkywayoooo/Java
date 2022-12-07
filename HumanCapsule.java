package capsule.human;

public class HumanCapsule {
	//privateのアクセス修飾子を設定して外部から隠蔽
	private String name;
	private int age;

	public HumanCapsule(String name, int age) {
		this.name = name;
		this.age = age;
	}

	//nameのgetterメソッド
	public String getName() {
		return this.name;
	}

	//nameのsetterメソッド
	public void setName(String name) {
		this.name = name;
	}

	//ageのgetterメソッド
	//ageは外部から変更禁止なので、setterメソッドは作成しない
	public int getAge() {
		return this.age;
	}
}

/*
基本構文
getterメソッド
public 戻り値の型(フィールドの型) getフィールド名(){
	return this.フィールド名;
}

setterメソッド
public void setフィールド名(フィールドの型の引数){
	this.フィールド名 = フィールドの型の引数;
}
*/