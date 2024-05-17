package part_one.LinkedList;

import java.util.NoSuchElementException;

public class LinkedList {
    private Node head;
    private int size;
    private final int maxSize;

    public LinkedList(int maxSize) {
        this.maxSize = maxSize;
    }

    /** Add new data at the first position */
    public void addHead(int data){
        if(size >= maxSize){
            System.out.println("List is full");
            return;
        }
        Node node = new Node(data);
        node.setNextNode(head);
        head = node;
        size++;
    }

    /** Add new data at the end */
    public void addTail(int data){
        if(size >= maxSize){
            System.out.println("List is full");
            return;
        }
        Node node = new Node(data);
        if(this.isEmpty()){
            head = node;
            size++;
            return;
        }

        Node currentNode = head;
        while(currentNode.getNextNode() != null){
            currentNode = currentNode.getNextNode();
        }
        currentNode.setNextNode(node);
        size++;
    }

    /** Add new data at specific position by specifying the index */
    public void add(int index, int data){
        if(size >= maxSize){
            System.out.println("List is full");
            return;
        }
        if(index < 0 || index > size){
            System.out.println("Invalid index");
            return;
        }
        if(index == 0){
            addHead(data);
        }

        Node node = new Node(data);
        Node current = head;

        for(int i = 0; i < index -1 && current != null; i++){
            current = current.getNextNode();
        }

        if(current == null) return;

        node.setNextNode(current.getNextNode());
        current.setNextNode(node);
        size++;
    }

    /** Search for an element by value */
    public void search(int data){
        Node current = head;
        while (current != null){
            if(current.getData() == data){
                System.out.println("Data found: " + current.getData());
                return;
            }
            current = current.getNextNode();
        }
        System.out.println("Data not found");
    }

    /** Remove the first element */
    public int deleteHead(){
        this.handleEmptyList();
        int data = head.getData();
        head = head.getNextNode();
        size--;
        return data;
    }

    /** Delete last element */
    public int deleteTail(){
        this.handleEmptyList();
        if(size == 1) return deleteHead();

        Node current = head;
        while(current.getNextNode().getNextNode() != null){
            current = current.getNextNode();
        }
        int data = current.getNextNode().getData();
        current.setNextNode(null);
        size--;
        return data;
    }

    /** Delete element by value */
    public void deleteByValue(int data){
        if(head == null) return;
        if(head.getData() == data){
            head = head.getNextNode();
            return;
        }
        Node current = head;
        while (current.getNextNode() != null){
            if(current.getNextNode().getData() == data){
                current.setNextNode(current.getNextNode().getNextNode());
                return;
            }
            current = current.getNextNode();
        }
    }

    private boolean isEmpty(){
        return head == null;
    }

    private int size(){
        return size;
    }

    private void handleEmptyList(){
        if(this.isEmpty()){
            throw new NoSuchElementException("List is empty");
        }
    }



    @Override
    public String toString() {
        Node current = head;
        String result = "";
        while (current != null) {
            result += " " + current.getData();
            current = current.getNextNode();
        }
        return result;
    }
}
