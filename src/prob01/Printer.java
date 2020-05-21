package prob01;

public class Printer { //오버로딩 
	public void println( int val ) {
		System.out.println( val );
	}

	public void println( boolean val ) {
		System.out.println( val );
	}
	
	public void println( String val ) {
		System.out.println( val );
	}
	
	public void println( double val ) {
		System.out.println( val );
	}	
}
