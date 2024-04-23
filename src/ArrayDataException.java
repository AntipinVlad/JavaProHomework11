public class ArrayDataException extends Exception {
    private int rowIndex;
    private int colIndex;

    public ArrayDataException(String message, Throwable cause, int rowIndex, int colIndex) {
        super(message, cause);
        this.rowIndex = rowIndex;
        this.colIndex = colIndex;
    }

    public int getRowIndex() {
        return rowIndex;
    }

    public int getColIndex() {
        return colIndex;
    }
}
