import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class foreach {
    public static void main(String ags[]){

        List<Integer> nums = Arrays.asList(4,4,5,3,2,1,45);
        nums.forEach(n->System.out.println(n));
    }
}
