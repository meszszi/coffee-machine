import java.util.Scanner;

/**
 * Represents the state of waiting for coffee supply when the machine is empty.
 */
public class WaitingForCoffeeSupply implements IState {

    @Override
    public void operation(CoffeeMachine machine) {

        System.out.println("Please refill the machine. << press enter >>");

        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();

        machine.refill();

        System.out.println("Machine refilled!");

        machine.setState(new WaitingForCoin());
    }
}
