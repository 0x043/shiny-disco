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

}
