public class OperadoresBooleanos {
    public static void main(String[] args) throws InterruptedException {
        boolean falso=false;
        //Operador &
        System.out.println(falso&detenerElTiempo()? "":"El operador & comprueba las dos condiciones aunque la primera sea" +
                " falsa,por ello se para el tiempo" );

        //Operador&&
        System.out.println(falso&&detenerElTiempo()? "":"El operador && no comprueba las dos condiciones ya que al ser"+
        "la primera falsa se detiene y por ello no se para el tiempo" );

        //Operador |
        boolean verdadero=true;
        System.out.println(verdadero|detenerElTiempo()? "El operador | comprueba las dos condiciones aunque la priemra"+
                "sea verdadera,por ello se detiene el tiempo":"");

        System.out.println(verdadero||detenerElTiempo()? "El operador || no comprueba las dos condiciones,al ser la primera " +
                "verdadera no comprueba la segunda y por ello no se detiene el tiempo":"");


    }

    public static boolean detenerElTiempo() throws InterruptedException {
        Thread.sleep(4000);
        return true;
    }
}


