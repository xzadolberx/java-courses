import java.math.*;

public class Calculate {


	public static BigInteger multiplyLongNumbers (long firstMultipler, long secondMultipler)
	{

		BigInteger firstFactor, secondFactor;
		firstFactor = BigInteger.valueOf(firstMultipler);
		secondFactor = BigInteger.valueOf(secondMultipler)
		return firstFactor.multiply(secondFactor);
	}
	public static BigInteger powerLong (long longNumber, long longPower) //не закончено
																	     //TODO: придумать как возвести long в степень long
	{
		BigInteger biPrime, biPower;
		biPrime = BigInteger.valueOf(longNumber);
		biPower = BigInteger.valueOf(longPower);

	}

	public static void main (String[] arg) {
		System.out.println("Calculate...");

	if ( ((arg[0].length()) & (arg[1].length())) <=10)
	{
			int first = Integer.valueOf(arg[0]);
			int second = Integer.valueOf(arg[1]);


			int summ = first + second;
			int diff = first - second;
			int mult = first * second;
			double div = (double)first / second;
			long a_first = first;
			for ( int i=1; i<second; i++) {
		 		a_first = a_first * first;}	
		
		System.out.println("Sum = " +summ);
		System.out.println("Diff = " +diff);
		System.out.println("mult = " +mult);
		System.out.println("div = " +div);
		System.out.println("pow = " + a_first ); 

			
	}
	else if  ( ((arg[0].length()) & (arg[1].length())) <=20) 
	{	
			long first = Long.valueOf(arg[0]);
			long second = Long.valueOf(arg[1]);

			long summ = first + second;
			long diff = first - second;
			long mult = first * second;
			double div = (double)first / second;
			long a_first = first;
			for ( int i=1; i<second; i++) {
			 	a_first = a_first * first;}	


			int summ = first + second;
			int diff = first - second;
			int mult = first * second;
			double div = (double)first / second;
			long a_first = first;
			for ( int i=1; i<second; i++) {
		 		a_first = a_first * first;}	

		
		System.out.println("Sum = " +summ);
		System.out.println("Diff = " +diff);
		System.out.println("mult = " +mult);
		System.out.println("div = " +div);
		System.out.println("pow = " + a_first ); 

			
	}
	else if  ( ((arg[0].length()) & (arg[1].length())) <=20) 
	{	
			long first = Long.valueOf(arg[0]);
			long second = Long.valueOf(arg[1]);

			long summ = first + second;
			long diff = first - second;
			long mult = first * second;
			double div = (double)first / second;
			long a_first = first;
			for ( int i=1; i<second; i++) {
			 	a_first = a_first * first;}	
		
		System.out.println("Sum = " +summ);
		System.out.println("Diff = " +diff);
		System.out.println("mult = " +mult);
		System.out.println("div = " +div);
		System.out.println("pow = " + a_first ); 

	}



	}


	}

}