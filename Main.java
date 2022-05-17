public class Main {
    public static void main(String[] args) {

        System.out.println("This computer is Turing complete");
        TuringTape testTape = new TuringTape();


        testTape.printAll();

        System.out.println(testTape.getTapeFPos(2));

        System.out.println(testTape.getCurrentPos());
        testTape.moveTapePos('L');
        System.out.println(testTape.getCurrentPos());
        testTape.moveTapePos('R');
        System.out.println(testTape.getCurrentPos());
        testTape.moveTapePos('r');
        System.out.println(testTape.getCurrentPos());

    }
}