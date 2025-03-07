public class JiuJiuChengFaTable {
    public static void main(String[] args) {
        int rows =9;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " x " + j + " = " + i * j + "\t");
            }
            System.out.println();
        }
    }
}