import java.util.Scanner;

public class Main1 {

    public static void main(String[] args) {

        // nested loop = A loop  inside another loop
        //               Used often with matrices or DS&A

        Scanner scanner = new Scanner(System.in);

        int rows;
        int columns;
        char symbol;

        System.out.print("Enter the # of rows: ");
        rows = scanner.nextInt();

        System.out.print("Enter the # of columns: ");
        columns = scanner.nextInt();

        System.out.print("Enter the symbol to use: ");
        symbol = scanner.next().charAt(0);

        for(int i = 0; i < rows; i++) { // outer for loop is the rows
            for(int j = 0; j < columns; j++) { // inner for loop is the columns
                System.out.print(symbol);
            }
            System.out.println(); // skip next line
        }

        scanner.close();

    }
}
