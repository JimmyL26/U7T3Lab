import java.util.ArrayList;
import java.util.Arrays;

import java.util.ArrayList;

public class ArrayListTest
{
    public static void main(String[] args)
    {
//        ArrayList<String> names = new ArrayList<String>();
//        names.add("Jamal");
//        names.add("Emily");
//        names.add("Destiny");
//        names.add("Mateo");
//
//        //COMPLETE ME: print each name using an index based for loop
//        for (int i = 0; i < names.size(); i++)
//        {
//            System.out.println(names.get(i));
//        }
//        //COMPLETE ME: print each name (again!) using enhanced for loop
//        for (String name : names)
//        {
//            System.out.println(name);
//        }
//        //COMPLETE ME: print each name (a third time!) using a while loop
//        int i = 0;
//        while (i < names.size())
//        {
//            System.out.println(names.get(i));
//            i++;
//        }

//        ArrayList<Cat> catList = new ArrayList<Cat>();
//        catList.add(new Cat("Patty"));
//        catList.add(new Cat("Keith"));
//        catList.add(new Cat("Jerry"));
//        catList.add(new Cat("Mary"));
//
//        // COMPLETE ME: print each Cat’s name using a
//        // standard for loop
//        for (int i = 0; i < catList.size(); i++)
//        {
//            System.out.println((catList.get(i)).getName());
//        }
//        // COMPLETE ME: print each Cat’s name using an
//        // enhanced for loop
//        for (Cat cat : catList)
//        {
//            System.out.println(cat.getName());
//        }

//        Integer[] nums = {1, 2, 3, 4, 5, 6, 7};
//        ArrayList<Integer> numList = new ArrayList<Integer>(Arrays.asList(nums));
//
//        //COMPLETE ME!
//        for (int i = 1; i < numList.size() - 2; i++) {
//            numList.set(i - 1, numList.get(i) + numList.get(i + 1));
//        }
//
//        System.out.println(numList);

        ArrayList<Integer> ints = new ArrayList<Integer>();
        ints.add(0, 1);
        ints.add(0, 2);
        ints.add(0, 3);
        ints.add(0, 4);
        ints.add(0, 5);
        ints.add(0, 6);

        ArrayList<Integer> newInts = new ArrayList<Integer>();

        // traverse the entire ints array backwards
        for (int i = ints.size() - 1; i >= 0; i--)
        {
            newInts.add(ints.get(i));
        }

        System.out.println(ints);
        System.out.println(newInts);
    }
}

