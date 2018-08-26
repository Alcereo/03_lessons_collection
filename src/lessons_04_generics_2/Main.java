package lessons_04_generics_2;

import java.util.List;

public class Main {

    public static void main(String[] args) throws NotNumberExeption {

        GenerateArray generateArray = new GenerateArray();
        int[] arr = generateArray.GenerateArray(10);
        MathBox mathBox = new MathBox(arr);
        System.out.println();
        System.out.println("---MathBox---");
        mathBox.addObject(5);
        mathBox.dump();

        try{
            System.out.println(mathBox.deleteObject(5));
            System.out.println("Сумма элементов mathBox = " + mathBox.summator());
            System.out.println(mathBox.splitter(1));
        }catch (NotNumberExeption e){
            System.out.println(e.getMessage());
        }

        System.out.println();
        System.out.println("---ObjectBox---");

        ObjectBox objectBox = new ObjectBox(arr);


        objectBox.addObject(5);
        objectBox.dump();

        try{
            System.out.println(objectBox.deleteObject(6));
            System.out.println("Сумма элементов objectBox = " + objectBox.summator());
            System.out.println(objectBox.splitter(1));
        }catch (NotNumberExeption e){
            System.out.println(e.getMessage());
        }




    }
}
