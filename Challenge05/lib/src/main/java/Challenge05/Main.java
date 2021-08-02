package Challenge05;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.append(5);
        list.append(3);
        list.append(1);
        list.append(9);

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

        System.out.println("\n");
        System.out.println("CodeChallenge06");
        System.out.println("\n");

        list.insertAfter(9, 6);
        String str1 = list.toString1();
        list.print();
        System.out.println(str1);
        System.out.println("\n");
        list.insertBefore(5, 7);
        list.print();
        String str2 = list.toString1();
        System.out.println(str2);
    }
}
