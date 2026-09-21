package ex2;

public class TestTemperature {
    public static void main(String[] args){
        Temperature t1, t2, t3, t4;
        t1 = new Temperature(25);
        t2 = new Temperature(25);
        t3 = new Temperature(100);
        t4 = new Temperature(-0.1);

        System.out.println("Temperature 1 is " + t1.getTempInCelsius());
        System.out.println("Temperature 2 is " + t2.getTempInCelsius());
        System.out.println("Temperature 3 is " + t3.getTempInCelsius());
        System.out.println("Temperature 4 is " + t4.getTempInCelsius());

        System.out.println("T3 + T4 = " + t3.addTempC(t4.getTempInCelsius()));

        System.out.println("Temperature 1 in Kelvin is " + t1.getTempInKelvin());
        System.out.println("Temperature 1 in Fahrenheit is " + t1.getTempInFahrenheit());

        System.out.println("T1 == T2 ? " + t1.testEqualityBetweenTempsCelsius(t2));
        System.out.println("T1 == T4 ? " + t1.testEqualityBetweenTempsCelsius(t4));
        System.out.println("T1 compared to T3 ? " + t1.compareTemperatures(t3));
        System.out.println("T1 compared to T4 ? " + t1.compareTemperatures(t4));
    }
}
