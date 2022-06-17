interface FirstInterface {
    public static int qqq = 1;
    public void myMethod(); // interface method
}

interface SecondInterface {
    public void myOtherMethod(); // interface method
}

// DemoClass "implements" FirstInterface and SecondInterface
class DemoClass implements FirstInterface, SecondInterface {
    public void myMethod() {
        System.out.println("Some text..");
    }
    public void myOtherMethod() {
        System.out.println("Some other text...");
    }
}
class DemoClass_ implements FirstInterface {
    public void myMethod() {
        System.out.println("Some text..");
    }

}
class Main {
    public static void main(String[] args) {
        DemoClass myObj = new DemoClass();
        char[] chars = new char[11];
        System.out.println("chars[1] " + chars[1]);
//        DemoClass.qqq = 6;
        myObj.myMethod();
        myObj.myOtherMethod();
    }
}
