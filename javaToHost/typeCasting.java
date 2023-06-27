public class typeCasting {
    public static void main(String[] args){
        //byte -> short -> char -> int -> long -> float -> double
        //double -> float -> long -> int -> char -> short -> byte
        int varInt=64;
        System.out.println("Integer type: "+varInt);
        System.out.println("Casted to float: "+(float)varInt);
        System.out.println("Casted to a double: "+(double)varInt);
        System.out.println("Casted to a character: "+(char)varInt);
    }
}
