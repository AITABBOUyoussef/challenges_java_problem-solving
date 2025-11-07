import java.util.Scanner;

public class Main {//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez un nombre: ");
        double nombre = scanner.nextInt();
        double totalAvantTaxe = 0;
        double nom = 0 ;
        double tva = 0 ;
        if (nombre > 300) {
            nom = ((nombre-300)*1.5) + 240 + 80 ;
            totalAvantTaxe = nom * 0.10 ;
            tva = totalAvantTaxe + nom;
            System.out.println("Facture avant taxe :" + nom+"DH");
            System.out.println(" Taxe (10%) :" + totalAvantTaxe + "DH");
            System.out.println(" Facture totale :" + tva+"DH");

        } else if (nombre > 100) {
            nom = ((nombre-100)*1.2) +80 ;
            totalAvantTaxe = nom * 0.10 ;
            tva = totalAvantTaxe + nom;
            System.out.println("Facture avant taxe :" + nom+"DH");
            System.out.println(" Taxe (10%) :" + totalAvantTaxe + "DH");
            System.out.println(" Facture totale :" + tva+"DH");

        } else {
          nom = nombre*0.8 ;
            System.out.println("Facture avant taxe :" + nom+"DH");
            totalAvantTaxe = nom * 0.10 ;
            tva = totalAvantTaxe + nom;
            System.out.println(" Taxe (10%) :" + totalAvantTaxe + "DH");
            System.out.println(" Facture totale :" + tva+"DH");
        }
         System.out.println();
        scanner.close();

    }
}

