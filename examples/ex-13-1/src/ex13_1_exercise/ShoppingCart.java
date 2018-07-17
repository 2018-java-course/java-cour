package ex13_1_exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ShoppingCart {

    public static void main(String[] args) {
        String[] days = {"monday", "saturday", "tuesday", "sunday", "friday"};

        ArrayList<String> myArrayList = new ArrayList(Arrays.asList(days));

        myArrayList.replaceAll(pippo -> {String str = "ciao";return pippo+str;} );

        System.out.println(myArrayList);
 
    }
}
