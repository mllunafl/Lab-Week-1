public class Main {

    public static void main(String[] args) {
	LinkedStringListImpl list = new LinkedStringListImpl();
        System.out.println(list.size());

        list.add("Hello");
        System.out.println(list.size());
        list.add("Hello2");
        System.out.println(list.size());
        list.add("Hello3");
        System.out.println(list.size());

        System.out.println(list.size());
    }
}