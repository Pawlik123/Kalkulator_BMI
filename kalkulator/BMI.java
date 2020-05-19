package kalkulator;

import java.util.Scanner;

public class BMI {
	public static void main(String[] args){
		System.out.println("Twoja waga");
		Scanner in=new Scanner(System.in);
		double a=in.nextInt();
		
		System.out.println("Wzrost");
		Scanner aa=new Scanner(System.in);
		double b=aa.nextInt();
		
		double wynik=b/100;
		wynik=Math.pow(wynik, 2);
		System.out.println(wynik);	
		
		double bmi=a/wynik;
		System.out.println(bmi);
		
		if(bmi<=18.5){
			System.out.println("niedowaga");
		}
		
		else if (bmi>=18.5 && bmi<=24.99){
			System.out.println("optimum");
		}
		
		else if (bmi>=25.0 &&  bmi<=29.99){
			System.out.println("nadwaga");
		}
		
		else if(bmi>=30.0 && bmi<=34.99){
			System.out.println("oty³oœæ I i II stopnia");	
		}
		
		else {
			System.out.println("oty³oœæ III stopnia");
	}

}
}

