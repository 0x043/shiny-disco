public class symOb {
// Symbols will be based on place in array (1 == index 0, 2 == index 1 and so on)
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
