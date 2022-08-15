import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        Random random = new Random();
        int[] array = new int[10];
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        for (int i = 0; i < 10; i++) {
            array[i] = random.nextInt(2);
            arrayList.add(random.nextInt(2));
            linkedList.add(random.nextInt(2));
        }

        System.out.println("Unsorted Array: " + Arrays.toString(array));
        sortArray(array);
        System.out.println("Sorted Array: " + Arrays.toString(array) +"\n");

        System.out.println("Unsorted ArrayList: " + arrayList);
        sortArrayList(arrayList);
        System.out.println("Sorted ArrayList: " + arrayList +"\n");

        System.out.println("Unsorted LinkedList: " + linkedList);
        sortLinkedList(linkedList);
        System.out.println("Sorted LinkedList: " + linkedList +"\n");

    }

    public static void sortArray(int[] integerArray) {
        Arrays.sort(integerArray); //variant 1 - sorting Array with loop "sort() method"
//        variant2 - sorting Array with loop "for"
//        int temp = 0;
//        for (int i = 0; i < array.length; i++) {
//            for (int j = i + 1; j < array.length; j++) {
//                if (array[i] > array[j]) {
//                    temp = array[i];
//                    array[i] = array[j];
//                    array[j] = temp;
//                }
//            }
//        }
    }

    public static void sortArrayList(ArrayList<Integer> arrayList) {
        Collections.sort(arrayList);
    }

    public static void sortLinkedList(LinkedList<Integer> integerLinkedList) {
        Collections.sort(integerLinkedList);
    }
}