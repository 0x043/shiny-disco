import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) throws InterruptedException {


    	
    	// Layers of calls: symOb -> stateOb -> turingStates -> run
    	
    	
    	// This defines the states that the turing machine is going to use. 
    	
    	// symbolObject (Change current symbol to (Character), currentState (int), move direction on tape (Character (Left Or Right)), next state)
    	
        TuringTape testTape = new TuringTape(7);

        symOb[] symbolObjectOne = { new symOb('0', 1, 'R', 1), new symOb('1', 1, 'R', 3),
                new symOb('2', 1, 'R', 3), new symOb('3', 1, 'R', 3),
                new symOb('4', 1, 'R', 3), new symOb('5', 1, 'R', 3),
                new symOb('6', 1, 'R', 3), new symOb('7', 1, 'R', 3),
                new symOb('8', 1, 'R', 3), new symOb('9', 1, 'R', 1),
                new symOb('~', 1, 'L', 3)};



        symOb[] symbolObjectTwo = { new symOb('1', 2, 'R', 4), new symOb('2', 2, 'R', 4),
                new symOb('3', 2, 'R', 4), new symOb('4', 2, 'R', 4),
                new symOb('5', 2, 'R', 4), new symOb('6', 2, 'R', 4),
                new symOb('7', 2, 'R', 4), new symOb('8', 2, 'R', 4),
                new symOb('9', 2, 'R', 4), new symOb('0', 2, 'L', 3),
                new symOb('~', 2, 'L', 3)};

        symOb[] symbolObjectThree = { new symOb('1', 3, 'R', 1), new symOb('2', 3, 'R', 1),
                new symOb('3', 3, 'R', 1), new symOb('4', 3, 'R', 1),
                new symOb('5', 3, 'R', 1), new symOb('6', 3, 'R', 1),
                new symOb('7', 3, 'R', 1), new symOb('8', 3, 'R', 1),
                new symOb('9', 3, 'R', 1), new symOb('0', 3, 'L', 2),
                new symOb('~', 3, 'L', 3)};

        symOb[] symbolObjectFour = { new symOb('0', 4, 'R', 4), new symOb('2', 4, 'L', 1),
                new symOb('3', 4, 'L', 1), new symOb('4', 4, 'L', 1),
                new symOb('5', 4, 'L', 1), new symOb('6', 4, 'L', 1),
                new symOb('7', 4, 'L', 1), new symOb('8', 4, 'L', 1),
                new symOb('9', 4, 'L', 1), new symOb('0', 4, 'L', 2),
                new symOb('~', 4, 'L', 3)};


        stateOb stateOne = new stateOb(1, symbolObjectOne);
        stateOb stateTwo = new stateOb(2, symbolObjectTwo);
        stateOb stateThree = new stateOb(3, symbolObjectThree);
        stateOb stateFour = new stateOb(4, symbolObjectFour);

        stateOb[] baseTenStates = { stateOne, stateTwo, stateThree, stateFour };
        turingStates machine = new turingStates(baseTenStates);

        System.out.println();

        testTape.printAll();

        
        TimeUnit.SECONDS.sleep(1);

        
        // While loop executes the machine. Each interation is an execution of a state.
        
        while(true) {


        	// Wait 200 MS before executing next state
        	
            TimeUnit.MILLISECONDS.sleep(200);


            
            Character moveDirec =  machine.getMoveDirFromLst(machine.charToNumConv(testTape), testTape.getCurrentState());
            int nextStateTMP = machine.getNextStateFromLst(machine.charToNumConv(testTape), testTape.getCurrentState());

            testTape.changeTape(testTape.getCurrentPos(), machine.getStateLstSymb(machine.charToNumConv(testTape), testTape.getCurrentState()));

            testTape.moveTapePos(moveDirec);
            testTape.changeState(nextStateTMP);

            testTape.printAll();
            System.out.println(" Current State: " + testTape.getCurrentState() + " Current Tape Position: " + testTape.getCurrentPos());
            
        }


        // System.out.println(machine.getStateLstSymb(machine.charToNumConv(testTape), testTape.getCurrentState()));

    }


}