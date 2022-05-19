public class Main {
    public static void main(String[] args) {

        TuringTape testTape = new TuringTape();

        symOb[] symbolObjectOne = { new symOb('0', 1, 'R', 3), new symOb('1', 1, 'R', 3),
                new symOb('2', 1, 'R', 3), new symOb('3', 1, 'R', 3),
                new symOb('4', 1, 'R', 3), new symOb('5', 1, 'R', 3),
                new symOb('6', 1, 'R', 3), new symOb('7', 1, 'R', 3),
                new symOb('8', 1, 'R', 3), new symOb('9', 1, 'R', 1),
                new symOb('~', 1, 'L', 3)};

        stateOb stateOne = new stateOb(1, symbolObjectOne);

        testTape.moveTapePos(stateOne.getMoveDirFromArr(3));
        System.out.println(testTape.getTapeCurrentSymbol());
        testTape.moveTapePos(stateOne.getMoveDirFromArr(10));
        System.out.println(testTape.getTapeCurrentSymbol());


    }


}