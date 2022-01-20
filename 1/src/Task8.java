public class Task8 {
    public static boolean isStrangePair(String str1, String snd){
        if (str1.isEmpty() && snd.isEmpty()) {
            return true;
        }
        return str1.charAt(0) == snd.charAt(snd.length() - 1) && str1.charAt(str1.length() - 1) == snd.charAt(0);
    }
}
