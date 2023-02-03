package conversor;

import javax.swing.JOptionPane;

/**
 * @author Skyhospes
 */

public class ConvertirMoneda {

    public void ConvertirPesosColombianosADolare(double valorRecibido){
        double monedaDolar = valorRecibido / 4682.49;
        monedaDolar = (double) Math.round(monedaDolar * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Tienes $ " + monedaDolar + " Dolares");
    }
    
    public void ConvertirDolaresAPesosColombianos(double valorRecibido){
        double monedaPeso = valorRecibido / 0.00021;
        monedaPeso = (double) Math.round(monedaPeso * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Tienes $ " + monedaPeso + " Pesos");
    }
    
    public void ConvertirPesosColombianosAEuros(double valorRecibido){
        double monedaEuro = valorRecibido / 5111.03;
        monedaEuro = (double) Math.round(monedaEuro * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Tienes $ " + monedaEuro + " Euros");
    }
    
    public void ConvertirEurosAPesosColombianos(double valorRecibido){
        double monedaPeso = valorRecibido / 0.00020;
        monedaPeso = (double) Math.round(monedaPeso * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Tienes $ " + monedaPeso + " Pesos");
    }
}
