package edu.sdust.moon.Utils;

import java.util.ArrayList;

public class ArrayUtils {

    private ArrayUtils () {
    }

    public static ArrayList<Long> toArrayList (long[] array) {
        ArrayList<Long> list = new ArrayList<> ();
        for (long l : array) {
            list.add (l);
        }
        return list;
    }

}