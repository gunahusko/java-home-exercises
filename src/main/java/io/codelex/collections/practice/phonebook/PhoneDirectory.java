package io.codelex.collections.practice.phonebook;

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
            return phoneData.get(name);
        }
    }

    public void putNumber(String name, String number) {
        if (name == null || number == null) {
            throw new IllegalArgumentException("name and number cannot be null");
        }

        if (find(name)) {
            System.out.println("Already exist.");
        } else {
            PhoneEntry newEntry = new PhoneEntry(name, number);  // Create a new pair.
            phoneData.put(newEntry.getName(), newEntry.getNumber());   // Add the new pair to the array.
        }
    }

}
