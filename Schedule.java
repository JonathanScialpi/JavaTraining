public class Schedule {

    // Multi-dimensional array to show Subject in one column and Teacher name in the other
    public static void main(String[] args) {
        String school [][] = new String [8][2];

        school [0][0] = "| 1 |                           English III";   school [0][1] = " |             Ms. Lapan |"+"\r\n";
        school [1][0] = "| 2 |                          PreCcalculus";   school [1][1] = " |           Mrs. Gideon |"+"\r\n";
        school [2][0] = "| 3 |                          Music Theory";   school [2][1] = " |             Mr. Davis |"+"\r\n";
        school [3][0] = "| 4 |                          Biotechnoloy";   school [3][1] = " |            Ms. Palmer |"+"\r\n";
        school [4][0] = "| 5 |              Principles of Technology";   school [4][1] = " |            Ms. Garcia |"+"\r\n";
        school [5][0] = "| 6 |                              Latin II";   school [5][1] = " |          Mrs. Barnett |"+"\r\n";
        school [6][0] = "| 7 |                         AP US History";   school [6][1] = " |       Ms. Johannessen |"+"\r\n";
        school [7][0] = "| 8 | Business Computer Information Systems";   school [7][1] = " |             Mr. James |"+"\r\n";

        int rows = 8;
        int columns = 2;
        
        printBorder();
        // nested for loop to print out the contents of the school array
        for (int i=0;i<rows;i++){
            for (int j=0;j<columns;j++){
                System.out.print(school[i][j]);
            }
        }
        printBorder();

    }
    // static class to print the '-', '+' border
    public static void printBorder() {

        for (int i = 0; i < 69; i++) {
            if (i == 0) {
                System.out.print("+");
            } else if (i == 68) {
                System.out.println("+");
            } else {
                System.out.print('-');
            }
        }
    }
}
