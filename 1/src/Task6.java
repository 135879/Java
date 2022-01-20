public class Task6 {
    public static int Fibonacci (int n) {
        switch (n){
            case 0: return 0;
            case 1: return 1;
            case 2: return 2;
            default: {
                int cur=2,
                        prev=1;
                for (int i = 3; i <= n; i++) {
                    cur += prev;
                    prev = cur - prev;
                }
                return cur;
            }
        }
    }
}
