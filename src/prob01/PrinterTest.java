package prob01;

public class PrinterTest {

	public static void main(String[] args) {
		Printer printer = new Printer(); //프린터라는 객체에 다양한 타입으로 다른 곳에 출력

		printer.println( 10 );
		printer.println( true );
		printer.println( 5.7 );
		printer.println( "홍길동" );
	}

}
