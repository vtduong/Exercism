import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
class Matrix {
    private ArrayList<ArrayList<Integer>> array = null;
    

    Matrix(String matrixAsString) {
       

        //construct a 2-d list
        array = new ArrayList<ArrayList<Integer>>();
        Scanner text = new Scanner(matrixAsString);
        int i = 0;
        while(text.hasNextLine()) {
            array.add(new ArrayList<Integer>());
            Scanner scan = new Scanner(text.nextLine());
            while (scan.hasNextInt()) {
                array.get(i).add(scan.nextInt());
            }
            i++;
            
        }

    }

    int[] getRow(int rowNumber) {
        int[] row = new int[array.get(rowNumber).size()];
        for(int i = 0; i < array.get(rowNumber).size(); i++){
            row[i] = array.get(rowNumber).get(i);
        }
        return row;
    }

    int[] getColumn(int columnNumber) {
        int[] col = new int[array.size()];
        for(int i = 0; i < array.size(); i++){
            col[i] = array.get(i).get(columnNumber);
        }
        return col;
    }

    int getRowsCount() {
        return array.size();
    }

    int getColumnsCount() {
        return array.get(0).size();
    }
}
