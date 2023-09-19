package generic.test.home;

import java.util.*;

public class DAO<T> {
    private Map<String,T> map =new HashMap<>();


    public void save(String id,T entity){
        map.put(id, entity);
    }

    public T get(String id){
        return map.get(id);
    }


    public void update(String id,T entity){
        map.put(id, entity);
    }

    public List<T> list(){

        //´´½¨ Arraylist
        List<T> list = new ArrayList<>();

        //±éÀúmap
        Set<String> strings = map.keySet();

        Iterator<String> iterator = strings.iterator();
        while (iterator.hasNext()) {
            String next =  iterator.next();
            list.add(map.get(next));

        }

        for (String key : strings) {
            list.add(map.get(key));
            
        }


        return list;

    }
    public void delete(String id) {
        map.remove(id);
    }
    public HashMap<String,T> list1(){
        HashMap<String, T> stringTHashMap = new HashMap<>();

        Set<Map.Entry<String, T>> entries = map.entrySet();
        Iterator<Map.Entry<String, T>> iterator = entries.iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, T> m =  iterator.next();
            System.out.println(m.getKey() + "-" + m.getValue());

        }
        return stringTHashMap;


    }
    public HashSet<T> list2(){
        HashSet<T> ts = new HashSet<>();
        Set<Map.Entry<String, T>> entries = map.entrySet();
        Iterator<Map.Entry<String, T>> iterator = entries.iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, T> next =  iterator.next();
            System.out.println(next.getValue());

        }
        return ts;



    }


}
