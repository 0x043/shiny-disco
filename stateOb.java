public class stateOb {

    private int stateNum;
    private symOb[] symbList;

    public stateOb(int n, symOb[] sy) {
       stateNum = n;
       symbList = sy;
    }

    
    // Gets move direction from symbol object in array
    public Character getMoveDirFromArr(int index) {

        return symbList[index].getMoveDir();

    }
    
   
   // Gets next state from symbol object in array
    public int getNextStateFromArr(int index) {
        return symbList[index].getNextState();
    }

    // Gets the symbol from symbol object in array
    public Character getSymbolFromArr(int index) {

        return symbList[index].getSymbol();

    }

    // Gets state number from object in array
    public int getStateNumFromArr(int index) {
        return symbList[index].getStateNumber();
    }


}
