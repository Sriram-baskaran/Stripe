import java.util.*;
public class StringBraces {
    public static List<String> expand(String input){
        List<String> result = new ArrayList<>();

        int open=input.indexOf('{');
        int close=input.indexOf('}');

        if(open == -1||close== -1||open>close){
            result.add(input);
            return result;
        }

        String inside = input.substring(open+1,close);
        String []tokens= inside.split(",");

        if(tokens.length<2){
            result.add(input);
            return result;
        }
        String prefix = input.substring(0,open);
        String suffix = input.substring(close+1);
        
        for(String token:tokens){
            result.add(prefix+token+suffix);
        }
        return result;
    }
    
}
