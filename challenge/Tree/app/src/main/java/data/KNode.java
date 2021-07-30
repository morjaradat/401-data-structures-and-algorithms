package data;

import java.util.ArrayList;
import java.util.List;

public class KNode<T> {
    private T parent;
    private List<KNode<T>> child;
    private  T data;

    private static int maxNrOfChildren;

    public KNode(T data) {
        this.data = data;
        child= new ArrayList<KNode<T>>(maxNrOfChildren);
    }
    public KNode() {

    }

    public void addChild(KNode<T> childNode, int position)
    // You must take care so that future insertions don't override a child on i-th position
    {
        if(position>=maxNrOfChildren-1)
        {
            // Throw some error

        }

        else
        {
            System.out.println("this.children="+this.child);
            if(this.child.get(position)!=null)
            {
                // There is alerady a child node on this position; throw some error;
            }
            else
            {
                childNode.parent= (T) this;
                this.child.set(position, childNode);
            }
        }
    }

}
