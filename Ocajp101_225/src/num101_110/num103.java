package num101_110;

class LogFileException extends Exception {
}

class AccessViolationException extends RuntimeException {
}

public class num103 {
	public static void main(String[] args) throws LogFileException {
		num103 obj = new num103();
		try {
			obj.open();
			obj.process();
		} catch (Exception e) {
			System.out.println("Completed.");
		}
	}

	public void process() throws LogFileException {
		System.out.println("Processed");
		throw new LogFileException();
	}

	public void open() {
		System.out.println("Opened.");
		throw new AccessViolationException();
	}
}