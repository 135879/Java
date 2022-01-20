public class Task1 {
    public static void repeat(String text, int n)
    {
        StringBuilder repeats = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            for (int j = 0; j < n; j++) {
                repeats.append(text.charAt(i));
            }
        }
        System.out.println(repeats);
    }
}
