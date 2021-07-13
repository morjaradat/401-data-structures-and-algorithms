package stack_queue_brackets;

import java.util.ArrayList;
import java.util.Arrays;

public class validateBrackets {

    public boolean validateBracket(String data){
        ArrayList<Boolean> array = new ArrayList<>();
            if (data.contains("{")||data.contains("}")){
                if (data.contains("{")&&data.contains("}")){
                    array.add(true);
                }else {
                    array.add(false);
                }
            }
            if (data.contains("[")||data.contains("]")){
                if (data.contains("]")&&data.contains("[")){
                    array.add(true);
                }else {
                    array.add(false);
                }
            }
        if (data.contains("(")||data.contains(")")){
            if (data.contains(")")&&data.contains("(")){
                array.add(true);
            }else {
                array.add(false);
            }
        }
        return !array.contains(false);

    }
}
