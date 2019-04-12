import javax.swing.*;
import java.time.DayOfWeek;
import java.time.Year;
import java.time.format.TextStyle;
import java.time.temporal.TemporalField;
import java.util.*;

public class Cumpleanyos {
    public static final int diaCumpleanyos = 26;
    public static final int MesCumpleanyos = 9;
    public static final int ANYOS_A_AVANZAR = 10;

    public static void main(String[] args) {
        /*String fechaUsuario;
        fechaUsuario=JOptionPane.showInputDialog(null,
                "Introduzca su fecha de cumpleaños",
                "Cumpleaños",
                JOptionPane.QUESTION_MESSAGE);*/

        Calendar cumpleañosDelUsuario=new GregorianCalendar();
        int anyo = new GregorianCalendar().get(Calendar.YEAR);
        cumpleañosDelUsuario.set(diaCumpleanyos, MesCumpleanyos, anyo);

        DayOfWeek[] diasDeLaSemana=DayOfWeek.values();
        Locale l = new Locale("es","PE");



        for(int i=1;i< ANYOS_A_AVANZAR+1;i++){
            cumpleañosDelUsuario.set(diaCumpleanyos,MesCumpleanyos,anyo++);
            DayOfWeek diaCumpleanyos=diasDeLaSemana[cumpleañosDelUsuario.get(Calendar.DAY_OF_WEEK)-1];

            System.out.println("Año "+i+" tu cumpleaños caerá: "+ diaCumpleanyos.getDisplayName(TextStyle.FULL, l));
        }
    }

}
