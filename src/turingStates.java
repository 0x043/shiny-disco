public class turingStates {

    private stateOb[] stateList;

    // Can I define an object that holds the state, with an array of instructions.
    /*

        - The object -> the name of the object is the state number.
        - There will be an array that holds each state (object above) state 1 "q1" will align with index 0 and so on

     */


    // If statement to check if symbol can be convert to char

    public turingStates(stateOb[] sts) {
        stateList = sts;
    }


    // Get state testTape
    public Character getStateLstSymb (int SymbIndex, int state) {

        return stateList[state - 1].getSymbolFromArr(SymbIndex);

    }

    public Character getMoveDirFromLst(int SymbIndex, int state) {

        return stateList[state - 1].getMoveDirFromArr(SymbIndex);

    }

    public int getNextStateFromLst(int SymbIndex, int state) {
        return stateList[state - 1].getNextStateFromArr(SymbIndex);
    }



    public int charToNumConv(TuringTape y) {


        if(y.getTapeCurrentSymbol().equals('~')) {
            return 10;
        }

        else {
            return Character.getNumericValue(y.getTapeCurrentSymbol());
        }



    }

}
