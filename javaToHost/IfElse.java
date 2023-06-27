public class IfElse {
    public static void main(String[] args){
        String name="Panthera";
        if(name.isEmpty()){
            System.out.println("No valid name provided");
        }
        else if(name.length()>=5){
            System.out.println("Name fairly long");
        }
        else
            System.out.println("Name too short");
    }
}
