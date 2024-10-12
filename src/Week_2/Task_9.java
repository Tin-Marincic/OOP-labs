package Week_2;
//Modify the previously created starts piramid in a way that now you are not printing
// the stars but in each row numbers from 1 to the current row count.

public class Task_9 {
    public static void main(String[] args) {
        drawStarsPiramid(10);
    }

    public static void drawStarsPiramid(int rows) {
        for (int i = rows; i >= 0; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
