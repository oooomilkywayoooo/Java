package polymorphism.human;

// Humanクラスを継承
public class Student extends Human {
	private int score;

	public Student(String name, int age, int score) {
		// スーパークラスのコンストラクタを呼び出し
		super(name, age);
		this.score = score;
	}

	// オーバーライドして、Studentクラス用に処理を変更
	@Override
	public String getProfile() {
		String profile = "年齢は" + super.age + "です。";
		profile += "学生で、テストの点数は" + this.score + "点です。";
		return profile;
	}
}

/*
final修飾子が指定されたメソッド
final修飾子が指定されたメソッドはオーバーライドが禁止になります。そのため、サンプルプログラムの
「getName」メソッドをオーバーライドしようとするとコンパイルエラーになります。

public class Student extends Human {
    // オーバーライド禁止のため、コンパイルエラー
    public String getName() {
        return "名前は" + this.name + "です。";
    }
}
*/