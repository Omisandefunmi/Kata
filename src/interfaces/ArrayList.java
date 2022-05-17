package interfaces;

public class ArrayList implements List{
    private static int counter;
    private static String [] db = new String[3];
    @Override
    public void add(String item) {
        if (isFull()){
            makeArrayElastic();
        }
        db [counter] = item;
        counter++;

    }


    @Override
    public void add(int index, String item) {
        String [] newdb = new String[db.length +1];
        int realIndex = index - 1;
        String [] tempArray = new String[db.length - realIndex];
        for (int i = 0; i < index; i++) {
            if(i == realIndex){
                newdb[i] = item;
            }
            else
                newdb[i] = db[i];
        }
        int tempIndex = 0;
        for (int i = index; i < tempArray.length; i++) {
            tempArray[tempIndex] = db[i];
            tempIndex +=1;
        }

        int arrayIndex = 0;
        for (int i = index; i < newdb.length; i++) {
            newdb[index] = tempArray[arrayIndex];
            arrayIndex++;
        }
        db = newdb;
        counter++;
    }

    @Override
    public String get(int index) {
        int realIndex = index - 1;
        return db[realIndex];
    }

    @Override
    public void remove(String item) {
        for (int i = 0; i <=size(); i++) {
            if (get(i+1).equalsIgnoreCase(item)) {
                counter--;
                db[i] = null;
                fillRemovedIndex(i);
            }
        }

    }

    @Override
    public void remove(int index) {
        int realIndex = index - 1;
        db[realIndex] = null;
        counter--;
        fillRemovedIndex(realIndex);
    }

    public static void fillRemovedIndex(int index){
        for (int i = index; i < counter; i++) {
            db[i] = db[i+1];
        }
    }

    @Override
    public int size() {
        return counter;
    }

    public boolean isFull(){
        return counter == db.length;
    }

    @Override
    public void replace(int index, String item) {
        db[index-1] = item;
    }

    private void makeArrayElastic(){
        db = new String[db.length * 2];
    }
}
