import java.util.List;

public class Main {

    public static void main(String[] args) {

        GenerateArray generateArray = new GenerateArray();
        int[] arr = generateArray.GenerateArray(10);
        MathBox mathBox = new MathBox(arr);

        System.out.println("Сумма элементов коллекции равна = " + mathBox.summator());
        List<Integer> list = mathBox.splitter(5);

        mathBox.delElement(5);

        System.out.println(mathBox);
    }
}
