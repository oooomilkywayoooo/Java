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