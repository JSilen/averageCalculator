import java.util.Scanner;

public class Keskiarvo {
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        System.out.println("Ohjelma laskee syötettyjen arvosanojen keskiarvon.");
        System.out.println("Lopetus negatiivisella kokonaisluvulla.\n");
        
        double syotettyArvosana;
        double arvosanojenSumma = 0;
        int lukumaara = 0;
        
        do {
            System.out.print("Anna arvosana (4-10): ");
            syotettyArvosana = lukija.nextDouble();
            
            if (syotettyArvosana >= 4 && syotettyArvosana <= 10) {
                arvosanojenSumma += syotettyArvosana;
                lukumaara++;
            } else if (syotettyArvosana >= 0) {
                System.out.println("Antamasi arvosana ei kelpaa!");
            }
        } while (syotettyArvosana >= 0);
        
        if (lukumaara == 0) {
            System.out.println("\nEt antanut yhtään arvosanaa.");
        } else {
            double keskiarvo = arvosanojenSumma / lukumaara;
            System.out.println("\nSyötetty " + lukumaara + " arvosanaa.");
            System.out.println("Arvosanojen keskiarvo: " + keskiarvo);
        }
        
        lukija.close();
    }
}