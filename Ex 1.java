public class Main {
    public static void main(String[] args) {

    int Lin = 3;
    int Tabela [][] = new int [Lin][3];
    Tabela [0][0] = 1;
    Tabela [0][1] = 2;
    Tabela [0][2] = 3;
    Tabela [1][0] = 4;
    Tabela [1][1] = 5;
    Tabela [1][2] = 6;
    Tabela [2][0] = 7;
    Tabela [2][1] = 8;
    Tabela [2][2] = 9;
    
    for (int i = 0; i < 3 ; i++ ){
        for (int j = 0; j < 3; j++){
            System.out.println(Tabela[i][j] + " ");
    }
} 
    
    System.out.println("O numero do meio da tabela e: " + Tabela[1][1]);

    }
}
