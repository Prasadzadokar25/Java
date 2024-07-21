import java.util.*;

class Demo {
    public static void main(String[] args) {
        List<Integer> al = new ArrayList<Integer>();
        List<Integer> al2 = new ArrayList<Integer>();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        System.out.println(al);
        System.out.println(al.size());
        System.out.println(al.contains(20));
        System.out.println(al.get(2));
        System.out.println(al.indexOf(30));

        Integer[] arr = al.toArray(new Integer[0]);
        System.out.println(Arrays.toString(arr));


        al2.addAll(al);
        //System.out.println(al2);

        for(var obj : al){
            System.out.println(obj);
        }

    }
}