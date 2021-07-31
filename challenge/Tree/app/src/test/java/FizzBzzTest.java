import data.Node;
import org.junit.Test;
import structure.BinaryTree;
import structure.KAryTree;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class FizzBzzTest {
private final List<Integer> list = new ArrayList<>();

    @Test
    public void emptyTree(){
        KAryTree<Integer> kAryTree = new KAryTree<>(list, 3);
        assertNull(kAryTree.treeFizzBuzz(kAryTree).getRoot());
    }

    @Test
    public void TreeDontHaveAny_3_5_Divide(){
        list.add(1);
        list.add(2);
        list.add(4);
        list.add(17);
        KAryTree<Integer> kAryTree = new KAryTree<>(list, 3);
        KAryTree<String> newTree = kAryTree.treeFizzBuzz(kAryTree);
        assertEquals("{  1  2  4  17  }",newTree.noOrder(newTree).toString());
    }

    @Test
    public void TreeHaveOnly_3_Divide(){
        list.add(3);
        list.add(6);
        list.add(9);
        list.add(12);
        KAryTree<Integer> kAryTree = new KAryTree<>(list, 3);
        KAryTree<String> newTree = kAryTree.treeFizzBuzz(kAryTree);
        assertEquals("{  Fizz  Fizz  Fizz  Fizz  }",newTree.noOrder(newTree).toString());
    }

    @Test
    public void TreeHaveOnly_5_Divide(){
        list.add(5);
        list.add(10);
        list.add(20);
        list.add(25);
        KAryTree<Integer> kAryTree = new KAryTree<>(list, 3);
        KAryTree<String> newTree = kAryTree.treeFizzBuzz(kAryTree);
        assertEquals("{  Buzz  Buzz  Buzz  Buzz  }",newTree.noOrder(newTree).toString());
    }

    @Test
    public void TreeHave_3_5_Divide(){
        list.add(5);
        list.add(10);
        list.add(15);
        list.add(18);
        list.add(45);
        list.add(30);
        KAryTree<Integer> kAryTree = new KAryTree<>(list, 3);
        KAryTree<String> newTree = kAryTree.treeFizzBuzz(kAryTree);
        assertEquals("{  Buzz  Buzz  FizzBuzz  Fizz  FizzBuzz  FizzBuzz  }",newTree.noOrder(newTree).toString());
    }
}
