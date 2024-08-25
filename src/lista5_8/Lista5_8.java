package lista5_8;

import java.util.Arrays;
import javax.swing.JOptionPane;

public class Lista5_8 {
    public static void main(String[] args) {
        final int TAM = 5;
        final int LIMITECIMA = 100;
        int vet[] = new int [TAM];
        for(int x=0; x < TAM; x++){
            do{
                vet[x] = (int) (Math.random() * (LIMITECIMA+1));
            }while(vet[x] % 3 != 0);
        }
        JOptionPane.showMessageDialog(null, "Vetor: " +Arrays.toString(vet));
    }    
}
