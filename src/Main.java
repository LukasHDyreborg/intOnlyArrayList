public class Main {

    public static void main(String[] args) {
        IntOnlyArrayList intArray = new IntOnlyArrayList();
        intArray.add(5);
        System.out.println(intArray);

        intArray.add(0,1);
        System.out.println(intArray);

        intArray.remove(0);
        System.out.println(intArray);

        intArray.clear();
        System.out.println(intArray);

        intArray.add(4);
        System.out.println(intArray);
    }
}
