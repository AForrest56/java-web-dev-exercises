package exercises.technology;

public class Program {
    public static void main(String[] args) {

        Laptop myLaptop = new Laptop(2, 3, true, 5);
        SmartPhone mySmartPhone = new SmartPhone(1, 3, false);

        System.out.println("My laptop has: " + myLaptop.getStorage() + "TB of storage, a " +
                myLaptop.getCPUClockSpeed() + "gHz processor, and it has a physical keyboard: " +
                myLaptop.isHasPhysicalKeyboard());

        System.out.println(mySmartPhone);

        System.out.println();
    }

}
