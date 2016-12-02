/**
 * Created by LunaFlores on 12/2/16.
 */
public class LinkedStringListImpl implements StringList {
    private Node head;

    @Override
    public void add(String value) {
        if (head == null) {
            // list is empty add first node
            Node node = new Node();
            head = node;
            node.setValue(value);
            // we done
            return;
        }

        // find the end of the list
        Node currentNode = head;
        while (currentNode.getNext() != null) {
            currentNode = currentNode.getNext();
        }
        // current node points to end of list
        Node node = new Node();
        node.setValue(value);
        currentNode.setNext(node);
    }

    @Override
    public void replace(String value, int position) {
    }

    @Override
    public void remove(int position) {
    }

    @Override
    public int size() {
        if (head == null) {
            return 0;
        }
        int count = 1;
        Node currentNode = head;
        while (currentNode.getNext() != null) {
            ++count;
            currentNode = currentNode.getNext();
        }
        return count;
    }
}
