package Challenge05;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(5);
        list.insert(3);
        list.insert(1);

//        list.print();

        boolean includes = list.includes(5);
        System.out.println(includes);
        boolean includes1 = list.includes(3);
        System.out.println(includes1);
        boolean includes2 = list.includes(1);
        System.out.println(includes2);
        boolean includes3 = list.includes(4);
        System.out.println(includes3);

        String str = list.toString1();
        System.out.println(str);
    }
}
