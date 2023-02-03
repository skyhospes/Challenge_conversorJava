package conversor;

import javax.swing.JOptionPane;

/**
 * @author Skyhospes
 */

public class FunctionMoneda {
    
    ConvertirMoneda monedas = new ConvertirMoneda();
    
    public void ConvertirMonedas(double valorRecibido){
        String opciones = (JOptionPane.showInputDialog(null,
        "Elije la moneda a la que deseas convertir tu dinero ", "Monedas", 
        JOptionPane.PLAIN_MESSAGE, null,
        new Object[] {
            "De Pesos a Dolar", "De Dolar a Pesos",
            "De Pesos a Euros", "De Euros a Pesos"},
        "Seleccion")).toString();
        
        switch (opciones) {
        case "De Pesos a Dolar":{
            monedas.ConvertirPesosColombianosADolare(valorRecibido);
        }
        break;
        case "De Dolar a Pesos":{
            monedas.ConvertirDolaresAPesosColombianos(valorRecibido);
        }
        break;
        case "De Pesos a Euros":{
            monedas.ConvertirPesosColombianosAEuros(valorRecibido);
        }
        break;
        case "De Euros a Pesos":{
            monedas.ConvertirEurosAPesosColombianos(valorRecibido);
        }
        break;
    }
    }
}
