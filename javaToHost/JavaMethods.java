public class JavaMethods {
    public static void funcn1(String name){
        System.out.println("Hello "+name+"\nWelcome to the Java adventure..!");
    }
    public static void funcn1(String name,String sname){
        System.out.println("Hello "+ name + sname +"\nWelcome to the Java adventure..!");
    }
    public static void main(String[] args){
        System.out.println("Calling method funcn1 and passing argument name");
        funcn1("@paNthera");
        System.out.println("Overloading method funcn1");
        funcn1("@paNthera","Nestah");
    }

}
