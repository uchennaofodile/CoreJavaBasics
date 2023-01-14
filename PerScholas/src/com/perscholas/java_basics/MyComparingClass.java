
public class MyComparingClass {
	Generic_functionInterface<Integer> compareTwoVar = new Generic_functionInterface<>() {


		@Override
		public Integer compare(Integer a, Integer b) {
			if (a>b) {
				return a;
			}
			else {
				return b;
			}
		}
	};

	Generic_functionInterface<String> stCompare = new Generic_functionInterface<>() {
		public String compare(String a, String b) {
			if(a.equals(b)) {
				return "true";
			}
			else {
				return "false";
			}
		}
	};

}
