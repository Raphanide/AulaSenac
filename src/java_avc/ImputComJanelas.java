package java_avc;

import javax.swing.*;

public class ImputComJanelas {
    public static void main(String[] args) {
        String nome = "";
        nome = JOptionPane.showInputDialog("Insira seu nome: ");
        String msg = "Olá, " +nome+" !";
        System.out.println(msg);
        JOptionPane.showMessageDialog(null, msg);
    }
}
