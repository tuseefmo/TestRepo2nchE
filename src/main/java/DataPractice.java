import java.util.*;

public class DataPractice {

    public static void main(String[] args){

        //LIST EXAMPLE

        ArrayList<String> arr1=new ArrayList<>();
        arr1.add("NPD");
        arr1.add("newyork");
        arr1.add("boston");

        System.out.println(arr1);

        arr1.remove("NPD");
        System.out.println(arr1);

        System.out.println("=================================");

        LinkedList<String> arr2=new LinkedList<>();
        arr2.add("pqm");
        arr2.add("java");
        arr2.add("tea");
        System.out.println(arr2);
        arr2.remove(1);
        System.out.println(arr2);


        //List and Set: Size is dynamic, only supports Objects
        //List: Accepts duplicated objects, has index number, size is dynamic
        //ArrayList: Array based, faster for get
        //LinkedList: fastest add, remove functions are faster than arrrayList

        //SET: Does NOT accept duplicated objects, only keeps unique ones. Does not have index number, size is dynamic
        //HASHSET: Changes the insertion orders (order is random)
        //LINKEDHASHSET: does NOT change the insertion order
        //TREESET: Implement sorted set interface, sorts the objects in ascending order


        System.out.println("=====================================");

        //SET EXAMPLE:

        Set<Integer> s1=new HashSet<>();
        s1.add(1);
        s1.add(2);
        s1.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,9,9,9));
        System.out.println("Hashset : " +s1);

        Set<Integer> s2=new LinkedHashSet<>();
        s2.addAll(Arrays.asList(15,11,12,12,20,24,5));
        System.out.println("LinkedHashSet : "+s2);

        Set<Integer>s3=new TreeSet<>();
        s3.addAll(Arrays.asList(8,5,4,3,10,7,1));
        System.out.println("TreeSet : "+s3);



    }

}
