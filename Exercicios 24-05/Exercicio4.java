import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero impar");
        int NumeroImpar = sc.nextInt();
        
        for (int i = 1; i < NumeroImpar ;i = i + 2){
            System.out.println(i + " ");
        } 
       
    }
}
