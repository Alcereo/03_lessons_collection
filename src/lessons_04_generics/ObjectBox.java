package lessons_04_generics;

import java.util.ArrayList;
import java.util.List;

public class ObjectBox {

    private List<Object> list = new ArrayList<Object>();


    public void addObject(Object obj) {
            this.list.add(obj);
    }

    public void dump(){
        System.out.println(this.list.toString());
    }

    public void deleteObject(Object obj){
        this.list.remove(this.list.indexOf(obj));
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

        if(del instanceof Integer && del !=0) {

            for(Object o:list){
                if (o instanceof Number) {
                    listSplit.add((int) o / del);
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
