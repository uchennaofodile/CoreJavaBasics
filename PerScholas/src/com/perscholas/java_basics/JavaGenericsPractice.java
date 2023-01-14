
public class JavaGenericsPractice <T>{
	private T data;

	public JavaGenericsPractice() {

	}

	public JavaGenericsPractice(T data) {
		this.data = data;
	}

	T getData() {
		return data;
	}

	void setData(T data){
		this.data = data;
	}


	public static void main(String[] args) {

		JavaGenericsPractice<String> gp = new JavaGenericsPractice<>();

		JavaGenericsPractice<Integer> gp2 = new JavaGenericsPractice<>();

		JavaGenericsPractice<Character> gp3 = new JavaGenericsPractice<>();
		
		JavaGenericsPractice<String> gp4 = new JavaGenericsPractice<>("Hello");
		
		JavaGenericsPractice<Integer> gp5 = new JavaGenericsPractice<>(3);
		
		System.out.println("Generic Class return: "+gp5.getData());
		
		System.out.println("Generic Class return: "+gp4.getData());




	}




}


