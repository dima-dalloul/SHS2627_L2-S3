package ex2;

public class Temperature {
    //--------------- Variables ---------------
    private double tempInCelsius, tempInKelvin, tempInFahrenheit;

    //--------------- Constructor ---------------
    public Temperature(double newTempInCelsius){
        tempInCelsius = newTempInCelsius;
        tempInKelvin = getTempInKelvin();
        tempInFahrenheit = getTempInFahrenheit();
    }

    //--------------- Methods ---------------
    public double addTempC(double tempToAddInCelsius){
        tempInCelsius += tempToAddInCelsius;
        // the line before is equal to
        // tempInCelsius = (tempInCelsius + tempToAdd)
        return tempInCelsius;
    }

    public double getTempInCelsius(){
        return tempInCelsius;
    }

    // K=C+273,15
    public double getTempInKelvin() {
        tempInKelvin = tempInCelsius + 273.15;
        return tempInKelvin;
    }

    // F=(9/5*C)+32
    public double getTempInFahrenheit(){
        tempInFahrenheit = ( 9/5 * tempInCelsius) + 32;
        return tempInFahrenheit;
    }

    public boolean testEqualityBetweenTempsCelsius(Temperature t){
        return (this.tempInCelsius == t.getTempInCelsius());
    }

    public int compareTemperatures(Temperature t){
        if(this.tempInCelsius == t.getTempInCelsius())
            // The temperatures are equal => return 0
            return 0;
        else if (this.tempInCelsius < t.getTempInCelsius())
            // the given temperature is higher than the one we have => return -1
            return -1;
        else
            // the given temperature is lower than the one we have => return +1
            return 1;
    }
}
