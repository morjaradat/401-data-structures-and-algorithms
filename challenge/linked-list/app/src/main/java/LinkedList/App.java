/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package LinkedList;

public class App {

    public static void main(String[] args) {

//        System.out.println("hello ");
          linkedList<Object> link = new linkedList<>();
//        linkedList<Integer> ll = new linkedList<>();

        link.append(11);
        link.append(12);
        link.append(13);
        link.append("MMM");

        link.insertBefore(11,14);
        link.insertBefore(12,15);
        link.insertBefore("MMM",15);
        link.insertBefore(13,100);
//
//        link.insertAfter(11,100);
//        link.insertAfter(100,99);
//        link.insertAfter(100,12);

//        System.out.println(link);
//        System.out.println(link.kthFromEnd(1));
//        System.out.println(link.kthFromEnd(4));
//        System.out.println(link.kthFromEnd(0));
//        System.out.println(link.kthFromEnd(10));

//        link.insertAtEnd(10);
//        link.insertAtEnd(11);
//        link.insertAtEnd(12);
//        link.insertAtEnd(13);
//        link.insertAtEnd(10);

        link.insertAtEnd("m");
        link.insertAtEnd("o");
        link.insertAtEnd("o");
        link.insertAtEnd("m");


        System.out.println(link);

        System.out.println("reverse Array " +link.reverse(link));

        System.out.println("is the array palindrome => " +link.palindrome(link));
//
//        System.out.println(link);

//        System.out.println(link.includes(20));


    }
}