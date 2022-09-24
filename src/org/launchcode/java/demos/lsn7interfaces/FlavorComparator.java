package org.launchcode.java.demos.lsn7interfaces;

import java.util.Comparator;

public class FlavorComparator implements Comparator<Flavor> {
    @Override
    public int compare(Flavor flavor01, Flavor flavor02) {

        return flavor01.getName().compareTo(flavor02.getName());
    }
}
