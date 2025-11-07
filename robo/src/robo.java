

import  java.util.Scanner;

public class robo {
    public static void main(String[] args) {
        int x = 0;
        int y = 0;
                Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez les commandes (ex: UP, RIGHT, LEFT, DOWN): ");
        String input = scanner.nextLine();
                String[] commandes = input.split(", ");


        for (int i = 0; i < commandes.length; i++) {
            String cmd = commandes[i];
            if (cmd.equals("UP")) {
                y++;
            } else if (cmd.equals("DOWN")) {
                y--;
            } else if (cmd.equals("RIGHT")) {
                x++;
            } else if (cmd.equals("LEFT")) {
                x--;
            }
        }
                System.out.println("Position finale: (" + x + ", " + y + ")");
        if (x == 0 && y == 0) {
           System.out.println("Le robot est revenu au point de départ");
        }

        scanner.close();
    }
}