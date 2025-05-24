import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {
        
        int Conta = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Escreva uma palavra");
        String Palavra = sc.nextLine();
        
        while(Conta < 5){
            System.out.println(Palavra);
            Conta++;
        }
        
    }
}
