package day02;

public class Array2D {

    public static void main(String[] args) {
        // 3 * 3
        int[][] numbers = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // 2 * 3
        // [][]
        // [][][]
        int[][] scores = new int[2][3];
        scores [0][0] = 80;
        scores [0][1] = 75;
        scores [0][2] = 90;
        scores [1][1] = 95;
        scores [1][2] = 100;

        System.out.println(numbers[2][2]);
        System.out.println(scores.length);
    }
    
}
