public class program1{
    public static void main(String[] args) {
        printElement(1);
        printElement("Hello!");
        printElement(5.6);
    }
    public static <T> void printElement(T element){
            System.out.println(element);
        }
}