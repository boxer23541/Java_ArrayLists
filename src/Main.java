import java.lang.reflect.Array;
import java.util.*;

public class Main
{

    public static void main(String[] args)
    {
	    ArrayList<String> names = new ArrayList<>();

        /**
         * Object Wrapper Classes
         * Object class is same as primitive with capital letter
         * double is Double
         * Exceptions:
         * char is Character
         * int is Integer
         */

        names.add("Tom");
        names.add("Dick");
        names.add("Harry");

        names.add(1, "Poppy");

        System.out.println(names);
        System.out.println("The size is " + names.size());

        ArrayList<Double> salaries = new ArrayList<>();

        salaries.add(123.45);
        salaries.add(321.45);
        salaries.add(456.45);
        salaries.add(987.45);

        System.out.println(salaries);

        ArrayList<Integer> favNums = new ArrayList<>();

        favNums.add(4);
        favNums.add(15);
        favNums.add(23);
        favNums.add(7);
        favNums.add(32);

        System.out.println(favNums);

        for(double d:salaries)
        {
            System.out.println(d);
        }

        for (int dex = 0; dex < salaries.size(); dex++)
        {
            System.out.println(salaries.get(dex));
        }

        //write code to sum the salaries array and calc the ave

        double sumSalaries = 0;
        double average = 0;
        for(double d:salaries)
        {
            sumSalaries += d;
        }
        System.out.println("The sum is " + sumSalaries);

        average = sumSalaries / salaries.size();

        System.out.println("The average is " + average);

        int sumFavs = 0;
        double averageFav = 0;

        for (int x:favNums)
        {
            sumFavs += x;
        }
        System.out.println("The total is: " + sumFavs);

        averageFav = sumFavs / favNums.size();

        System.out.println("Average fav num is: " + averageFav);
    }
}
