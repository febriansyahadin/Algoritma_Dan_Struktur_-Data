package pertemuan13.doublelinkedlists;

public class DoublelinkedlistsMain {
    public static void main(String[] args) throws Exception { 
        Doublelinkedlist dll = new Doublelinkedlist();

        dll.print();
        System.out.println("Size : "+dll.size());
        System.out.println("====================");

        dll.addFirst(3);
        dll.addLast(4);
        dll.addFirst(7);
        dll.print();
        System.out.println("Size : "+dll.size());
        System.out.println("=====================");
        dll.add(40, 1);
        dll.print();
        System.out.println("Size : "+dll.size());
        System.out.println("=====================");
        dll.clear();
        dll.print();
        System.out.println("Size : "+dll.size());
    }
}
