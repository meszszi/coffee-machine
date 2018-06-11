import java.util.Scanner;

/**
 * Represents the state of waiting for the customer to take the cup of coffee after successful order.
 */
public class WaitingForCoffeeCollection implements IState {

    @Override
    public void operation(CoffeeMachine machine) {

        System.out.println("Please take your coffee. << press enter >>");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();

        System.out.println("Coffee taken!");

        machine.setState(new WaitingForCoin());
    }
}
