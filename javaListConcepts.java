import java.util.ArrayList;

class javaListConcepts{
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Sumith");
        list.add("Manvith");
        list.add("Pavan");
        list.addFirst("Nithesh");
        list.addLast("Sarthak");
        System.out.println(list);
        String s=list.get(0);
        System.out.println(s);
        System.out.println(list.remove(2));
        System.out.println(list);

    }
}