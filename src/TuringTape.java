import java.util.LinkedList;

public class TuringTape {


	
	// The tape is created using a LinkedList
    private LinkedList<Character> tape;
    
    // This int will hold the current state that the machine is in. 
    private int currentState;
    
    // This int will hold the pos of the "head on the tape"
    private int currentPos;

    public TuringTape() {

        tape = new LinkedList<Character>();

        tape.add(0, '0');
        tape.add(1, '0');
        tape.add(2, '0');
        tape.add(3, '0');
        tape.add(4, '0');
        tape.add(5,'~');
        currentState = 1;
        currentPos = tape.size() - 2;
}
    
    public TuringTape(int numOfDigits) {
    	
    	tape = new LinkedList<Character>();
    	
    	for(int i = 0; i < numOfDigits; i++) {
    		
    		tape.add(i, '0');
    		
    	}
    	
    	tape.add(tape.size(), '~');
    	currentState = 1;
    	currentPos = tape.size() - 2;
    	
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

        currentState = s;
    }

    public int getCurrentState() {
        return currentState;
    }

    public int getCurrentPos() {
        return currentPos;
   }

    
    // Prints everything on tape
    
    public void printAll() {

        for(Character e : tape) {
            System.out.print(e + " ");
        }

    }

}
