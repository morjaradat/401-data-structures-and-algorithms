package Hashtable.LeftJoin;

import Hashtable.HashMap.HashMap;

import java.util.ArrayList;
import java.util.List;

public class LeftJoin {

    public List<String[]> leftJoin(HashMap<String,String> map1 ,HashMap<String,String> map2){

//        Hashtable.HashMap<String,String[]> result = new Hashtable.HashMap<String, String[]>();
        List<String[]> result = new ArrayList<>();

        List<String> firstMapKeys = map1.keySet();

        if (firstMapKeys.size()>0){
            for (String key : firstMapKeys){
                if (map2.contain(key)){
                    String[] newValue = {key,map1.get(key),map2.get(key)};
                    result.add(newValue);
                }else {
                    String[] newValue = {key,map1.get(key),"NULL"};
                    result.add(newValue);
                }
            }
        }

      return (result != null) ? result : null ;
    }
}
