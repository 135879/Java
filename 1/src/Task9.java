public class Task9 {
    public static boolean isPrefix(String word, String pre){
        if(word.startsWith(pre.substring(0,pre.length()-2)))
            return true;
        return false;
    }
    public static boolean isSuffix(String word, String suf){
        if(word.endsWith(suf.substring(1)))
            return true;
        return false;
    }
}
