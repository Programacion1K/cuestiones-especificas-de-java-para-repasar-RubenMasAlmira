public class EjemploBreak {
    public static void main(String[] args) {
        //Bucle infinito que imprime numeros,con el if lo que hacemos es parar el bucle cuando llega a 5 gracias al break.
        int i=0;
        do{
            i++;
            System.out.println(i);
            if(i==5){break;}
        }while(true);
    }
}
