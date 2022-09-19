package org.launchcode.java.demos.lsn7interfaces;

import java.util.Comparator;

public class ConeComparator implements Comparator<Cone> {

    @Override
    public int compare(Cone cone01, Cone cone02) {
        if (cone01.getCost() - cone02.getCost() < 0){
            return -1;
        } else if (cone01.getCost() - cone02.getCost() > 0) {
            return 1;
        } else {
            return 0;
        }
    }

}
