import java.util.Scanner;

public class Menu {
    public int MainMenuOptionChosen;

    public void showMainMenu() {
        for (int loopMainMenu = 0; loopMainMenu == loopMainMenu; loopMainMenu++) {
            System.out.println("Welcome to car rental");
            System.out.println("\t 1. List available cars");
            System.out.println("\t 2. Edit rental price");
            System.out.println("\t 3. Add new car");
            System.out.println("\t 4. List active users");
            System.out.println("\t 5. Add user");
            System.out.println("\t 6. Activate a user");
            System.out.println("\t 7. Rent a car");
            System.out.println("\t 8. List all rented cars");
            System.out.println("\t 9. Return a car");
            System.out.println("\t 10. Display monthly report");
            System.out.println("\t 11. Display yearly report");
            System.out.println("\t 12. Exit");
            System.out.print("Choose your option: ");
            Scanner scanner = new Scanner(System.in);
            int chosenOptionMainMenu = scanner.nextInt();
            if (chosenOptionMainMenu < 1 || chosenOptionMainMenu > 12) {
                for (int askingLoop = 0; askingLoop == askingLoop; askingLoop++) {
                    System.out.println("Number is not on the list.");
                    System.out.println("Do you want to come back to main menu?");
                    System.out.println("\t 1. yes");
                    System.out.println("\t 2. no");
                    System.out.print("Choose your option: ");

                    int wantToComeBackInt = scanner.nextInt();
                    switch (wantToComeBackInt) {
                        case 1:
                            askingLoop = -1;
                            break;
                        case 2:
                            askingLoop = -1;
                            loopMainMenu = -1;
                            chosenOptionMainMenu = 12;
                            break;
                        default:


                    }
                    if (askingLoop == -1) {
                        break;

                    }
                }
            }else{
            loopMainMenu = -1;
            if (loopMainMenu == -1) {
                //System.out.println("Thank You for using everyCarRental, We hope to see you back!");
                MainMenuOptionChosen = chosenOptionMainMenu;
                break;
            }
            }

        }
    }

    public void showMenuSwitcher(Menu menu){
        int chosenMainMenuInt = menu.MainMenuOptionChosen;
        System.out.println("chosenMainMenuInt = " + chosenMainMenuInt);


        switch (chosenMainMenuInt) {
            case 1:
                menu.showMenuListAvailableCars();
                break;
            case 2:
                menu.showMenuEditRentalPrice();
                break;
            case 3:
                menu.showMenuAddNewCar();
                break;
            case 4:
                menu.showMenuListActiveUsers();
                break;
            case 5:
                menu.showMenuAddUser();
                break;
            case 6:
                menu.showMenuActivateUser();
                break;
            case 7:
                menu.showMenuRentCar();
                break;
            case 8:
                menu.showMenuListRentedCars();
                break;
            case 9:
                menu.showMenuReturnCar();
                break;
            case 10:
                //tutaj ma byc display monthly report
                break;
            case 11:
                //tutaj ma byc display yearly report
                break;
            case 12:
                System.out.println("Thank you for your interest in *EveryCarRental*. We hope to see you again!");
        }
    }

    public void showMenuListAvailableCars() {

    }

    public void showMenuEditRentalPrice() {

    }

    public void showMenuAddNewCar() {

    }

    public void showMenuListActiveUsers() {

    }

    public void showMenuAddUser() {

    }

    public void showMenuActivateUser() {

    }

    public void showMenuRentCar() {

    }

    public void showMenuListRentedCars() {

    }

    public void showMenuReturnCar() {

    }



}


