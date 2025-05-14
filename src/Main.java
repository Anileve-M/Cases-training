public class Main {
    public static void main(String[] args) {
        String line = "Капибара вышла гулять ! Капибара гулять :)";
        int a = 11, b = 154;
        System.out.printf("Исходная сторока: " + line + "\nИсходные данные: a = %d b = %d\n\n",
                a, b);

        Program.flippingLine(line);
        Program.invertingTheCharacterSequence(line);
        Program.twoVariables(a, b);
        Program.numberOfDuplicates(line);

    }
}