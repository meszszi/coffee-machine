import java.util.Scanner;

/**
 * Represents the sate of waiting for next customer to insert a coin.
 */
public class WaitingForCoin implements IState {

    @Override
    public void operation(CoffeeMachine machine) {

        System.out.format("Please insert coin. (coffees left: %d) << press enter >>\n", machine.getCoffeeCupsAmount());
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();

        System.out.println("Coin inserted!");

        if(machine.getCoffeeCupsAmount() == 0) {

            System.out.println("There is no coffeee!");
            System.out.println("Here, take your coin back.");
            machine.setState(new WaitingForCoffeeSupply());
            return;
        }

        machine.setState(new WaitingForButton());
    }
}
