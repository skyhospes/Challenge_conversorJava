package conversor;

import javax.swing.JOptionPane;

/**
 * @author Skyhospes
 */

public class FunctionTemperatura {

    ConvertirTemperatura temperatura = new ConvertirTemperatura();
    
    public void ConvertirTemperatura(double valorRecibido){
        String opciones = (JOptionPane.showInputDialog(null,
        "Elije la temperatura que desea convertir ", "Temperatura", 
        JOptionPane.PLAIN_MESSAGE, null,
        new Object[] {
            "De Celcius a Kelvin", "De Kelvin a Celcius",
            "De Celsius a Fahrenheit", "De Farenheit a Celcius"},
        "Seleccion")).toString();
        
        switch (opciones) {
        case "De Celcius a Kelvin":{
            temperatura.ConvertirCelciusAKelvin(valorRecibido);
        }
        break;
        case "De Kelvin a Celcius":{
            temperatura.ConvertirKelvinACelcius(valorRecibido);
        }
        break;
        case "De Celsius a Fahrenheit":{
            temperatura.ConvertirCelsiusAFahrenheit(valorRecibido);
        }
        break;
        case "De Farenheit a Celcius":{
            temperatura.ConvertirFarenheitACelcius(valorRecibido);
        }
        break;
        }
    }
}
