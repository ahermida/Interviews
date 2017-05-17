package DataStructures;

import java.util.Arrays;

public class ArrayList<T> {
    private final int MAXSIZE = 640;

    private Object[] list; /* holds items */
    private int spot; /* next open spot in the array */
    private int size; /* current size of the array */
    public ArrayList() {
        list = new Object[10];
        size = 10;
        spot = 0;
    }
    
    /* doubles list size */
    private boolean enlarge() {
        /* if it's a full list, double the size and copy over items*/
        if (size * 2 > MAXSIZE) 
            return false;
        size *= 2;
        Object[] biggerList = new Object[size];
        int i = 0;
        for (Object item: list) {
            biggerList[i++] = item;
        }
        list = biggerList;
        return true;
    }
    
    /* add item to arrayList; */
    public boolean add(T item) {

        /* if the list is reaching its end, double its size */
        if (size == spot && !enlarge()) {

            /* return false if it's at its end */
            return false;
        }

        /* else add new item to last spot */
        list[spot++] = item;
        return true;
    }

    /* add item at index */
    public void add(int index, T item) {
        if (size == spot && !enlarge()) {
            return;
        } else {

            /* shift all items over by 1 till we get to index*/
            for (int i = spot; i > index; i--) {
                list[i] = list[i - 1];
            }
            list[index] = item;
            spot++;
        }
    }

    /* get item at index */
    @SuppressWarnings("unchecked")
    public T get(int i) {
        
        /* if index is out of bounds return null*/
        if (i < 0 || i > size - 1)
            return null;
        else
            return (T) list[i];
    }
    
    /* get index of item in a list */
    @SuppressWarnings("unchecked")
    public int indexOf(T item) {
        int i = 0;
        while (!list[i].equals(item) && i < size) {
            i++;
        } 
        if (i == spot)
            return -1;
        else
            return i;
    }
    

    /* removes item from list */
    public void remove(T item) {
        int index = indexOf(item);
        removeAt(index);
    }
    
    /* remove at a particular index */ 
    public void removeAt(int i) {
        if (i > -1 && i < size) {
            for (int index = i; index < spot; index++)
                list[index] = list[index + 1];
        }
        spot--;
    }

    /* sets item at a particular index */
    public void set(int i, T item) {
        if (i > -1 && i < size) {
            list[i] = item;
        } 
    }

    /* prints array */
    @SuppressWarnings("unchecked")
    public String toString() {
        return Arrays.toString(list);
    }
}
