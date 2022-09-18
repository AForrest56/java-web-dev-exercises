package exercises.technology;

import java.util.HashMap;

public class SmartPhone extends Computer{

    private HashMap<String, String> contactBook = new HashMap<>();

    public SmartPhone(int storage, int CPU, boolean hasPhysicalKeyboard){
        super(storage, CPU, hasPhysicalKeyboard);
    }

    public void addContact(String name, String phoneNumber){
        contactBook.put(name, phoneNumber);
    }
}
