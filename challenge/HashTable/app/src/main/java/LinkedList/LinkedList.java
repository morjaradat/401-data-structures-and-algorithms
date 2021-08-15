package LinkedList;

public class LinkedList<T> {
    private Node<T> head;
    private Node<T> last;
    int size = 0;

    public Boolean isEmpty(){
        return this.head == null;
    }

    public void insertAtEnd(T data) {
        Node<T> node = new Node<>(data);
        if (this.head == null) {
            this.head = node;
        } else {
            Node<T> current = this.head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext((Node<T>) node);
        }
        size++;
    }

    public void append(T data) {
        Node<T> node = new Node<>(data);
        if (this.head == null) {
            this.head = node;
        } else {
            Node<T> current = this.head;
            while (current != null) {
                if (current.getNext() == null) {
                    current.setNext(node);
                    break;
                }
                current = current.getNext();
            }
        }
        size++;
    }

    public void insertBefore(T value, T newValue) {
        boolean isInclude = includes(value);
        if (isInclude) {
            if (this.head == null) {
            } else if (this.head.getData() == value) {
                Node<T> node = new Node<>(newValue);
                node.setNext(this.head);
                this.head = node;
                size++;
            } else {
                Node<T> node = new Node<>(newValue);
                Node<T> current = this.head;
                Node<T> previous = current;
                while (current != null) {
                    if (current.getData() != value) {
                        previous = current;
                        current = current.getNext();
                    } else {
                        node.setNext(current);
                        previous.setNext(node);
                        break;
                    }
                }
                size++;
            }
        }

    }

    public void insertAfter(T value, T newValue) {
        boolean isInclude = includes(value);
        if (isInclude) {
            if (this.head == null) {
                return;

            } else if (this.head.getData() == value) {
                Node<T> node = new Node<>(newValue);
                Node<T> nextNode = head.getNext();
                this.head.setNext(node);
                node.setNext(nextNode);

            } else {

                Node<T> node = new Node<>(newValue);
                Node<T> current = this.head;
                Node<T> nextNode = current.getNext();
                while (current != null) {

                    if (current.getData() == value) {

                        if (current.getNext() == null) {
                            current.setNext(node);

                        } else {
                            nextNode = current.getNext();
                            current.setNext(node);
                            node.setNext(nextNode);
                        }
                        break;
                    }
                    current=current.getNext();
                }
            }
            size++;
        }
    }

    public  T kthFromEnd(int numberFromEnd){
        int  indexOfValue = (size-1) - numberFromEnd;
        int index =0;
        if (indexOfValue>=0){
            Node<T> current = this.head;
            while (current != null){
                if (index == indexOfValue){
                    return (T) current.getData();
                }
                index++;
                current=current.getNext();
            }
        }
        return (T) "Out of Bonds";

    }

    public LinkedList<T> zipLists(LinkedList<T> list1, LinkedList<T> List2) {
        if (list1.head != null && List2.head != null) {
            list1.head = ListsZipper(list1.head, List2.head);
            return list1;
        } else {
            return null;
        }
    }

    private Node<T> ListsZipper(Node<T> node1, Node<T> node2) {
        if (node1 == null) {
            return node2;
        } else if (node2 == null) {
            return node1;
        } else {
            Node<T> mergeNode = ListsZipper(node1.getNext(), node2.getNext());
            node2.setNext(mergeNode);
            node1.setNext(node2);
            return node1;
        }
    }

    public int getSize() {
        return size;
    }

    public boolean includes(T value) {
        if (this.head == null) {
            return false;
        }
        Node<T> current = this.head;
        while (current != null) {
            if (current.getData() == value) {
                return true;
            }
            current = current.getNext();
        }
        return false;
    }

    public String toString() {
        Node<T> current = head;
        if (current == null) {
            return "Linked list is empty";
        }
        StringBuilder showList = new StringBuilder();
        while (current != null) {
            showList.append("{").append(current.getData()).append("}-> ");
            current = current.getNext();
        }
        showList.append("NULL");
        return showList.toString();
    }

    public T getValue(int i) {
        int length = 0;
        T data;

        Node<T> current = this.head;
        while (current != null) {
            if (length == i) {
                data = current.getData();
//                System.out.println(data);
                return data;

            }
            length++;
            current = current.getNext();
        }
        return null;
    }

    public LinkedList<T> reverse(LinkedList<T> list) {
        int length = size;
        Node<T> current = this.head;
        T lastNode = list.getValue(length - 1);
        int addedNodes = 0;
        for (int i = 0; i < length - 1; i++) {
            T value = list.getValue(length - 2 - i);
            list.insertAtEnd((T) value);
            addedNodes++;
        }
        int removeIndex = 0;
        while (current.getNext() != null) {
            if (current.getData().equals(lastNode) && removeIndex == length - 1) {
                this.head = current;
                size = size - addedNodes;
                break;
            }
            removeIndex++;
            current = current.getNext();
        }
        return list;
    }

//    public linkedList<T> reverse2(linkedList<T> list){
//
//    }

    public boolean palindrome(LinkedList<T> array) {
//        linkedList<T> reversedArray= array.reverse(array);
        for (int i = 0; i < size; i++) {
            if (array.getValue(i) == array.getValue(size - 1 - i)) {
            } else {
                return false;
            }
        }
        return true;
    }

    Node<T> node(int index) {
        Node<T> temp;
        int i;
        if (index < this.size && this.size > 1) {
            temp = head;

            for(i = 0; i < index; ++i) {
                temp = temp.getNext();
            }

        } else {
            temp = last;

            for(i = this.size - 1; i > index; --i) {
                temp = temp.getPrev();
            }

        }
        return temp;
    }

    public T get(int index) {
        this.checkElementIndex(index);
        return this.node(index).getData();
    }

    public T set(int index, T element) {
        this.checkElementIndex(index);
        Node<T> temp = node(index);
        T oldVal = temp.getData();
        temp.setData(element);
        return oldVal;
    }

    private void checkElementIndex(int index) {
        if (!this.isElementIndex(index)) {
            throw new IndexOutOfBoundsException(this.outOfBoundsMsg(index));
        }
    }

    private boolean isElementIndex(int index) {
        return index >= 0 && index < this.size;
    }

    private String outOfBoundsMsg(int index) {
        return "Index: " + index + ", Size: " + this.size;
    }

}
