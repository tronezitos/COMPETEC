import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {

        int NumeroFinal;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Escreva um número");
        int NumeroTabuada = sc.nextInt();
        
        for (int Tabuada = 1; Tabuada <= 10 ; Tabuada++){
            NumeroFinal = NumeroTabuada * Tabuada;
            System.out.println(NumeroFinal);
        } 

        
    }
}
