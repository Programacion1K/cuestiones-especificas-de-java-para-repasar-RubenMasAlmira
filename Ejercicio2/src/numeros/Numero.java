package numeros;

public class Numero {
    public static boolean esCuadradoPerfecto(int numero){
        return compruebaEntero(Math.sqrt(numero));
    }

    private static boolean compruebaEntero(double numero){
        String numeroEnString=numero+"";
        String decimales=numeroEnString.substring(numeroEnString.indexOf('.')+1);
        for(int i=0;i<decimales.length();i++){
            if(decimales.charAt(i)!='0'){
                return false;
            }
        }
        return true;

    }
}
