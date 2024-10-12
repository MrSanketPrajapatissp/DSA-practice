
import java.util.*;

class ArrayReference {

    public static void update(int marks[], int changeable) {
        for (int i = 0; i < marks.length; i++) {
            marks[i] = marks[i] + 1;

        }
        changeable = 10;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks[] = new int[50];

        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();

        int changeable = 5;
        update(marks, changeable);

        for (int i = 0; i < marks.length; i++) {
            System.out.print(" " + marks[i]);
        }

        System.out.println();
        System.out.println("Not change variable: because it is not by reference: " + changeable);

    }
}