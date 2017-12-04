package org.itstep;

public class AppRunner {

	public static void main(String[] args) {
		
		int num=18;
		
		String str=Integer.toString(num);
		char[] numArrey = str.toCharArray();
		int summ = 0;
		
		for(int i=0; i<numArrey.length; i++){
			summ = summ + Character.getNumericValue(numArrey[i]);
		}
		System.out.println("Value : " + summ);
	}

}
