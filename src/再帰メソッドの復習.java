/**
 * 2017/8/3
 * 1����100�܂ŕW���o�͂�����
 * ��for, while, do while�͗p���Ȃ�
 * @author Takayuki
 *
 */
public class �ċA���\�b�h�̕��K {
	
	public static void main(String[] args) {
		int i = 0;
		 �ċA���\�b�h(i);
	}

	private static int �ċA���\�b�h(int i) {
		
		if(i == 100){
			return 0;
		}
		
		System.out.println(++i);
		
		return �ċA���\�b�h(i);

	}
}
