public class Task10 {
    public static int boxSeq(int step){
        int counter = 0;
        for (int i = 1; i <= step; i++) {
            if(i % 2 == 1)
                counter+=3;
            else counter--;
        }
        return counter;
    }
}
