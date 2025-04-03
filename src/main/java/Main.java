public class Main {
    public static void main(String[] args) {
        IntList intList = new IntList();
        System.out.println(intList);
        intList.append(10);
        intList.append(11);
        intList.append(12);
        System.out.println(intList);
        intList.delete();
        intList.append(20);
        System.out.println(intList);


        GenericList<Integer> genericIntList = new GenericList<>();
        System.out.println(genericIntList);
        genericIntList.append(10);
        genericIntList.append(11);
        genericIntList.append(12);
        System.out.println(genericIntList);
        genericIntList.delete();
        genericIntList.append(20);
        System.out.println(genericIntList);

        GenericList<String> genericStringList = new GenericList<>();
        System.out.println(genericStringList);
        genericStringList.append("Apple");
        genericStringList.append("Banana");
        genericStringList.append("Pear");
        System.out.println(genericStringList);
        genericStringList.delete();
        genericStringList.append("Orange");
        System.out.println(genericStringList);

    }
}
