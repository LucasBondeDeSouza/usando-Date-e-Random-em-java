import java.util.Random;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;

public class App {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        Date agora = new Date();
        SimpleDateFormat formato = new SimpleDateFormat("HH:mm:ss");

        int numeroAleatorio = random.nextInt(10);
        int numero;
        int tentativas;
        String horaAtual = formato.format(agora);

        tentativas = 0;

        do {
            System.out.println("Digite um número entre 0 e 10: ");
            numero = sc.nextInt();
            tentativas++;
        } while(numero != numeroAleatorio);

        System.out.println("Você acertou o número "+numeroAleatorio+ " em " +tentativas+ " tentativas!\nÁs: "+horaAtual);
    }
}