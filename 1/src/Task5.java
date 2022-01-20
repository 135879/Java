public class Task5 {
    public static void main(String[] args) {

        getDecimalPlaces(".973");


    }
    public static void getDecimalPlaces(String s){

        String[] result = s.split("\\.");
        System.out.println(result[0].length() + " " + result[1].length());
    }
}
