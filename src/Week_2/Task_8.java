package Week_2;

public class Task_8 {
    public static void main(String[] args) {
        drawStarsPiramid(10);
    }

    public static void drawStarsPiramid(int rows) {
        for (int i = rows; i >= 0; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
