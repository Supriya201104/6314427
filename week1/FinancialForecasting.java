import java.util.Scanner;
public class FinancialForecasting 
{
    static double predictFutureValue(double currentValue, double growthRate, int years) 
    {   
        if (years == 0) 
        {
            return currentValue;
        }
        double nextValue = currentValue * (1 + growthRate);
        return predictFutureValue(nextValue, growthRate, years - 1);
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter current value: ");
        double currentValue = sc.nextDouble();
        System.out.println("Enter annual growth rate: ");
        double growthRate = sc.nextDouble();
        System.out.println("Enter number of years: ");
        int years = sc.nextInt();
        double res = predictFutureValue(currentValue, growthRate, years);
        System.out.println("Future Value is "+ res);
    }
}