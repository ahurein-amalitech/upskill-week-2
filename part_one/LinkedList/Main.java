package part_one.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList(5);
        list.addHead(5);
        list.addTail(3);
        list.addTail(9);
        list.add(2,5);

        list.deleteTail();
        list.deleteHead();
        list.deleteByValue(5);

        System.out.println(list);
    }
}