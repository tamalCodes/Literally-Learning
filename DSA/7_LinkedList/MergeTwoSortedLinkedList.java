class Node {
    int value;
    Node next;

    Node() {
    }

    Node(int value) {
        this.value = value;
    }

    Node(int value, Node next) {
        this.value = value;
        this.next = next;
    }
}

public class MergeTwoSortedLinkedList {

    public Node mergeTwoLists(Node list1, Node list2) {

        if (list1 == null)
            return list2;

        if (list2 == null)
            return list1;

        // first node duto store korechi of each of the list
        Node currentNode1 = list1;
        Node currentNode2 = list2;
        Node C = null;
        Node H = null;

        while (currentNode1 != null && currentNode2 != null) {
            if (currentNode1.value <= currentNode2.value) {

                // check if the head is empty
                // meaning this element will be the first element
                // so we assign the Current and Head to it

                // else we assign the C.next to the element so that it is linked
                // then we say C = currentNode1, as it is currently pointing there now
                if (H == null) {
                    H = currentNode1;
                    C = currentNode1;
                } else {
                    C.next = currentNode1;
                    C = currentNode1;
                }

                currentNode1 = currentNode1.next;
            } else {
                if (H == null) {
                    H = currentNode2;
                    C = currentNode2;
                } else {
                    C.next = currentNode2;
                    C = currentNode2;
                }

                currentNode2 = currentNode2.next;
            }
        }

        // The loop has now ended if One of the arrays was larger than the other array
        // then it is possible that we have a lot of elements left in one of the array.
        // So we check if the head is not null (meaning we have element) then we run a
        // simple loop to add all those elements

        while (currentNode1 != null) {
            C.next = currentNode1;
            C = currentNode1;
            currentNode1 = currentNode1.next;
        }

        while (currentNode2 != null) {
            C.next = currentNode2;
            C = currentNode2;
            currentNode2 = currentNode2.next;
        }

        return H;
    }
}
