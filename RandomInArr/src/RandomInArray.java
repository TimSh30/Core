import java.util.Date;


public class RandomInArray {
    public static void main(String[] args) throws InterruptedException {
        int [][] arr = new int[10][10];
        RandomInArray rna = new RandomInArray();
        rna.fillMass(arr);
        rna.printMass(arr);
        System.out.println("min = " + rna.findMinInArray(arr));
        System.out.println("min = " + rna.findMaxInArray(arr));
        System.out.println("middleInArray = " + rna.findMaxInArray(arr) / rna.findMinInArray(arr));

    }

    int findMinInArray(int[][] mass) {
        int minInArray = 0;
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass.length; j++) {
                if (minInArray > mass[i][j]) {
                    minInArray = mass[i][j];
                }
            }
        }
        return minInArray;
    }

    int findMaxInArray(int[][] mass) {
        int maxInArray = 0;
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass.length; j++) {
                if (maxInArray < mass[i][j]) {
                    maxInArray = mass[i][j];
                }
            }
        }
        return maxInArray;
    }

    void printMass(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
                if (j == arr.length - 1) {
                    System.out.println("\n");
                }
            }
        }
    }

    int[][] fillMass(int[][] mass) throws InterruptedException {
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass.length; j++) {
                mass[i][j] = generatorArr();
                Thread.sleep(15);
            }
        }
        return mass;

    }

    static int generatorArr() {
        int randomNumber = (int) new Date().getTime() % 1000;
        return randomNumber % 2 == 0 ? randomNumber * -1 : randomNumber;
    }
}
