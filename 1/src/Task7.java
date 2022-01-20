public class Task7 {
    public static boolean isValid (String str) {
        if(str.length() == 5){
            for (int i = 0; i < str.length(); i++) {
                if(str.charAt(i) > '9' || str.charAt(i) < '0') return false;

            }
            return true;
        }
        return false;
    }
}
