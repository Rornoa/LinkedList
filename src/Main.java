public class Main {
    public static void main(String args[]) {
        List list = new List();
        list.fillByRandom(15);
        list.print();
        list.reverse();
        list.print();
        list.removeDoubles();
        list.print();
        list.delete();
        list.print();
    }
}
