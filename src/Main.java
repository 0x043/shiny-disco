public class Main {
    public static void main(String[] args) {

        System.out.println("This computer is Turing complete");
        TuringTape testTape = new TuringTape();


        testTape.printAll();

        System.out.println(testTape.getTapeFPos(2));
    }
}