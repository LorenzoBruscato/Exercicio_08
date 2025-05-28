package exercicio_08;

import javax.swing.JOptionPane;

/**
 *
 * @author Lorenzo
 */
public class Exercicio_08 {

    public static void main(String[] args) {
        String num1Str = JOptionPane.showInputDialog("Digite o primeiro número inteiro:");
        String num2Str = JOptionPane.showInputDialog("Digite o segundo número inteiro:");

        int num1 = Integer.parseInt(num1Str);
        int num2 = Integer.parseInt(num2Str);
        int soma = num1 + num2;

        JOptionPane.showMessageDialog(null, "A soma dos dois números é: " + soma);
    }
}
