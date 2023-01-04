package dataType_Constructors;

public class Datatypes {
	public short shortnum=-678;
	public int intnum=123;
	public double doubnum=1.233;
	public char character='K';
	public float floatnum=(float)1.233;
	private long longnum=123456789;
	protected boolean bool=true;
	public static int statinteger=10;
	final static String name="Kaushik";

	public static void main(String[] args) {
		Datatypes dt=new Datatypes();
		
		System.out.println("Static Integer: "+statinteger);
		System.out.println("Static String: "+ name);
		System.out.println("Integer: "+dt.intnum);
		System.out.println("Short: "+dt.shortnum);
		System.out.println("long: "+dt.longnum);
		System.out.println("double: "+dt.doubnum);
		System.out.println("character: "+dt.character);
		System.out.println("float: "+dt.floatnum);
		System.out.println("boolean: "+dt.bool);

	}

}
