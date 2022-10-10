import java.util.Scanner;
import java.lang.Math;

public class Problem_04
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter investment amount: ");
		double amount = sc.nextDouble();

		System.out.print("Enter annual interest rate in percentage: ");
		double annualInterestRate = sc.nextDouble();
		double monthlyInterestRate = annualInterestRate / (12*100);

		System.out.print("Enter number of years: ");
		int years = sc.nextInt();

		double futureInvestmentValue = amount * Math.pow(1 + monthlyInterestRate, years * 12);

		System.out.println("Accumulated value is $" + futureInvestmentValue);
    }
}
