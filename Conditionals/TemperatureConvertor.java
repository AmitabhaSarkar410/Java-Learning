import java.util.Scanner;
public class TemperatureConverter//class start
{
    public static void main(String Args[])//main method start
    {
        int sw;//switch case variable
        double Farenheit=0.0, Celcius=0.0;//values of temperature in celcuis in farenheit
        Scanner sc = new Scanner(System.in);//scanner object sc initiated
        System.out.println("Enter \n1 for Celcius to Farenheit \n2 for Farenheit to Celcius");
        sw = sc.nextInt();//stores user's choice 
        switch (sw) //switch case starts
        {
            case 1:
                System.out.print("Enter temperature in celcius: ");
                Celcius=sc.nextInt();
                Farenheit=9/5*Celcius+32;//formula to convert celcius to farenheit
                break;
            case 2:
            System.out.print("Enter temperature in farenheit: ");
            Farenheit=sc.nextInt();
            Celcius=(Farenheit-32)*5/9;//formula to calculate celcius from farenhiet
                break;
        
            default:
                System.out.println("Wrong number choosed");
        }
        sc.close();//closes scanner object sc
        System.out.println("Temperature in Celcius: "+Celcius);
        System.out.print("Temperature in Farenheit: "+Farenheit);
    }
}
