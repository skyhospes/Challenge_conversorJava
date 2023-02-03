package conversor;

import javax.swing.JOptionPane;

/**
 * @author Skyhospes
 */

public class ConvertirTemperatura {
    
    public void ConvertirCelciusAKelvin(double valorRecibido){
	double tempkelvin = valorRecibido + 273.15;
        tempkelvin = (double) Math.round(tempkelvin *100d)/100;
        JOptionPane.showMessageDialog(null,"Los" + valorRecibido
                + " grados Celcius son " + tempkelvin + "grados Kelvin");
    }
    
    public double ConvertirKelvinACelcius(double valorRecibido) {
	double tempCelcius = valorRecibido - 273.15;
        tempCelcius = (double) Math.round(tempCelcius *100d)/100;
        JOptionPane.showMessageDialog(null, "Los " + valorRecibido
                + " grados Kelvin son " + tempCelcius + " grados Celcius.");
        return tempCelcius;
    }

    public void ConvertirCelsiusAFahrenheit(double valorRecibido){
        double tempFahrenheit = valorRecibido * 1.8 + 32;
        tempFahrenheit = (double) Math.round(tempFahrenheit * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Los " + valorRecibido
                + " grados Celsius son " + tempFahrenheit + " grados Fahrenheit.");
    }
    
    public void ConvertirFarenheitACelcius(double valorRecibido) {
		double tempCelcius = (valorRecibido - 32) / 1.8;
        tempCelcius = (double) Math.round(tempCelcius *100d)/100;
        JOptionPane.showMessageDialog(null, "Los " + valorRecibido
                + " grados Celsius son " + tempCelcius + " grados Fahrenheit.");
	}
}
