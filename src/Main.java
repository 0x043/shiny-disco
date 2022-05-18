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

        symOb[] symbolObjectOne = { new symOb('0', 1, 'R', 3), new symOb('1', 1, 'R', 3),
                new symOb('2', 1, 'R', 3), new symOb('3', 1, 'R', 3),
                new symOb('4', 1, 'R', 3), new symOb('5', 1, 'R', 3),
                new symOb('6', 1, 'R', 3), new symOb('7', 1, 'R', 3),
                new symOb('8', 1, 'R', 3), new symOb('9', 1, 'R', 1),
                new symOb('~', 1, 'L', 3),};
    }
}