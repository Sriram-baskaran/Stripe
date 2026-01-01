import java.util.*;

public class BraceE{
    public String[]expand(String s){
        List<List<Character>> positions = new ArrayList<>();

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='{'){
                List<Character> group = new ArrayList<>();
                i++;

                while(s.charAt(i)!='}'){
                    if(s.charAt(i)==','){
                        group.add(s.charAt(i));
                    }
                    i++
                }
                Collections.sort(group);

                positions.add(group);
                i++;


            }
        }

    }
    
}