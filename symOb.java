public class symOb {

	
	
	// This is the root of instructions, this will always be called to get information, but not directly. 
	
    private Character symbol;
    private int stateNumber;
    private Character moveDir;
    private int nextState;

    public symOb(Character s, int stateN, Character m, int nextS) {
        symbol = s;
        stateNumber = stateN;
        moveDir = m;
        nextState = nextS;
    }

    public Character getSymbol() {
        return symbol;
    }

    public int getStateNumber() {
        return stateNumber;
    }

    public Character getMoveDir() {
        return moveDir;
    }

    public int getNextState() {
        return nextState;
    }

}
