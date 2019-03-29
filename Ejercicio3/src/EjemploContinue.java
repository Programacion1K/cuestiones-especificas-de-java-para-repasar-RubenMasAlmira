public class EjemploContinue {
    public static void main(String[] args) {
     //Bucle for que recorre un String y salta la posición 2 gracias al continue
     String string="hola";
     for(int i=0;i<string.length();i++){
         if(i==2){continue;}
         System.out.println(string.charAt(i));
     }
    }
}
