public class Main {

    public static void main(String[] args) {

        GenerateArray generateArray = new GenerateArray();
        int[] arr = generateArray.GenerateArray(10);
        MathBox mathBox = new MathBox(arr);

        System.out.println(mathBox.summator());

    }
}
