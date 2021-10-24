package algo;

class SingleLinkedList<T> {
    public Node<T> head = null;
    
    // 노드 구현
    public class Node<T> {
        // 데이터 필드, 주소값 필드
        T data;
        Node<T> next = null;

        public Node(T data) {
            this.data = data;
        }
    }

    public void addNode(T data) {
        // List 안에 데이터가 없다면,
        if (head == null) {
            head = new Node<T>(data);
        }
        // 데이터가 있다면,
        else {
            Node<T> node = this.head;
            while(node.next != null) {
                node = node.next;
            }
            node.next = new Node<>(data);
        }
    }

    public void printAll() {
        if (head != null) {
            Node<T> node = this.head;
            System.out.println(node.data);
            while (node.next != null) {
                node = node.next;
                System.out.println(node.data);
            }
        }
    }

    public Node<T> search(T data) {

        if (this.head == null) {
            return null;
        }
        else {
            Node<T> node = this.head;
            while(node != null) {
                if (node != null) {
                    return node;
                }
                else {
                    node = node.next;
                }
            }
            return null;
        }
    }

    public void addNodeInside(T data, T isData) {
        Node<T> searchedNode = this.search(isData);

        if (searchedNode == null) {
            this.addNode(data);
        }
        else {
            Node<T> nextNode = searchedNode.next;
            searchedNode.next = new Node<T>(data);
            searchedNode.next.next = nextNode;
        }
    }

    public boolean delNode(T isData) {
        if (this.head == null) {
            return false;
        }
        else {
            Node<T> node = this.head;
            if (node.data == isData) {
                this.head = this.head.next;
                return true;
            }
            else {
                while (node.next != null) {
                    if (node.next.data == isData) {
                        node.next = node.next.next;
                        return true;
                    }
                    node = node.next;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        SingleLinkedList<Integer> MyLinkedList = new SingleLinkedList<Integer>();
        MyLinkedList.addNode(1);
        MyLinkedList.addNode(2);
        MyLinkedList.addNode(3);
        MyLinkedList.addNode(4);
        MyLinkedList.addNode(5);

//        MyLinkedList.printAll();
//
//        System.out.println("=====================");
//        MyLinkedList.addNodeInside(5, 1);
//
//        MyLinkedList.printAll();
//
//        System.out.println("=====================");

        MyLinkedList.addNodeInside(7, 20);
        MyLinkedList.printAll();

        System.out.println("=====================");
        MyLinkedList.delNode(3);
        MyLinkedList.printAll();

        System.out.println("헤드삭제");
        MyLinkedList.delNode(1);
        MyLinkedList.printAll();

        System.out.println("마지막 노드삭제");
        MyLinkedList.delNode(5);
        MyLinkedList.printAll();

        System.out.println("없는 노드 삭제시");
        System.out.println(MyLinkedList.delNode(20));
    }
}