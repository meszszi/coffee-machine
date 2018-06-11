import java.util.Scanner;

/**
 * Represents the state of waiting for the customer to press the button after inserting coin.
 */
public class WaitingForButton implements IState {

    @Override
    public void operation(CoffeeMachine machine) {

        System.out.println("Please press the button. << press enter >>");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();

        System.out.println("Button pressed!");

        machine.makeCoffee();

        System.out.println("Your coffee is ready!");
        
        machine.setState(new WaitingForCoffeeCollection());
    }
}
