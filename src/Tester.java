import java.util.Arrays;

/**
 * @author Drumstyle92
 * class that contains the whole program.
 */
public class Tester {
    /**
     *
     * @param args fundamental parameter for main.
     * Main method that contains arrays and arrays methods, also prints comparisons between arrays.
     */
    public static void main(String[] args){
        // creation of String arrays.
        String[] aliceToDos = new String[]{"Coding","Reading","Learning"};
        String[] bobToDos = new String[]{"Reading","Coding","Learning","Sleeping"};
        String[] timToDos = new String[]{"Reading","Learning","Coding"};
        System.out.println("----------------------------requests1-----------------------------------------------");
        System.out.println("Is Alice's array equal to Bob array? " + Arrays.equals(aliceToDos,bobToDos));
        System.out.println("Is Alice's array equal to Tim array? " + Arrays.equals(aliceToDos,timToDos));
        System.out.println("----------------------------requests2-----------------------------------------------");
        boolean out = (aliceToDos.length == bobToDos.length);
        System.out.println("Is Alice's array having the same length of Bob's array? " + out);
        boolean out1 = (aliceToDos.length == timToDos.length);
        System.out.println("Is Alice's array having the same length of Tim's array? " + out1);
        // method that puts the order in the index of the arrays.
        Arrays.sort(aliceToDos);
        Arrays.sort(bobToDos);
        Arrays.sort(timToDos);
        System.out.println("----------------------------requests3-----------------------------------------------");
        System.out.println("Is Alice having the same tasks of Bob? " + Arrays.equals(aliceToDos,bobToDos));
        System.out.println("Is Alice having the same tasks of Tim? " + Arrays.equals(aliceToDos,timToDos));


    }
}
