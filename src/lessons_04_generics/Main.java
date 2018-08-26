package lessons_04_generics;

import java.util.List;

public class Main {

    public static void main(String[] args) throws NotNumberExeption {

    ObjectBox objectBox = new ObjectBox();
    objectBox.addObject(3);
    objectBox.addObject(4);

        try {
            System.out.println("Сумма элементов коллекции = " + objectBox.summator());
        } catch (NotNumberExeption e) {
            System.err.println(e.getMessage());
        }

        try {
            List list = objectBox.splitter(3);
        } catch (NotNumberExeption e) {
            System.err.println(e.getMessage());
        }

    objectBox.deleteObject(3);

        objectBox.dump();
    }
}
