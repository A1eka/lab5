

package ru.tarasenko.classes;

import ru.tarasenko.classes.Body;
import java.util.Comparator;

public class SortMode implements Comparator<Body> {   
   
    private boolean sortUp;
    private int sortMode;
    
    public SortMode(boolean sortUp, int sortMode) {
        this.sortUp = sortUp;
        this.sortMode = sortMode;
    }
    
    @Override
    public int compare(Body b1, Body b2) {
    int res=0;
    if (sortMode==0){
    if (b1.getId()>b2.getId()) res=1;
    else if (b1.getId()<b2.getId()) res=-1;
            }
    else if (sortMode==1){
             res=b1.getName().compareTo(b2.getName());
            }
    else if (sortMode ==2){
            if (b1.getHig()>b2.getHig()) res=1;
            else if (b1.getHig()<b2.getHig()) res=-1;
            }
    else{
        if (b1.getVolume()>b2.getVolume()) res=1;
            else if (b1.getVolume()<b2.getVolume()) res=-1;    
    }
    if (sortUp) res*=(-1);
    return res;
    }
}
