public class Main {

    public static void main(String[] Args) {

        CoffeeMachine machine = new CoffeeMachine(2, new WaitingForCoin());
        machine.run();
    }
}
