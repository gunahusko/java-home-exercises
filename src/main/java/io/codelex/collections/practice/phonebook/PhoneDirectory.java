package io.codelex.collections.practice.phonebook;

import java.util.Map;
import java.util.TreeMap;

public class PhoneDirectory {
    private final TreeMap<String, String> phoneData;

    public PhoneDirectory() {
        phoneData = new TreeMap<>();
    }

    private boolean find(String name) {
        return phoneData.containsKey(name);
    }

    public String getNumber(String name) {
        if (!find(name)) {
            return null;
        } else {
            String result = "";
            for (Map.Entry<String, String> info : phoneData.entrySet()) {
                if (info.getKey().equals(name)) {
                    result = info.getValue();
                }
            }
            return result;
        }
    }

    public void putNumber(String name, String number) {
        if (name == null || number == null) {
            throw new IllegalArgumentException("name and number cannot be null");
        }

        if (find(name)) {
            System.out.println("Already exist.");
        } else {
            PhoneEntry newEntry = new PhoneEntry();  // Create a new pair.
            newEntry.name = name;
            newEntry.number = number;
            phoneData.put(newEntry.name, newEntry.number);   // Add the new pair to the array.
        }
    }

}
