package num201_210;

interface Downloadable{
	public void download();
}

interface Readable extends Downloadable{
	public void readBook();
}

abstract class Book implements Readable{
	public void readBook() {
		System.out.println("Read Book");
	}
}

//class EBook extends Book {
//	public void readBook() {
//		System.out.println("Read E-Book");
//	}
//}
//
//public class num208 {
//	public static void main(String[] args) {
//		Book book1 = new EBook();
//		book1.readBook();
//	}
//
//}
