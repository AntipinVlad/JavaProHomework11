public class Main {
    public static void main(String[] args) {
        ArrayValueCalculator valueCalculator = new ArrayValueCalculator();
        String[][] array = {{"1", "2", "3", "4"}, {"5", "6", "7", "8"}, {"9", "10", "11", "12"}, {"13", "14", "15", "16"}};

        try {
            System.out.println("Total amount: " + valueCalculator.doCalc(array));
        } catch (ArraySizeException e) {
            System.out.printf("Wrong array size: %s", e.getMessage());
        } catch (ArrayDataException e) {
            System.out.printf("%s: %s on position %d:%d", e.getMessage(), e.getCause().getMessage(), e.getRowIndex(), e.getColIndex());
        }
    }
}