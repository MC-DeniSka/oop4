public class program2 {
    public static void main(String[] args) {
        Integer[] intArray = {6,3,7,2,0,1};
        Double[] doubleArray = {5.2,4.8,9.5,8.7};
        String[] stringArray = {"Hello","World","Peoples"};
        printArray(intArray);
        printArray(doubleArray);
        printArray(stringArray);

    }
    public static <T> void printArray(T[] array){
        System.out.print("[");
        for (int i = 0; i<array.length; i++){
            System.out.print(array[i]);
            if (i != array.length - 1){
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
