public class MulTable {
    final static int rows = 10; 
    final static int columns = 20;
    
    public static void main(String a[]) {
        int product[][] = new int[rows][columns];
        int i, j;
        System.out.println("Multiplication table");
        System.out.println("");
        
        for (i = 0; i < rows; i++) { 
            for (j = 0; j < columns; j++) { 
                product[i][j] = (i + 1) * (j + 1); 
                System.out.print(" " + product[i][j]); 
            }
            System.out.println(""); 
        }
    }
}
