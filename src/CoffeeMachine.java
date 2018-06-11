/**
 * Represents coffee machine that simulates the process of ordering cup of coffee.
 */
public class CoffeeMachine {

    private final int coffeeCupsLimit;
    private int coffeeCupsAmount;
    private IState state;

    public CoffeeMachine(int coffeeCupsLimit, IState initialState) {
        this.coffeeCupsLimit = coffeeCupsLimit;
        this.coffeeCupsAmount = coffeeCupsLimit;
        this.state = initialState;
    }

    public void run() {

        while(true)
            this.state.operation(this);
    }

    public int getCoffeeCupsAmount() {
        return coffeeCupsAmount;
    }

    public void refill() {
        this.coffeeCupsAmount = coffeeCupsLimit;
        System.out.println("The machine is being refilled...");
    }

    public void makeCoffee() {
        this.coffeeCupsAmount--;
        System.out.println("The machine is making the coffee...");
    }

    public void setState(IState newState) {
        this.state = newState;
    }
}
