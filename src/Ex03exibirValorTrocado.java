import javax.swing.JOptionPane;

public class Ex03exibirValorTrocado {

    public static void main(String[] args) {

        int valor1 = Integer.parseInt( JOptionPane.showInputDialog("Digite o primeiro número"));
        int valor2 = Integer.parseInt( JOptionPane.showInputDialog("Digite o segundo número"));
        int valor3 = 0;
        valor3=valor2;
        valor2=valor1;
        valor1=valor3;
        System.out.println("primeiro valor "+valor1);
        System.out.println("segundo valor "+valor2);
    }
}