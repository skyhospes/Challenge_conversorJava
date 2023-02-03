package conversor;

import javax.swing.JOptionPane;

public class Principal {
    
    public static void main(String[] args) {
        
        FunctionMoneda monedas = new FunctionMoneda();
        FunctionTemperatura temperatura = new FunctionTemperatura();
        
        while (true){
        String opciones = (JOptionPane.showInputDialog(null,
        "Seleccione una obcioinde conversion", "Menu", 
        JOptionPane.QUESTION_MESSAGE, null,
        new Object[] {"Coversor de Moneda", "Conversor de Temperatura"},
        "Seleccion")).toString();
        
        switch (opciones) {
            case "Coversor de Moneda":{
                String input = JOptionPane.showInputDialog("Ingrese un valor para convertir");
                
                if(ValidarNumero(input) == true) {
                double valorRecibido = Double.parseDouble(input);
                monedas.ConvertirMonedas(valorRecibido);
                
                int respuesta=JOptionPane.showConfirmDialog(null,"¿Deseas realizar otra conversion?");
                    if (JOptionPane.OK_OPTION == respuesta){
                     	System.out.println("Selecciona opción Afirmativa");
                    }else {
                        JOptionPane.showMessageDialog(null, "Programa terminado");
                    }
                }else {
                    JOptionPane.showMessageDialog(null, "Valor invalido");
                }
                break;
            }
                
            case "Conversor de Temperatura":{
                String input = JOptionPane.showInputDialog("Ingrese el valor de la temperatura para convertir");
                
                if(ValidarNumero(input) == true) {
                double valorRecibido = Double.parseDouble(input);
                temperatura.ConvertirTemperatura(valorRecibido);
                
                int respuesta = 0;
                respuesta = JOptionPane.showConfirmDialog(null, "¿Desea continuar?");
                if((respuesta == 0) && (ValidarNumero(input) == true)) { 
                } else {
                    JOptionPane.showMessageDialog(null, "Programa terminado");                     
                }
                
                } else {
                 JOptionPane.showMessageDialog(null, "Valor inválido");                
                }
                break;
                
            }
        }
    }
    }
    
    public static boolean ValidarNumero(String input) {
        try {
            double x = Double.parseDouble(input);
            if(x >= 0 || x < 0);
                return true;
            } catch (NumberFormatException e) {
                return false;
            }
    }
    
}
