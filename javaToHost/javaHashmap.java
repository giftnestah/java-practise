import java.util.HashMap;

public class javaHashmap {
    private HashMap<String, Integer> dict = new HashMap<String, Integer>();
    public void setDict() {
        String[] names = {"nestah","panthera","guru","charlotte","gitz"};
        Integer[] age = {18,16,20,22,25};
        for(int i = 0;i <= 4;i++){
            this.dict.put(names[i],age[i]);
        }
    }

    public HashMap<String, Integer> getDict() {
        return this.dict;
    }
    public static void main(String[] args){
        HashMap<String,Integer> map = new HashMap<String,Integer>();
        String[] names = {"nestah","panthera","guru","charlotte","gitz"};
        Integer[] age = {18,16,20,22,25};
        for(int i = 0;i <= 4;i++){
            map.put(names[i],age[i]);
        }
        for(String i : map.keySet()){
            System.out.println(map.get(i));
        }
    }
}
