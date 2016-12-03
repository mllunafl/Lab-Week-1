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

    private Node findNode(int position) {
        if (head == null) {
             return null;
        }
        if (position < 1) {
            return null;
        }
        int count = 1;
        Node currentNode = head;
        if (position > 1) {
            while (currentNode.getNext() != null) {
                ++count;
                currentNode = currentNode.getNext();
                if (position == count) {
                    break;
                }
            }
        }
        return currentNode;
    }

    @Override
    public String getValue(int position) {
        if (head == null) {
            return null;
        }
        if (position < 1) {
            return null;
        }

        int count = 1;
        Node currentNode = head;

        if (position > 1) {
            while (currentNode.getNext() != null) {
                ++count;
                currentNode = currentNode.getNext();
                if (position == count) {
                    break;
                }
            }
        }

        if (position == count) {
            return currentNode.getValue();
        }
        return null;
    }

    @Override
    public void replace(String value, int position) {
        Node nodeToReplace = findNode(position);
            if (nodeToReplace != null) {
                nodeToReplace.setValue(value);
            }
    }

    @Override
    public void remove(int position) {
        Node nodeToRemove = findNode(position);
        if (nodeToRemove == null)
            return;
        Node previousNode = findNode(position - 1);
        previousNode.setNext(nodeToRemove.getNext());
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
