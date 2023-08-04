package dev.learning;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MoreLists {
    public static void main(String[] args) {

        String[] items = {"apples", "bananas", "milk", "eggs"};

        List<String> list = List.of(items);
        System.out.println(list);

//        System.out.println(list.getClass().getName());

        ArrayList<String> groceries = new ArrayList<>(list);

        /****** Adding ******/

        groceries.add("yogurt");
        System.out.println(groceries);

        ArrayList<String> nextList = new ArrayList<>(
                List.of("pickle", "mustard", "cheese")
        );
        System.out.println(nextList);

        groceries.addAll(nextList);
        System.out.println(groceries);

        System.out.println("Third items = " + groceries.get(2));

        /****** Contains ******/

//        Searching item in an list
        if (groceries.contains("mustard")) {
            System.out.println("List contains mustard");
        }

        groceries.add("yogurt");
//        Indexof - for first match element
        System.out.println("first = " + groceries.indexOf("yogurt"));
//        lastIndexOf - last element of index
        System.out.println("last = " + groceries.lastIndexOf("yogurt"));

        /****** Removing ******/
//        It only removes the single element
        System.out.println(groceries);
        groceries.remove(1);
        groceries.remove("yogurt");
        System.out.println(groceries);


//        Remove set of elements
        groceries.removeAll(List.of("apples", "eggs" ));
        System.out.println(groceries);

//        Retain all
        groceries.retainAll(List.of("apples", "milk", "mustard", "cheese"));
        System.out.println(groceries);

//        Remove all elements from the list using clear method
        groceries.clear();
        System.out.println(groceries);
        System.out.println("isEmpty = " + groceries.isEmpty());

//        Add element to the list using addAll method
        groceries.addAll(List.of("apple", "milk", "mustard", "cheese"));
        groceries.addAll(Arrays.asList("eggs", "mustard", "pickles", "ham"));

        /****** Sorting ******/
        System.out.println(groceries);
//        Sort the groceries using comparator that compare to one another
        System.out.println("_".repeat(60));
        System.out.println("Sorted in Ascending order");

        groceries.sort(Comparator.naturalOrder());
        System.out.println("_".repeat(60));

        System.out.println(groceries);

//        Sort the element "Reverse order"
        System.out.println("_".repeat(60));
        System.out.println("Sorted in Decending order");

        groceries.sort(Comparator.reverseOrder());
        System.out.println("_".repeat(60));
        System.out.println(groceries);

//        Overloaded method called toArray
        var groceryArray = groceries.toArray(new String[groceries.size()]);
        System.out.println(Arrays.toString(groceryArray));

    }
}
