public class Main {
    public static void main(String[] args) {

        // TODO: Implement running the program, display, and halt, also make tape infinite? To display clear the screen then print array
        // How do I add new places to the number? From 99 to 100, and 999 to 1000? Can I set all of the values to null?
        // Every time program is at position 0, and the value is 9 -> tape.add(0, '0'); Case?


        /*

            Index to symbol reference

            0 = 0
            1 = 1
            2 = 2
            3 = 3
            4 = 4
            5 = 5
            6 = 6
            7 = 7
            8 = 8
            9 = 9
            10 = ~


         */

        TuringTape testTape = new TuringTape();

        symOb[] symbolObjectOne = { new symOb('0', 1, 'R', 3), new symOb('1', 1, 'R', 3),
                new symOb('2', 1, 'R', 3), new symOb('3', 1, 'R', 3),
                new symOb('4', 1, 'R', 3), new symOb('5', 1, 'R', 3),
                new symOb('6', 1, 'R', 3), new symOb('7', 1, 'R', 3),
                new symOb('8', 1, 'R', 3), new symOb('9', 1, 'R', 1),
                new symOb('~', 1, 'L', 3)};



        symOb[] symbolObjectTwo = { new symOb('1', 2, 'R', 4), new symOb('2', 2, 'R', 3),
                new symOb('3', 2, 'R', 3), new symOb('4', 2, 'R', 3),
                new symOb('4', 2, 'R', 3), new symOb('6', 2, 'R', 3),
                new symOb('7', 2, 'R', 3), new symOb('8', 2, 'R', 3),
                new symOb('9', 2, 'R', 3), new symOb('0', 2, 'L', 3),
                new symOb('~', 2, 'L', 3)};

        symOb[] symbolObjectThree = { new symOb('1', 3, 'L', 1), new symOb('2', 3, 'L', 1),
                new symOb('3', 3, 'L', 1), new symOb('4', 3, 'L', 1),
                new symOb('5', 3, 'L', 1), new symOb('6', 3, 'L', 1),
                new symOb('7', 3, 'L', 1), new symOb('8', 3, 'L', 1),
                new symOb('9', 3, 'L', 1), new symOb('0', 3, 'L', 2),
                new symOb('~', 3, 'L', 3)};

        symOb[] symbolObjectFour = { new symOb('0', 4, 'R', 4), new symOb('2', 4, 'L', 1),
                new symOb('3', 4, 'L', 1), new symOb('4', 4, 'L', 1),
                new symOb('4', 4, 'L', 1), new symOb('6', 4, 'L', 1),
                new symOb('7', 4, 'L', 1), new symOb('8', 4, 'L', 1),
                new symOb('9', 4, 'L', 1), new symOb('0', 4, 'L', 2),
                new symOb('~', 4, 'L', 3)};


        stateOb stateOne = new stateOb(1, symbolObjectOne);
        stateOb stateTwo = new stateOb(2, symbolObjectTwo);
        stateOb stateThree = new stateOb(3, symbolObjectThree);
        stateOb stateFour = new stateOb(4, symbolObjectFour);

        stateOb[] baseTenStates = { stateOne, stateTwo, stateThree, stateFour };
        turingStates machine = new turingStates(baseTenStates);

        testTape.moveTapePos(stateOne.getMoveDirFromArr(3));
        System.out.println(testTape.getTapeCurrentSymbol());
        testTape.moveTapePos(stateOne.getMoveDirFromArr(10));
        System.out.println(testTape.getTapeCurrentSymbol());
        System.out.println(machine.getStateLstSymb(10, 1));
        System.out.println();

        System.out.println(machine.charToNumConv(testTape));
        System.out.println();
        testTape.moveTapePos('R');
        System.out.println(machine.charToNumConv(testTape));
        testTape.moveTapePos('L');
        testTape.changeTape(testTape.getCurrentPos(), '4');
        System.out.println();
        System.out.println(machine.charToNumConv(testTape));
        System.out.println();
        testTape.printAll();
        System.out.println();
        System.out.println(testTape.getCurrentState());

        System.out.println(machine.getStateLstSymb(machine.charToNumConv(testTape), 3));

    }


}