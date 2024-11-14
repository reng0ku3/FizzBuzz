
public class FizzBuzz {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String str1 = "Fizz";
		String str2 = "Buzz";
		String str = str1 + str2;
		for(int i = 1; i <= 100; i++) {
			if(i % (3 * 5) == 0) {
				System.out.println(str);
			}else if(i % 3 == 0) {
				System.out.println(str1);
			}else if(i % 5 == 0) {
				System.out.println(str2);
			}else {
				System.out.println(i);
			}
		}
	}

}
