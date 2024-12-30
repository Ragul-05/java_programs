package Collection_framework;


import java.util.*;

public class ListInterface {
    public static void main(String[] args) {
        // Use different List implementations
        System.out.println("Using ArrayList:");
        demonstrateListMethods(new ArrayList<>());

        System.out.println("\nUsing LinkedList:");
        demonstrateListMethods(new LinkedList<>());

        System.out.println("\nUsing Vector:");
        demonstrateListMethods(new Vector<>());

        System.out.println("\nUsing Stack:");
        demonstrateListMethods(new Stack<>());
    }

    //List operations
    public static void demonstrateListMethods(List<String> list) {
        // 1. add(int index, element)
        list.add("A");
        list.add("B");
        list.add("C");
        list.add(1, "D");
        System.out.println("After add(int index, element): " + list);

        // 2. addAll(int index, Collection collection)
        List<String> additionalList = new ArrayList<>();
        additionalList.add("X");
        additionalList.add("Y");
        list.addAll(2, additionalList); 
        System.out.println("After addAll(int index, Collection collection): " + list);

        // 3. size()
        System.out.println("Size of the list: " + list.size());

        // 4. clear()
        List<String> tempList = new ArrayList<>(list);
        tempList.clear();
        System.out.println("After clear(): " + tempList);

        // 5. remove(int index)
        list.remove(3); 
        System.out.println("After remove(int index): " + list);

        // 6. remove(element)
        list.remove("X"); 
        System.out.println("After remove(element): " + list);

        // 7. get(int index)
        System.out.println("Element at index 1: " + list.get(1));

        // 8. set(int index, element)
        list.set(1, "E"); 
        System.out.println("After set(int index, element): " + list);

        // 9. indexOf(element)
        System.out.println("Index of 'B': " + list.indexOf("B"));

        // 10. lastIndexOf(element)
        list.add("B");
        System.out.println("Last Index of 'B': " + list.lastIndexOf("B"));

        // 11. equals(element)
        List<String> listCopy = new ArrayList<>(list);
        System.out.println("Are list and listCopy equal? " + list.equals(listCopy));

        // 12. hashCode()
        System.out.println("HashCode of list: " + list.hashCode());

        // 13. isEmpty()
        System.out.println("Is list empty? " + list.isEmpty());

        // 14. contains(element)
        System.out.println("Does list contain 'A'? " + list.contains("A"));

        // 15. containsAll(Collection collection)
        List<String> sublist = new ArrayList<>();
        sublist.add("A");
        sublist.add("B");
        System.out.println("Does list contain all elements of sublist? " + list.containsAll(sublist));

        // 16. sort(Comparator comp)
        list.sort(Comparator.naturalOrder());
        System.out.println("After sorting: " + list);

        // Special Methods
        // 1. Reverse the list
        Collections.reverse(list);
        System.out.println("After reversing: " + list);

        // 2. Shuffle the list
        Collections.shuffle(list);
        System.out.println("After shuffling: " + list);

        // 3. Get sublist
        if (list.size() > 2) {
            System.out.println("Sublist from index 1 to 3: " + list.subList(1, 3));
        }

        // 4. Convert list to array
        String[] array = list.toArray(new String[0]);
        System.out.print("Array: ");
        for (String s : array) {
            System.out.print(s + " ");
        }
        System.out.println();
    }
}
