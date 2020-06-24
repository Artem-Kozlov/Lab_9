public class WordCounterClient {
    public static void main(String[] args) {
        String[] temp = {
                "wordl",
                "dobda",
                "rbrba",
                "oobda",
                "walap",
        };
        char[][] array = new char[temp.length][temp[0].length()];
        for (int i = 0; i < temp.length; i++) {
            char[] cs = temp[i].toCharArray();
            for (int j = 0; j < temp[i].length(); j++) {
                array[i][j] = cs[j];
            }
        }
        String word = "word";
        printMatrix(array);
        System.out.println("Количество вхождений слова " + word + ":");
        System.out.println(WordCounter.count(array, word));
    }

    private static void printMatrix(char[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
