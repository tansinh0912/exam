import utils.Manager;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        do {
            Manager.printMenu();

            int choose = scanner.nextInt();

            switch (choose){
                case 1:
                    Manager.inputInf();
                case 2:
                    Manager.showInf();
            }
        }while (true);
    }
}