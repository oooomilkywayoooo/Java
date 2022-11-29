
public class Chapter06 {
	public static void main(String[] args) {
		// 変数「val」を算術演算子の「+」で計算した結果で初期化
		int val;
		val = 2 + 5;
		System.out.println(val);
		
		// 変数「val」をインクリメント(後置)
		val++;
		System.out.println(val);

		// 代入演算子の「*=」を使用して変数「val」に「5」をかけた値を代入
		val *= 5;
		System.out.println(val);

		// 「bool」変数に関係演算子の「==」を使用して「valは50と等しい」の結果を代入
		boolean bool;
		bool = (val == 50);
		System.out.println(bool);

		/* 「bool」変数に論理演算子の「&&」を使用して「valは50より小さい AND valを10で割った余が0」
		の結果を代入。「valは５０より小さい」は関係(比較)演算子の「<」を使用し、「valを10で割った余りが0」
		の余り計算は算術演算子の「%」を使用。
		*/
		bool = (val < 50) && (val % 10 == 0);
		System.out.println(bool);
	}
}
