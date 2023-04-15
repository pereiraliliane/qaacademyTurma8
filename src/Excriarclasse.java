public class Excriarclasse {
    public static String texto(String primeiroTexto, String segundoTexto){
        String resultado = "primeiroTexto "+"segundoTexto";
        return resultado;

    }

    public static void main(String[] args){
        String primeiroTexto = "Primeiro texto leitura";
        String segundoTexto = "Segundo texto concatena";
        System.out.println(texto(primeiroTexto, segundoTexto));
    
    }
}
