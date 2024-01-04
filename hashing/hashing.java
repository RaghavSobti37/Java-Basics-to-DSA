import java.util.*; // importing hashset
public class hashing{
    public static void main(String[] args) {
        // creation of hashset
        HashSet<Integer> set = new HashSet<>();

        //insert
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);

        //search 
        if(set.contains(1)){
            System.out.println("Set contains 1");
        }

        if(!set.contains(6)){
            System.out.println("Does not contain 6");
        }

        // delete 
        set.remove(2);
        if(!set.contains(2)){
            System.out.println("Deletes 2");
        }

        // size
        System.out.println("Size of set is : " + set.size());
        System.out.println(set);

        //iterator
        Iterator it = set.iterator();
        //hasNext , next

        while(it.hasNext()){
            System.out.print(it.next() + " ");
        }

        // hashmap for country against population
        HashMap<String ,Integer> map = new HashMap<>();
        
        // insertion
        map.put("India" , 120);
        map.put("China" , 150);
        map.put("USA" , 40);
        
        System.out.println(map);

        // search 
        if(map.containsKey("India")){
            System.out.println("key is present in the map");
        } else {
            System.out.println("Key is not present in the map");
        }

        System.out.println(map.get("China"));

        //iteration 
        // for (int val : arr);
        // (value , collection name)
        for(Map.Entry<String , Integer> e : map.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        Set<String> keys = map.keySet();
        for(String key : keys){
            System.out.println(key + "," + map.get(key));
        }

        // deletion
        map.remove("China");
        System.out.println(map);
    }
}