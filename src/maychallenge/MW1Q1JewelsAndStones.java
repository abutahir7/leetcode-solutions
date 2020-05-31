package maychallenge;

import java.util.Collections;
import java.util.LinkedHashSet;

public class MW1Q1JewelsAndStones {
    public int solution(String J, String S){
        LinkedHashSet<String> JSet = new LinkedHashSet<String>();
        String[] Jstring = J.split("");
        String[] Sstring = S.split("");
        Collections.addAll(JSet, Jstring);
        int output = 0;
        for (String s:Sstring){
            if( JSet.contains(s)){
                output++;
            }
        }
        return output;
    }
}
