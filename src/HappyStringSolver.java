import java.util.List;

public class HappyStringSolver {
    int numberOfHappyStrings(List<String> strings){
        if (strings == null) return 0;
        int num = 0;
        for (String string : strings) {
            if (string == null) continue;
            num++;
            for (int i = 0; i < string.length() - 1; i++) {
                if (string.charAt(i) != 'a' && string.charAt(i) != 'b' && string.charAt(i) != 'c'){
                    throw new IllegalArgumentException("string can only contain characters a, b, c");
                }
                if (string.charAt(i) == string.charAt(i+1)){
                    num--;
                    break;
                }
            }
        }
        return num;
    }
}
