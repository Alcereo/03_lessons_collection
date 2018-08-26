package lessons_04_generics_2;

import java.util.ArrayList;
import java.util.List;

public class ObjectBox {

    private List<Object> list = new ArrayList<Object>();

    public ObjectBox(int[] arr) {
        for(int i = 0; i < arr.length; i++){
            this.list.add(arr[i]);
        }

//        QuickSort quickSort = new QuickSort();
//        this.list = quickSort.quickSort(this.list, 0, this.list.size()-1);


    }

    public void addObject(Object obj) {
            this.list.add(obj);
    }

    public void dump(){
        System.out.println(this.list.toString());
    }

    public String deleteObject(Object obj) {

        for(Object o: this.list){
            if(o == obj){
                return "Такой элемент есть в коллекции";
            }
        }
        return "Такого элемента нет в коллекции";

    }

    public int summator() throws NotNumberExeption {

        int sum = 0;

        for (Object o:this.list) {
            if (o instanceof Number) {
                sum = sum + (int) o;
            } else {
                throw new NotNumberExeption("В коллекции есть нечисловой объект");
            }
        }

        return sum;
    }

    public List<Object> splitter(Integer del) throws NotNumberExeption {

        List<Object> listSplit = new ArrayList<Object>();

        if(del instanceof Number && del !=0) {

            for (Object obj: list){
                if (obj instanceof Number) {
                    listSplit.add((int) obj / del);
                } else {
                    throw new NotNumberExeption("В коллекции есть нечисловой объект");
                }
            }
        }else{
            throw new NotNumberExeption("Вы ввели недопустимое значение");
        }

        return listSplit;

    }


}
