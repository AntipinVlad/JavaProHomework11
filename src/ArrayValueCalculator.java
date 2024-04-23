import java.util.Arrays;

public class ArrayValueCalculator {
    private int rowIndex = 0;
    private int colIndex = 0;

    public int doCalc(String[][] array) throws ArraySizeException, ArrayDataException {
        if (array.length != 4 || Arrays.stream(array).anyMatch(row -> row.length != 4)) {
            throw new ArraySizeException("Array size should be 4x4");
        }

        int total = 0;
        try {
            for (rowIndex = 0; rowIndex < array.length; rowIndex++) {
                for (colIndex = 0; colIndex < array[rowIndex].length; colIndex++) {
                    total += Integer.parseInt(array[rowIndex][colIndex]);
                }
            }
        } catch (NumberFormatException e) {
            throw new ArrayDataException("Wrong data format", e, rowIndex, colIndex);
        }
        return total;
    }
}
