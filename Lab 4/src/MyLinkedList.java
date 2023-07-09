public class MyLinkedList<E> {
    Node<E> head, tail;
    int size = 0;

    public MyLinkedList() {}

    public void add(E e) {
        add(size,e);
    }

//     a.	public void addFirst(E e)
    /** Add an element to the beginning of the list */
    public void addFirst(E e) {
        Node<E> newNode = new Node<E>(e);
        newNode.next = head;
        head = newNode;
        size++;

        if (tail == null)
            tail = head;
    }

//b.	public void addLast(E e)
    /** Add an element to the end of the list */
    public void addLast(E e) {
        Node<E> newNode = new Node<E>(e);

        if (tail == null) {
            head = tail = newNode;
        }
        else {
            tail.next = newNode;
            tail = tail.next;
        }

        size++;
    }

//c.	public void add(int index, E e)
    /** Add a new element at the specified index in this list
     * The index of the head element is 0 */
    public void add(int index, E e) {
        if (index == 0) {
            addFirst(e);
        }
        else if (index >= size) {
            addLast(e);
        }
        else {
            Node<E> current = head;
            for (int i = 1; i < index; i++) {
                current = current.next;
            }
            Node<E> temp = current.next;
            current.next = new Node<E>(e);
            (current.next).next = temp;
            size++;
        }
    }


    //d.	public E removeFirst()
    /** Remove the head node and
     *  return the object that is contained in the removed node. */
    public E removeFirst() {
        if (size == 0) {
            return null;
        }
        Node<E> temp = head;
        head = head.next;
        size--;
        if (head == null) {
            tail = null;
        }
        return temp.element;
    }

//e.	public E removeLast()
    /** Remove the last node and
     * return the object that is contained in the removed node. */
    public E removeLast() {
        if (size == 0) {
            return null;
        }
        else if (size == 1) {
            Node<E> temp = head;
            head = tail = null;
            size = 0;
            return temp.element;
        }
        else {
            Node<E> current = head;

            for (int i = 0; i < size - 2; i++) {
                current = current.next;
            }

            Node<E> temp = tail;
            tail = current;
            tail.next = null;
            size--;
            return temp.element;
        }
    }


    //f.	public E remove(int index)
    /** Remove the element at the specified position in this list.
     *  Return the element that was removed from the list. */
    public E remove(int index) {
        if (index < 0 || index >= size) {
            return null;
        }
        else if (index == 0) {
            return removeFirst();
        }
        else if (index == size - 1) {
            return removeLast();
        }
        else {
            Node<E> previous = head;

            for (int i = 1; i < index; i++) {
                previous = previous.next;
            }

            Node<E> current = previous.next;
            previous.next = current.next;
            size--;
            return current.element;
        }
    }

    public boolean contains(E e) {
        Node<E> current = head;

        for(int i=0; i<size; i++) {
            if(current.element.equals(i)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public E get(int index) {
        if(index < 0 || index > size-1)
            return null;

        Node<E> temp = head;

        for(int i=0; i<index; i++) {
            temp = temp.next;
        }
        return temp.element;
    }


    public E getFirst() {
        if(size==0) {
            return null;
        }
        else
            return head.element;
    }

    public E getLast(){
        if(size==0) {
            return null;
        }
        else
            return tail.element;
    }


    public int indexOf(E e){
        Node<E> current = head;

        for(int i=0; i<size; i++) {
            if(current.element.equals(e)) {
                return i;
            }
            current = current.next;
        }
        return -1;
    }

    public int lastIndexOf(E e){
        Node<E> current = head;
        int lastIndex = -1;

        for(int i=0; i<size; i++) {
            if(current.element.equals(e)) {
                lastIndex = i;
            }
            current = current.next;
        }
        return lastIndex;
    }

    public E set(int index, E e){
        if(index < 0 || index > size-1)
            return null;

        Node<E> current = head;

        for (int i=0; i<index; i++) {
            current = current.next;
        }

        E temp = current.element;
        current.element = e;

        return temp;
    }

    public void clear(){
        head = tail = null;
        size = 0;
        System.out.println("List is now empty.");
    }

    public void print() {
        Node<E> current = head;

        for(int i=0; i<size; i++) {
            System.out.print(current.element + " ");
            current=current.next;
        }
        System.out.println();
    }

    public void reverse() {
        for(int i=size - 1; i>=0; i--) {
            System.out.print(get(i) + " ");
        }
    }

    public int getSize() {
        return size;
    }

    public E getMiddleValue() {
        Node<E> current = head;
        int midVal = size/2;
        for(int i=0; i<midVal; i++) {
            current = current.next;
        }
        return current.element;
    }
}

