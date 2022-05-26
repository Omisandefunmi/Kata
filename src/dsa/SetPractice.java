package dsa;

import interfaces.*;

public class SetPractice extends ArrayList {
    private ArrayList sets = new ArrayList();

    @Override
    public void add(String element){
        if(sets.size() > 1){
            boolean notExist = true;
            int count = 1;
            while(notExist && count < sets.size()){
                if (sets.get(count).equals(element)){
                    notExist = false;
                    break;
                }
                else count++;
            }
            if(notExist){sets.add(element);}
            }
        else sets.add(element);

        }

    public boolean contains(String element) {
        for(int i = 1; i < size() ; i++){
            if(sets.get(i).equals(element)){
                return true;
            }
        }
        return false;
    }
}



