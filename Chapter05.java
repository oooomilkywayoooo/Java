public class Chapter05 {
	public static void main(String[] args) {

		// longは最後にFをつける。
		long long1 = 556677L;
		double double1 = 5566.77;
		boolean boolean1 =  true;
		System.out.println(long1);
		System.out.println(double1);
		System.out.println(boolean1);

		// floatは最後にfをつける。
		Float float1 = 0.123f;
		Integer integer1 = 5;
		// characterは「''」シングルクォーテーションで囲む。
		Character character1 = 'あ';
		System.out.println(float1);
		System.out.println(integer1);
		System.out.println(character1);

		//  index番号３番目を出力
		int[] array = {11, 22, 33, 44, 55};
		System.out.println(array[3]);
	}
}

int[] array1 = new int[3];  // 配列の宣言と生成
array1[0] = 60;  // インデックス番号「0」を指定して１番目の要素にデータを代入
array1[2] = 20;  // ２番目の要素より先に３番目の要素にデータを代入
array1[1] = 20;  // ３番目と同じ値を２番目の要素に代入
int int2 = array1[2];  // インデックス番号「2」を指定して３番目の要素を取得

int array2[] = null;  // []は変数名の後ろでも可

// 変数と同じように宣言と同時に初期化することもできる。
int[] array3 = new int[] { 10, 20, 50 };
int[] array4 = { 10, 20, 50 };