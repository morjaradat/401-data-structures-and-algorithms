/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package HashTable;

public class App {

    public static void main(String[] args) {
        System.out.println("test");
      HashTables<String,Integer> hashTables = new HashTables<>();

      hashTables.add("mohammad1",10);
      hashTables.add("mohammad2",20);
      hashTables.add("mohammad3",30);
      hashTables.add("mohammad4",40);

        System.out.println("the size is "+ hashTables.getSize());
        System.out.println("the mohammad2 is "+ hashTables.get("mohammad1"));
//        System.out.println("the delete is "+ hashTables.remove("mohammad2"));
//        System.out.println("the size is "+ hashTables.getSize());


    }
}