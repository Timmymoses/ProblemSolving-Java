package LevelOne;

public class OccurenceLettersInMississipi {
    public static void main(String[] args) {
        String str = "Mississippi";
        int sCount = 0;
        int iCount = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 's') {
                sCount++;
            } else if (str.charAt(i) == 'i') {
                iCount++;
            }
        }

        System.out.println("Number of occurrences of 's' is " + sCount);
        System.out.println("Number of occurrences of 'i' is " + iCount);
    }
}