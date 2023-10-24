package exercise2_4;

public class Main {
    public static void main(String[] args) {
        Device a = new Device("Samsung", 120, "AB1234567CD");
        Device b = new Monitor("Samsung", 120, "AB1234567CD",
                1280, 1024);

        System.out.println(a.toString());
        System.out.println(b.toString());

        b.setManufacturer("Samsung111");
        System.out.println(b.toString());
    }
}
