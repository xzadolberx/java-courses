public class Calculate {

	public static void main (String[] arg) {
		System.out.println("Calculate...");
		int first = Integer.valueOf(arg[0]);
		int second = Integer.valueOf(arg[1]);
		int summ = first + second;
		int diff = first - second;
		int mult = first * second;
		double div = (double)first / second;

		int a_first = first;
		for ( int i=1; i<second; i++) {
			 a_first = a_first * first;}	

		System.out.println("Sum = " +summ);
		System.out.println("Diff = " +diff);
		System.out.println("mult = " +mult);
		System.out.println("div = " +div);
		System.out.println("pow = " + a_first ); 

	}

}