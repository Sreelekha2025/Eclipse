//Program for static variables
package in.variables;

public class StaticVariableExample {
	static int a = 10;

	public static void main(String[] args) {
		StaticVariableExample examples = new StaticVariableExample();

		System.out.println("value of a is:" + a);
		System.out.println("value of a is:" + StaticVariableExample.a);
		System.out.println("value of a is:" + examples.a);
	}

}
