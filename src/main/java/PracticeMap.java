import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeMap {
    public static void main(String[] args) {
        Map<String,Object> empDetails=new HashMap<>();
        empDetails.put("ID",1002195);
        empDetails.put("Name","Manish Singh");
        empDetails.put("Hobbies",new String[]{"VolleyBall","Singing","Swiming"});
        empDetails.put("Desiganation","Test Analyst");
        empDetails.put("isMarried",false);

        for(Map.Entry<String,Object> entry:empDetails.entrySet()){
            if(entry.getKey().equalsIgnoreCase("HobBIes")){
                System.out.print("Hobbies-----");

                for(String i:(String[])entry.getValue()){
                    System.out.print(i+" ");
                }
                System.out.println();
            }else
            System.out.println(entry.getKey()+"-----"+entry.getValue());
        }
    }
}
