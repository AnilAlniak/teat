
public class Operators {

	public static void main(String[] args) {
		// TODO write operators tommorrow
		// FIXME that task has high value
		// XXX This is not emerge
		// FIXME that task has highest value
		
		int previousResult;
		
		int result = 5-3;
		
		previousResult = result+8;
		System.out.println(result + "+8 =" + previousResult  );
		
		result = previousResult/2;
		System.out.println(previousResult + "/2 = " + result  );
		
		previousResult = result*10;
		System.out.println(result + "*10 = " + previousResult  );

		result = previousResult-20;
		System.out.println(previousResult + "- 20 =" + result  );
		
		previousResult = result%13;
		System.out.println(result + "% 13 = " + previousResult  );
		
		result = previousResult++;
		System.out.println(result + "++ =" + previousResult  );
		
		previousResult = result--;
		System.out.println(previousResult + "-- = " + result  );
		
		
		previousResult += 20;
		System.out.println("Result with shorthand (+)" +  previousResult);
		
		previousResult /= 12;
		System.out.println("Result with shorthand (/)" +  previousResult);
		
		previousResult *= 100;
		System.out.println("Result with shorthand (*)" +  previousResult);
		
		previousResult -= 50;
		System.out.println("Result with shorthand (-)" +  previousResult);
		
		int x = 2;
		int z = ++x;
		int y = --x;
		
		System.out.println("value of x : " + x);
		System.out.println("value of z : " + z);
		System.out.println("value of y : " + y);

		int a = 12;
		int b = a;
		a++;
		System.out.println(a);
		System.out.println(b);

		
		
	}

}
