public class Demo15_Strings {
    public static void main(String[] args) {
        String name1 = new String("Ujjwal");
        System.out.println("Hello "+ name1);
        System.out.println(name1.hashCode());

        String name2 = "Ujjwal";
        String name3 = "Ujjwal";
        System.out.println(name1 == name2);
        System.out.println(name2 == name3); // true because both refer to same object in string pool

        // This String is mutable, To create mutable string we use StringBuilder or StringBuffer class
        StringBuffer sb = new StringBuffer("Ujjwal");
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        sb.append(" Kumar");
        System.out.println(sb);
        // String str = sb.toString();
        sb.setLength(30);
        sb.ensureCapacity(100);
        // String Buffer is thread safe but StringBuilder is not thread safe.
    }
}
