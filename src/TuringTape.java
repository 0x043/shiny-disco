import java.util.LinkedList;

public class TuringTape {

    private LinkedList<Character> tape;

    public TuringTape() {

        tape = new LinkedList<Character>();

        tape.add(0, '0');
        tape.add(1, '0');
        tape.add(2,'~');

    }

    public void changeTape(int pos, Character in) {
        tape.set(pos, in);
    }

    public Character getTapeFPos(int pos) {

        return tape.get(pos);

    }

    public void printAll() {

        for(Character e : tape) {
            System.out.println(e);
        }

    }

}
