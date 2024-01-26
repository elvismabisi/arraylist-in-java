import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
public class ArrayLists {

    /**
     * @param args the command line arguments
     */
    ArrayList marks = new ArrayList();
    public void storeMarks(){
        System.out.println("Storing marks, Please wait...");
        marks.add(67);
        marks.add(50);
        marks.add(45);
        marks.add(75);
    }
    public void displayMarks(){
        System.out.println("Marks are:");
        System.out.println("Iterating ArrayList using for loop");
        for (int i = 0; i <marks.size();i++){
            System.out.println(marks.get(i));
        }
        System.out.println("---------");
    
    Iterator imarks = marks.iterator();
    System.out.println("Iterating ArrayList using iterator:");
    while (imarks.hasNext()){
        System.out.println(imarks.next());
    }
    System.out.println("---------");
    Collections.sort(marks);
    
    }
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayLists arrayListExample = new ArrayLists();
        arrayListExample.storeMarks();
        arrayListExample.displayMarks();
    }
    
}
