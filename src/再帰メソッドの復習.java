/**
 * 2017/8/3
 * 1から100まで標準出力させる
 * ※for, while, do whileは用いない
 * @author Takayuki
 *
 */
public class 再帰メソッドの復習 {
	
	public static void main(String[] args) {
		int i = 0;
		 再帰メソッド(i);
	}

	private static int 再帰メソッド(int i) {
		
		if(i == 100){
			return 0;
		}
		
		System.out.println(++i);
		
		return 再帰メソッド(i);

	}
}
