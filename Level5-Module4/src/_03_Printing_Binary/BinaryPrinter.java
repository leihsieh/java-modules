package _03_Printing_Binary;

public class BinaryPrinter {
	//Complete the methods below so they print the passed in parameter in binary.
	//Don't be afraid to use the methods that are already complete to finish the others.
	//Create a main method to test your methods.
	
	public static void main(String[] args) {
		BinaryPrinter bp = new BinaryPrinter();
		bp.printByteBinary(Byte.MAX_VALUE);
		System.out.println();
		bp.printShortBinary(Short.MAX_VALUE);
		System.out.println();
		bp.printIntBinary(Integer.MAX_VALUE);
		System.out.println();
		bp.printLongBinary(Long.MAX_VALUE);
	}
	
	public void printByteBinary(byte b) {
		System.out.print((b & 0b10000000) >> 7);
		System.out.print((b & 0b01000000) >> 6);
		System.out.print((b & 0b00100000) >> 5);
		System.out.print((b & 0b00010000) >> 4);
		System.out.print((b & 0b00001000) >> 3);
		System.out.print((b & 0b00000100) >> 2);
		System.out.print((b & 0b00000010) >> 1);
		System.out.print((b & 0b00000001) >> 0);
	}
	
	public void printShortBinary(short s) {
		printByteBinary((byte)((s & 0xFF00) >> 8));
		System.out.print( " " );
		printByteBinary((byte)((s & 0x00FF) >> 0));
	}
	
	public void printIntBinary(int i) {
		printShortBinary((short)((i & 0xFFFF0000) >> 16));
	    System.out.print( " " );
		printShortBinary((short)((i & 0x0000FFFF) >> 0));
	}
	
	public void printLongBinary(long l) {
		printIntBinary((int)(l >> 32));
	    System.out.print( " " );
		printIntBinary((int)((l & 0x00000000FFFFFFFF) >> 0));
	}
}
