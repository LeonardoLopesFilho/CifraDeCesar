

import java.util.Scanner;


public class CifradeCesar {

    public static void main(String[] args) {
    	Scanner teclado = new Scanner(System.in);
       Criptografida cpr = new Criptografida();
        System.out.println("Digite a mensagem: ");
        cpr.setMensagem(teclado.nextLine());
        System.out.println("Digite a CHAVE: ");
        cpr.setChave(teclado.nextInt());
        teclado.close();
    }
}