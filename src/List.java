public class List {
    private static class Node {

        private int val;
        private Node next;

        private Node(int v, Node head) {
            val = v;
            next = head;
        }


    }
    private Node head;

    public List() { head = null; }

    public void add(int i) { head = new Node(i, head); }

    public void delete() {
        Node h=head;
        if(h!=null)
        {
            head=head.next;
            h=null;
        }
    }

    public void fillByRandom(int count) {
        for (int i = 0; i < count; i++) {
            int randomValue = (int) (Math.random() * 10 - 1);
            this.add(randomValue);
        }
    }

    public void print() {
        Node h = head;
        while (h != null) {
            System.out.print(h.val + " ");
            h = h.next;
        }
        System.out.println();
    }

    public void reverse() {
        Node temporary;
        Node after_head = head.next;//Запоминаем следующий элемент после head
        head.next = null; //Удаляем связь head со следующим узлом
        while (after_head != null) {
            temporary = after_head.next;
            after_head.next = head;//Устанавливаем в next тому который идет после первого - head (при этом мы теряем ссылку на узел после второго), записали в tmporary ссылку на 3 узел в очереди
            head = after_head;
            after_head = temporary;
        }
    }

    public void removeDoubles() {
        Node element = head;
        while (element != null) {
            Node counter = element;
            Node equal = element.next;
            while (equal != null) {
                if (element.val == equal.val) {//когда дойдём до совпадающего, то мы в ссылку на следующий элемент counter запишем следующий equal
                    counter.next = equal.next;
                } else counter = equal;//а если значения разные, тогда текущий элемент оставляем,
                equal = counter.next;
            }
            element = element.next;
        }
    }
}
