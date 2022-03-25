package io.codelex.collections.practice.phonebook;

public class testPhoneDirectory {
    public static void main(String[] args) {
        PhoneDirectory phoneDirectory = new PhoneDirectory();

        phoneDirectory.putNumber("Alise", "1234567");
        phoneDirectory.putNumber("Roberts", "2345678");
        phoneDirectory.putNumber("Alise", "1234567");

        System.out.println(phoneDirectory.getNumber("Alise"));
        System.out.println(phoneDirectory.getNumber("Roberts"));
    }
}
