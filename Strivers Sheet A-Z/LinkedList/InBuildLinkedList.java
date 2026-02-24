import java.util.LinkedList;

public class InBuildLinkedList {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Ramu");
        list.add("Hanuman");
        list.add(1, "Krishna");
        // System.out.println(list.get(1));
        list.set(0, "Shiva");
        // System.out.println(list);
        list.remove(1);
        System.out.println(list);
        list.remove("Shiva");
        System.out.println(list);
    }
}
