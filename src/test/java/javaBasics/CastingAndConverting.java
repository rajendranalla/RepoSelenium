package javaBasics;

public class CastingAndConverting {

	public static void main(String[] args) {
		
		
		/* 
		 * List of Java's primitive data types: 

            1.  byte    is 1 byte  -128 to 127 //
            2.  short   is 2 bytes  -32,768 to 32,767
            3.  int     is 4 bytes -2,147,483,648 to 2,147,483,647
            4.  long    is 8 bytes -9,223,372,036,854,775,808 to 9,223,372,036,854,775,80
            5.  float   is 4 bytes (approximately ±3.40282347E+38F(6-7 significant decimal digits))
            6.  double  is 8 bytes (approximately ±1.79769313486231570E+308(15 significant decimal digits))
            7.  char    is 2 byte 	0 to 65,536 (unsigned)
            8.  boolean is not precisely defined* 	true or false

		 * 
		 */


		double abc = 102.123;  // variable to variable conversion
		int xyz = (int) abc; 
		
		
		int i1 = 125;             // variable to variable conversion - Downcasting
		byte b1 = (byte) i1;
		
		byte b2 = 120;            // variable to variable conversion - Upcasting
		int i2 = (int) b2;
		
		System.out.println(xyz);

	}

}
