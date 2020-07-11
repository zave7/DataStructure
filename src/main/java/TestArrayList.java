public class TestArrayList {

    public static void main(String[] args) throws Exception{
        ArrayList array = new ArrayList();
        array.add("1");
        array.add("2");
        array.add("3");
        array.add("4");
        array.add("5");

        System.out.println(array.get(3));

        array.remove(3);

        System.out.println(array.get(3));

        array.remove(4);
    }
}
