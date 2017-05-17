package DataStructures;

public class TestArrayList {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        System.out.println("Testing add, get, then remove:");
        boolean passed; 
        
        try { 
            passed = testAddGetRemove(list);
        } catch (Exception e) {
            passed = false;
            System.out.println(e);
        }

        System.out.println("Test " + (passed ? "Passed!" : "Failed"));
    }
    
    /* tests add, get, and remove - takes an EMPTY ARRAYLIST */
    public static boolean testAddGetRemove(ArrayList<String> arr) {
        
        //add 3 strings
        arr.add("one");
        arr.add("two");
        arr.add("three");

        System.out.println(arr);

        //get 1, 2, & 3
        arr.get(1);
        arr.get(2);
        arr.get(3);

        //remove them all
        arr.remove("one");
        arr.remove("two");
        arr.remove("three");
        
        System.out.println(arr);

        return true;
    }
}
