public class stateOb {

    private int stateNum;
    private symOb[] symbList;

    public stateOb(int n, symOb[] sy) {
       stateNum = n;
       symbList = sy;
    }

    public Character getMoveDirFromArr(int index) {

        return symbList[index].getMoveDir();

    }

    public int getNextStateFromArr(int index) {
        return symbList[index].getNextState();
    }

    public Character getSymbolFromArr(int index) {

        return symbList[index].getSymbol();

    }

    public int getStateNumFromArr(int index) {
        return symbList[index].getStateNumber();
    }


}
