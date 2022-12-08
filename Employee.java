package extend.human;

public class Employee extends Human {
	private String department;

	public Employee(String name, int age, String department) {
		super(name, age);
		this.department = department;
	}

	public String getEmployeeProfile() {
		String profile = "年齢は" + this.age + "です。";
		profile += "サラリーマンで、部署は" + this.department + "です。";
		return profile;
	}
}

/*
final修飾子を指定
final public class Human{
}

Humanが継承禁止のため、コンパイルエラー
final public class Employee extends Human{
}
 */