/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package Challenge05;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {
    @Test void tests(){
        LinkedList list1 = new LinkedList();
        list1.append(1);
        list1.append(2);

        String str = list1.toString1();
//        System.out.println(str);
        assertEquals(" { 1 } -> { 2 } -> NULL",str);

        list1.append(5);
        list1.append(6);
        String str1 = list1.toString1();
//        System.out.println(str1);
        assertEquals(" { 1 } -> { 2 } -> { 5 } -> { 6 } -> NULL",str1);

        list1.insertBefore(5, 4);
        String str2 = list1.toString1();
//        System.out.println(str2);
        assertEquals(" { 1 } -> { 2 } -> { 4 } -> { 5 } -> { 6 } -> NULL",str2);

        list1.insertBefore(1, 0);
        String str3 = list1.toString1();
//        System.out.println(str3);
        assertEquals(" { 0 } -> { 1 } -> { 2 } -> { 4 } -> { 5 } -> { 6 } -> NULL",str3);

        list1.insertAfter(2, 3);
        String str4 = list1.toString1();
//        System.out.println(str4);
        assertEquals(" { 0 } -> { 1 } -> { 2 } -> { 3 } -> { 4 } -> { 5 } -> { 6 } -> NULL",str4);

        list1.insertAfter(6, 7);
        String str5 = list1.toString1();
//        System.out.println(str5);
        assertEquals(" { 0 } -> { 1 } -> { 2 } -> { 3 } -> { 4 } -> { 5 } -> { 6 } -> { 7 } -> NULL",str5);

    }

    @Test
    void challenge07test1(){
        LinkedList list = new LinkedList();
        list.append(5);
        list.append(3);
        list.append(1);
        list.append(9);

        int test1 = list.kthfromend(5);
        assertEquals(-1,test1);
    }

    @Test
    void challenge07test2(){
        LinkedList list = new LinkedList();
        list.append(5);
        list.append(3);
        list.append(1);
        list.append(9);

        int x = list.kthfromend(3);
        assertEquals(5,x);
    }

    @Test
    void challenge07test3(){
        LinkedList list = new LinkedList();
        list.append(5);
        list.append(3);
        list.append(1);
        list.append(9);

        int x = list.kthfromend(-1);
        assertEquals(-1,x);
    }

    @Test
    void challenge07test4(){
        LinkedList list = new LinkedList();
        list.append(5);

        int x = list.kthfromend(0);
        assertEquals(5,x);
    }

    @Test
    void challenge07test5(){
        LinkedList list = new LinkedList();
        list.append(5);
        list.append(3);
        list.append(1);
        list.append(9);

        int x = list.kthfromend(2);
        assertEquals(3,x);
    }

    @Test
    void Challenge08test1(){
        LinkedList listA = new LinkedList();
        listA.append(1);
        listA.append(3);
        listA.append(2);
        LinkedList listB = new LinkedList();
        listB.append(5);
        listA.append(9);
        listA.append(4);
        LinkedList zipOutput = new LinkedList();
        zipOutput = zipOutput.zip(listA,listB);
        System.out.println(zipOutput.toString1());
        assertEquals(" { 1 } -> { 5 } -> { 3 } -> { 2 } -> { 9 } -> { 4 } -> NULL",zipOutput.toString1());
    }

    @Test
    void Challenge08test2(){
        LinkedList listA = new LinkedList();
        listA.append(1);
        listA.append(3);
        LinkedList listB = new LinkedList();
        listB.append(5);
        listA.append(9);
        listA.append(4);
        LinkedList zipOutput = new LinkedList();
        zipOutput = zipOutput.zip(listA,listB);
        System.out.println(zipOutput.toString1());
        assertEquals(" { 1 } -> { 5 } -> { 3 } -> { 9 } -> { 4 } -> NULL",zipOutput.toString1());
    }

    @Test
    void Challenge08test3(){
        LinkedList listA = new LinkedList();
        listA.append(1);
        listA.append(3);
        listA.append(2);
        LinkedList listB = new LinkedList();
        listB.append(5);
        listB.append(9);
        LinkedList zipOutput = new LinkedList();
        zipOutput = zipOutput.zip(listA,listB);
        System.out.println(zipOutput.toString1());
        assertEquals(" { 1 } -> { 5 } -> { 3 } -> { 9 } -> { 2 } -> NULL",zipOutput.toString1());
    }
}
