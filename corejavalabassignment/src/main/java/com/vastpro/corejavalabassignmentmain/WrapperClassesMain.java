package com.vastpro.corejavalabassignmentmain;

public class WrapperClassesMain {
	public static void main(String[] args) {
		// primitive types
		byte b = 23;
		short s = 32;
		int i = 10;
		long l = 234L;
		float f = 123.3425f;
		double d = 123123.121324213;
		char ch = 'p';
		boolean bool = true;

		// Explicit Wrapping of primitives
		Byte bb = new Byte(b);
		Short ss = new Short(s);
		Integer ii = new Integer(i);
		Long ll = new Long(l);
		Float ff = new Float(f);
		Double dd = new Double(d);
		Character cc = new Character(ch);
		Boolean boool = new Boolean(bool);

		//Autoboxing of primitives
		Byte ab = b;
		Short as = s;
		Integer ai = i;
		Long al = l;
		Float af = f;
		Double ad = d;
		Character ach = ch;
		Boolean abool = bool;
		
		//Auto-Unboxing of Objects
		b = ab;
		s = as;
		i =ai;
		l = al;
		f = af;
		d = ad;
		ch = ach;
		bool = abool;

	}

}
