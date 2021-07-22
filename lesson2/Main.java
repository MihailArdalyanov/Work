package lesson2;

public class Main {
    public static int arraySum(String[][] twoDimensionalArray) throws MyArraySizeException, MyArrayDataException {
        if (twoDimensionalArray.length != 4){
            throw new MyArraySizeException("Длина массива не равна 4!");
        }
        for (String[] array : twoDimensionalArray) {
            if (array.length != 4) {
                throw new MyArraySizeException("Высота массива не равна 4!");
            }
        }

        int sum = 0;
        for (int i = 0; i < twoDimensionalArray.length; i++) {
            for (int j = 0; j < twoDimensionalArray[i].length; j++) {
                try {

                    sum += Integer.parseInt(twoDimensionalArray[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Ошибка!" + i + "," + j);
                }

            }
        }
        return sum;

    }

    public static void main(String[] args) {
        String[][] successArray = {{"2", "4", "6", "8"},
                {"2", "4", "6", "8"},
                {"2", "4", "6", "8"},
                {"2", "4", "6", "8"}};
        try {
            System.out.println(arraySum(successArray));
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        } catch (MyArrayDataException e) {
            e.printStackTrace();
        }

        String[][] invalidDataArray = {{"2", "4", "6", "8"},
                {"2", "4", "6", "8"},
                {"2", "4", "6a", "8"},
                {"2", "4", "6", "8"}};
        try {
            System.out.println(arraySum(invalidDataArray));
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        } catch (MyArrayDataException e) {
            e.printStackTrace();
        }

    }



}

