package ejercicios.clases.wrappers;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// byte, tipo primitivo
		System.out.println("1. byte");
		byte datoByte = 2; // primitivo
		Byte datoByteWrapper = 3; // byte, Wrapper
		System.out.println("primitivo: " + datoByte);
		System.out.println("Wrapper: " + datoByteWrapper);
		// conversiones
		byte datoByte1 = 6;
		Byte datoConvertido = datoByte1;
		System.out.println("Byte convertido: " + datoConvertido);
		// Conversion 2
		Byte datoConvertido2 = 5;
		byte datoByte2 = datoConvertido2.byteValue();
		System.out.println("byte convertido: " + datoByte2);

		// short
		System.out.println("2. short");
		short datoShort = 1; // primitivo
		Short datoShortWrapper = 1; // Wrapper
		System.out.println("primitivo: " + datoShort);
		System.out.println("Wrapper: " + datoShortWrapper);
		// conversiones
		short datoShort1 = 4;
		Short shortConvertido = datoShort1;
		System.out.println("Short convertido: " + shortConvertido);
		// Conversion 2
		Short datoShortCovertido = 12;
		short datoShort2 = datoShortCovertido.shortValue();
		System.out.println("short convertido: " + datoShort2);

		// int
		System.out.println("3. int");
		int edad = 45; // primitivo
		Integer edadWrapper = 48; // Wrapper
		System.out.println("primitivo: " + edad);
		System.out.println("Wrapper: " + edadWrapper);
		// Conversiones
		int edad1 = 45;
		Integer integerConvertido = edad1;
		System.out.println("Integer convertido: " + integerConvertido);
		// Conversion 2
		Integer integerConvertido2 = 6;
		int edad2 = integerConvertido2.intValue();
		System.out.println("int convertido: " + edad2);

		// long
		System.out.println("4. long");
		long valorGrande = 12312L;// primitivo
		long valorGrandeWrapper = 123312L;// Wrapper
		System.out.println("primitivo: " + valorGrande);
		System.out.println("Wrapper: " + valorGrandeWrapper);
		// Conversiones
		long valorLong = 451234L;
		Long longConvertido = valorLong;
		System.out.println("Long convertido: " + longConvertido);
		// Conversion 2
		Long longConvertido2 = 6123123L;
		long datoLong1 = longConvertido2.longValue();
		System.out.println("long convertido: " + datoLong1);

		// boolean
		System.out.println("5. boolean");
		boolean boolean1 = true; // primitivo
		Boolean boolean1Wrapper = true; // Wrapper
		System.out.println("primitivo: " + boolean1);
		System.out.println("Wrapper: " + boolean1Wrapper);
		// Conversiones
		boolean valorBoolean = true;
		Boolean booleanConvertido = valorBoolean;
		System.out.println("Boolean convertido: " + booleanConvertido);
		// Conversion 2
		Boolean booleanConvertido2 = false;
		boolean datoBoolean2 = booleanConvertido2.booleanValue();
		System.out.println("boolean convertido: " + datoBoolean2);

		// float
		System.out.println("6. float");
		float numeroDecimal = 12.12F; // primitivo
		Float numeroDecimalWrapper = 12.12F; // Wrapper
		System.out.println("primitivo: " + numeroDecimal);
		System.out.println("Wrapper: " + numeroDecimalWrapper);
		// Conversiones
		float valorFloat = 45.12F;
		Float floatConvertido = valorFloat;
		System.out.println("Float convertido: " + floatConvertido);
		// Conversion 2
		Float floatConvertido2 = 123.23F;
		float datoFloat2 = floatConvertido2.floatValue();
		System.out.println("float convertido: " + datoFloat2);

		// double
		System.out.println("7. double");
		double numeroGrandeDecimal = 122321.23;// primitivo
		double numeroGrandeDecimalWrapper = 122321.23;// Wrapper
		System.out.println("primitivo: " + numeroGrandeDecimal);
		System.out.println("Wrapper: " + numeroGrandeDecimalWrapper);
		// Conversiones
		double valorDouble = 45234.12345;
		Double doubleConvertido = valorDouble;
		System.out.println("Double convertido: " + doubleConvertido);
		// Conversion 2
		Double doubleConvertido2 = 12345.1234;
		double datoDouble2 = doubleConvertido2.doubleValue();
		System.out.println("double convertido: " + datoDouble2);

		// char
		System.out.println("8. char");
		char caracter = 'a'; // primitivo
		Character caracterWrapper = 'a';// Wrapper
		System.out.println("primitivo: " + caracter);
		System.out.println("Wrapper: " + caracterWrapper);
		// Conversiones
		char valorChar = 'y';
		Character characterConvertido = valorChar;
		System.out.println("Character convertido: " + characterConvertido);
		// Conversion 2
		Character characterConvertido2 = 'z';
		char datoChar2 = characterConvertido2.charValue();
		System.out.println("char convertido: " + datoChar2);

	}

}
