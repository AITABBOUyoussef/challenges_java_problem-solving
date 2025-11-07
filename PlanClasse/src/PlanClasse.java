import java.util.Scanner;
public class PlanClasse {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez le nombre d'étudiants (N): ");
        int N = scanner.nextInt();

        System.out.print("Entrez le nombre de bancs (M): ");
        int M = scanner.nextInt();

        System.out.println("--- Plan de Répartition ---");

        int studentId = 1;

        for (int b = 1; b <= M; b++) {

            System.out.print("Banc " + b + ": ");

                 if (studentId <= N) {
                System.out.print("Étudiant " + studentId);
                studentId++;
            }
                 if (studentId <= N) {
                System.out.print(", Étudiant " + studentId);
                studentId++;
            }else {

                     System.out.print(", (Vide)");
                 }
            System.out.println();
        }


        System.out.println("--- Étudiants restants ---");
        if (studentId > N) {
            System.out.println("Tous les étudiants ont trouvé une place.");
        } else {

            while (studentId <= N) {
                System.out.println("Étudiant " + studentId + " ne trouve pas de place");
                studentId++;
            }
        }

        scanner.close();
    }
}