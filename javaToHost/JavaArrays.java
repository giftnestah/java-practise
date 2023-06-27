import java.util.Arrays;

public class JavaArrays {
    public static void main(String[] args){
        String[] cars={"Subaru","Audi","Benz","Volks Waggon"};
        int[] power={750,550,600,450};
        int[][] di_array={{1,2,3,4},{750,550,600,450}};
        for(int i=0;i<4;i++){
            System.out.println(cars[i]+"    "+power[i]);
        }
        System.out.println("Looping through array with for-each");
        for(int[] i : di_array){
            System.out.println(Arrays.toString(i));
        }
    }
}
