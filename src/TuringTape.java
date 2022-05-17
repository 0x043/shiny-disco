import java.util.LinkedList;

public class TuringTape {

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
        currentPos = 1;


    }

    public void changeTape(int pos, Character in) {
        tape.set(pos, in);
    }

    public Character getTapeFPos(int pos) {

        return tape.get(pos);

    }

    public int getCurrentState() {
        return currentState;
    }

    public int getCurrentPos() {
        return currentPos;
   }

    public void printAll() {

        for(Character e : tape) {
            System.out.println(e);
        }

    }

}
