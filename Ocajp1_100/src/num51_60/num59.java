package num51_60;

interface Readable{
	public void readBook();
	public void setBookMark();
}

abstract class Book implements Readable {	// line n1
	public void readBook() {
		// line n2
	}
}

class EBook extends Book{		// line n2
	public void readBook() {}
	public void setBookMark() {}
}

public class num59 {
	
	public static void main(String[] args) {
		
		Book book1 = new EBook();
		book1.readBook();
		book1.readBook();
	}
}
