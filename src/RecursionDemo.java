
public class RecursionDemo {
	public int recursionFunction(int a) {
		if (a<=0) {
			return 0;
		}
		System.out.println(a);
		return recursionFunction(a-99);
	
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RecursionDemo d = new RecursionDemo();
		System.out.println(d.recursionFunction(1000));

	}

}
