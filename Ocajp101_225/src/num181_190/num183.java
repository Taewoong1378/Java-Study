package num181_190;

abstract class Robot implements Speakable{
	public abstract void process();
}

class Humanoid extends Robot{
	public void speak(String s) {System.out.println(s);}
	public void process() {System.out.println("Helping... ");}
}

interface Speakable{
	public void speak(String s);
}

public class num183 {
	public static void main(String[] args) {
		Robot r = new Humanoid();
		r.process();
		r.speak("Done");
	}
}
