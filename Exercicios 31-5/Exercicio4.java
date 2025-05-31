import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o tamanho do vetor");
        int NumeroVetor = sc.nextInt();
        
        int Contador = 0;
        int Vetor[] = new int [NumeroVetor];
        
        while (Contador < NumeroVetor){
            System.out.println("Digite o proximo numero do Vetor");
            int ProximoVetor = sc.nextInt();
            Vetor[Contador] = ProximoVetor;
            Contador++;
}
        for (int i = 0;i < NumeroVetor; i++){
            System.out.println(Vetor[i] + "");
        }
    }
}