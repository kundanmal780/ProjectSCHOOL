public class ProjectSCHOOL {
    public static void main(String[] args) {
        // Example of how you might implement basic features like adding items to an ordered set.
        SortedSet<String> myItems = new TreeSet<>(myComparator); 
        System.out.println(myItems);
    }

    private static <T extends Comparable<? super T>> TreeSet<T> myComparator() {
        return Collections.naturalOrder();
    }
}
