public class program3 {
    public static void main(String[] args) {
      System.out.println(getMax(1,6));
      System.out.println(getMax(7.8,2.1));
      System.out.println(getMax("ВАСЯ","АНТОН"));
    }
    public static <T extends Comparable<T>> T getMax(T element1, T element2){
        return element1.compareTo(element2) >= 0 ? element1:element2;
    }
}