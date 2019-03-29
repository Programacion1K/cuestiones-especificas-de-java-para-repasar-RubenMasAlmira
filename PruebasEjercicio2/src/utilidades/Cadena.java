package utilidades;

import javax.swing.*;

public class Cadena {
    public static String inicialEnMayuscula(String cadenaACambiar){
        return cadenaACambiar.toUpperCase().charAt(0)+cadenaACambiar.substring(1).toLowerCase();
    }

    public static String camelCase(String cadenaACambiar){
        String cadenaCambiada="";
        while(cadenaACambiar.indexOf(' ')>0) {
            cadenaCambiada=encuentraEspacioYJunta(cadenaACambiar);
            cadenaACambiar=cadenaCambiada;
        }
        return cadenaCambiada;
    }

    private static String encuentraEspacioYJunta(String cambio){
        String salida="";
        try {
            int espacio = cambio.indexOf(' ');
            salida += cambio.substring(0, espacio) + cambio.substring(espacio + 1, espacio + 2).toUpperCase() + cambio.substring(espacio + 2);
        }catch (StringIndexOutOfBoundsException sioe){
            JOptionPane.showMessageDialog(null,"No se ha encontrado ningún espacio","Error",JOptionPane.ERROR_MESSAGE);
        }

        return salida;
    }
}
