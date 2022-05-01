package io.codelex.oop.computers;

public class testComputer {
    public static void main(String[] args) {
        Computer computerLenovo = new Computer("Ryzen 5 4600U", "8GB","AMD Radeon", "Lenovo", "THINKBOOK 14");
        System.out.println(computerLenovo);

        Computer computerCapital = new Computer("AMD Ryzen 3 4300GE", "16GB","Radeon™ Graphics Vega 6", "Capital", "NEO™ X Study&Play");
        System.out.println(computerCapital);

        Laptop laptopApple = new Laptop("M1", "8GB","Apple M1 7 Core", "Apple", "MacBook Air 13", "A1237");
        System.out.println(laptopApple);

        String company = laptopApple.getCompany();
        System.out.println(company);

        String processor = laptopApple.getProcessor();
        System.out.println(processor);
    }
}
