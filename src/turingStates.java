public class turingStates {

    private stateOb[] stateList;

    // Can I define an object that holds the state, with an array of instructions.
    /*

        - The object -> the name of the object is the state number.
        - There will be an array that holds each state (object above) state 1 "q1" will align with index 0 and so on

     */


    // If statement to check if symbol can be convert to char

    
    
    /*
     
     
     Symbols to number rep:
     
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
     	~ = 10
     
     
     
     */
    
    
    
    public turingStates(stateOb[] sts) {
        stateList = sts;
    }


    // Get state testTape
    public Character getStateLstSymb (int SymbIndex, int state) {

        return stateList[state - 1].getSymbolFromArr(SymbIndex);

    }
    
    // Get move direction
    public Character getMoveDirFromLst(int SymbIndex, int state) {

        return stateList[state - 1].getMoveDirFromArr(SymbIndex);

    }

    public int getNextStateFromLst(int SymbIndex, int state) {
        return stateList[state - 1].getNextStateFromArr(SymbIndex);
    }



    
    // Utility function to convert characters to numbers
    public int charToNumConv(TuringTape y) {


    	
    	// If '~' then it returns 10, because base 10.
        if(y.getTapeCurrentSymbol().equals('~')) {
            return 10;
        }

        
        // Conversion of char to int if not '~'
        else {
            return Character.getNumericValue(y.getTapeCurrentSymbol());
        }



    }

}
