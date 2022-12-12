package practice;

import extend.phone.Phone;

public class FlyingPhone implements Phone, Flying {
	// プログラム作成
	private int time;

	public FlyingPhone(int time) {
		this.time = time;
	}

	public void fly() {
		System.out.println(this.time + " 分間、飛びます。");
	}

	public void call(String number) {
		System.out.println(number + "に電話をします。通話できるのは飛んでいる間だけです。");
	}

	public void powerOff() {
		Flying.super.powerOff();
	}
}