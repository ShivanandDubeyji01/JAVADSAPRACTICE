import java.util.List;
import java.util.ArrayList;
public class Bracket {
    static List<String> get(int n) {
        List<String> output = new ArrayList<>();
        help(output, "", 0, 0, n);
        return output;
    }
        static void help(List<String> ans, String currentBracket, int o, int c, int max) {

            if(currentBracket.length() == max * 2) {
                ans.add(currentBracket);
                return;
            }
    
            if(o < max) {
                help(ans, currentBracket + "(", o+1, c, max);
            }
            if(c < o) {
                help(ans, currentBracket + ")", o, c+1, max);
            }
        }
    
    public static void main(String[] args) {
        System.out.println(get(3));
    }
    
}
