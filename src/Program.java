import java.util.ArrayList;

public class Program {
    public static void flippingLine(String line) {
        String newLine = "";
        for (int i = line.length() - 1; i >= 0; i--) {
            newLine += line.charAt(i);
        }
        System.out.println("1. Переворачивание строки = " + newLine);
    }

    public static void invertingTheCharacterSequence(String line) {
        String[] arr = line.split(" ");
        String newLine = "";
        for (String a : arr) {
            String reverseWord = "";
            for (int i = a.length() - 1; i >= 0; i--) {
                reverseWord += a.charAt(i);
            }
            newLine += reverseWord + " ";
        }
        System.out.println("2. Переворачивание последовательности символов = "
                + newLine.trim());
    }

    public static void twoVariables(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.printf("3. Поменять местами значения, используя две переменные: a = %d b = %d\n", a, b);
    }

    public static void numberOfDuplicates(String line) {
        line = line.toLowerCase();
        String[] arr = line.split(" ");
        ArrayList<String> newArr = new ArrayList<>();
        int count = 0;

        for (String a : arr) {
            if (newArr.contains(a)) {
                count++;
            } else {
                newArr.add(a);
            }
        }
        System.out.println("4. Кол-во дубликатов = " + count);
    }
}