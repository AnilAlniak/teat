
public class PrimitiveVariables {

	public static void main(String[] args) {
		
		byte byte_num = 127;
		short short_num = -32768;
		int int_num = 58451245;
		long long_num = 5250684515202545l;
		
		short short_num2 = 265;
		short short_num3 = 145;
		short result_short =  (short) (short_num2 + short_num3);
		
		byte byte_num2 = 45;
		byte byte_num3 = 25;
		byte result_byte = (byte)(byte_num2 + byte_num3);
		
		char char_test = '\u00E6';
		System.out.println(char_test + "\n");
		
		int int_num1 = 15;
		float float_num = 25.98989f;
		double double_num = 45.4324d;
		
		System.out.println("Integer number : " + int_num1);
		System.out.println("Float number : " + float_num);
		System.out.println("Double number : " + double_num);
		
		int int_num2 = 5/3;
		float float_num2 = 5/3f ;
		double double_num2 = 5/3d;
		
		System.out.println("\nInteger number : " + int_num2);
		System.out.println("Float number : " + float_num2);
		System.out.println("Double number : " + double_num2);
		
		
		boolean isMale = true;
		boolean isFemale = false;
		
		int test_int = 0;
		
		System.out.println("Test int : " + test_int);
		
	}
	
	
	
}
