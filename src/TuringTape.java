import java.util.LinkedList;

public class TuringTape {

    // TODO: Algo to find current state, identify symbol on current tape position, and get the instruction set for that state.

    private LinkedList<Character> tape;

    // States are defined as the following:
    /*

     */
    private int currentState;
    private int currentPos;

    public TuringTape() {

        tape = new LinkedList<Character>();

        tape.add(0, '0');
        tape.add(1, '0');
        tape.add(2,'~');
        currentState = 1;
        currentPos = 0;
}


    public void changeTape(int pos, Character in) {
        tape.set(pos, in);
    }

    public Character getTapeFPos(int pos) {

        return tape.get(pos);

    }

    public void moveTapePos(Character d) {

        if(d.equals('R') || d.equals('r')) {
            currentPos++;
        } else if(d.equals('L') || d.equals('l')){
            currentPos--;
        }

    }

    public Character getTapeCurrentSymbol() {
        return getTapeFPos(getCurrentPos());
    }

    public void changeState(int s) {

        // Implement state checking, to make sure that the state exists.

        currentState = s;
    }

    public int getCurrentState() {
        return currentState;
    }

    public int getCurrentPos() {
        return currentPos;
   }

    public void printAll() {

        for(Character e : tape) {
            System.out.print(e + " ");
        }

    }

}
