import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Rps {
    
    public static int comp(int o1 ,int o2){
        if(o1 == 2 && o2 == 0) return -1;
        else if(o1 == 0 && o2 == 2) return 1;
        else return o1 - o2;
    }

    public static void main(String[] args) {
        System.out.println("choose rps");
        try (Scanner sc = new Scanner(System.in)) {
            String s = sc.next().toLowerCase();
            Pattern pattern = Pattern.compile("[rps]", Pattern.CASE_INSENSITIVE);
            Matcher matcher = pattern.matcher(s);
            s = matcher.find()? s: "r";

            Random r = new Random();
            int pc = r.nextInt(3);
            HashMap<String,Integer> map = new HashMap<String, Integer>() {{
                put("r", 0);
                put("p", 1);
                put("s", 2);        
                }
            };
            String rps[] = new String[] { "r", "p", "s" };
            System.out.println(s + " vs " + rps[pc]);
            int end = comp(map.get(s),pc);
            if(end<0)  System.out.println( " lose ");
            else if(0<end)  System.out.println( " win ");
            else  System.out.println( " draw ");
        }

    }
}

// class Rps1compare implements Comparator<Integer>{
    
//     @Override
//     public int compare(Integer o1, Integer o2) {
//         if(o1 == 2 && o2 == 0) return -1;
//         else if(o1 == 0 && o2 == 2) return 1;
//         else return o1 - o2;
//     }
// }