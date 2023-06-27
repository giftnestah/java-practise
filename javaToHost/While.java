public class While {
    public static void main(String[] args){
        int i=0;
        while(i<=5){
            System.out.println("counter at: "+i);
            i++;
        }
        System.out.println("do-while executes block atleast once");
        do {
            System.out.println("counter at: "+i);
            i--;
        }while(i>=0);
        System.out.println("break exits the loop,continue skips to the next iteration before");
    }
}
