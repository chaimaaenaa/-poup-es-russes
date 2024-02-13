import java.util.Scanner;

import static java.lang.System.exit;

class Menu {
    public void menu() {
        Scanner p = new Scanner(System.in);
        int taille1, taille2 ,taille3;

        System.out.println("__MENU__");
        System.out.println("Enter the taille of the first doll:");
        taille1 = p.nextInt();
        System.out.println("Enter the taille of the second doll:");
        taille2 = p.nextInt();
        System.out.println("Enter the taille of the POUpee 3:");
        taille3 = p.nextInt();

        PoupeeRusse russianDoll1 = new PoupeeRusse(taille1);
        PoupeeRusse russianDoll2 = new PoupeeRusse(taille2);
        PoupeeRusse russianDoll3 = new PoupeeRusse(taille3);

        int choice;
        do {
            System.out.println("** Menu **");
            System.out.println("click sur 1 pour ouvrire un poupee :");
            System.out.println("click sur 2 pour fermer un ");
            System.out.println("click sur 3 pour deplacer un poupee  dans");
            System.out.println("click sur 4 pour sortir un poupee  ");
            System.out.println("quitter");

            System.out.println("Your choice:");
            choice = p.nextInt();
                switch (choice) {
                    case 1:
                        System.out.println("Choose 1 to open Doll1 or 2 to open Doll2 or 3 to open doll3:");
                        int choic = p.nextInt();
                        if (choic == 1) {
                            russianDoll1.open();
                        } else if (choic == 2) {
                            russianDoll2.open();
                        }
                            else if (choic == 3) {
                                russianDoll3.open();
                        } else {
                            System.out.println("Invalid choice.");
                        }
                        break;
                    case 2:
                        System.out.println("Choose 1 to close Doll1 or 2 to close Doll2 or 3 to close doll3:");
                        int choi = p.nextInt();
                        if (choi == 1) {
                            russianDoll1.close();
                        } else if (choi == 2) {
                            russianDoll2.close();
                        }
                        else if (choi == 3) {
                            russianDoll3.close();
                        } else {
                            System.out.println("Invalid choice.");
                        }
                        break;
                    case 3:
                        System.out.println(" Choose 1 to deplacer Doll1 or 2 to deplacer Doll2 or 3 to deplacer doll3 Choose 0 for exit:");
                        int cho = p.nextInt();



                        if (cho == 1){
                            russianDoll1.placeIn(russianDoll2);

                        } else if (cho == 2) {
                            russianDoll2.placeIn(russianDoll1);

                        } else if (cho == 3) {
                            russianDoll3.placeIn(russianDoll1);
                        }
                        else if  (cho == 0){
                           exit(0);
                        }
                        else {
                            System.out.println("invallide taille plus grand ");
                        }
                        System.out.println("valider");
                        break;
                    case 4:
                        System.out.println(" Choose 1 to sorti Doll1 or 2 to sorti Doll2 or 3 to sorti doll3 Choose 0 for exit:");
                        int ch = p.nextInt();



                        if (ch == 1){
                            russianDoll1.getOutOf(russianDoll2);

                        } else if (ch == 2) {
                            russianDoll2.getOutOf(russianDoll1);

                        } else if (ch == 3) {
                            russianDoll3.getOutOf(russianDoll1);
                        }
                        else if  (ch == 0){
                            exit(0);
                        }
                        else {
                            System.out.println("invallide taille plus grand ");
                        }
                        System.out.println("valider");
                        break;
                    case 0:
                        System.out.println("Have a good day.");
                        break;
                    default:
                        System.out.println("Your choice is invalid.");
                }
            } while (choice != 0);
        }


}