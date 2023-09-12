//local demo program
package in.variables;

public class LocalDemo {
	int i = 5;//global variable
	public void speakTelugu() {
		int score = 10;//local variable
		score = score + 10;
		System.out.println("score is;" + score);
	}

	public static void main(String[] args) {
		LocalDemo sindhu = new LocalDemo();
		sindhu.speakTelugu();
		LocalDemo e =new LocalDemo();
		System.out.println(e.i);
	}

}

  