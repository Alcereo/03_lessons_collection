package lessons_04_generics_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MathBox extends ObjectBox {


//    private List list = new ArrayList();


    public MathBox(int[] arr) {
        super(arr);

    }

//    public List<Integer> getList() {
//        return this.list;
//    }

//    public int summator(){
//
//        int sum = 0;
//
//        for(int i = 0; i < this.list.size(); i++) {
//            sum = sum + this.list.get(i);
//        }
//
//        return sum;
//    }
//
//    public List<Integer> splitter(int del){
//
//        List<Integer> listSplit = new ArrayList<Integer>();
//
//        for(int i = 0; i<this.list.size(); i++) {
//            listSplit.add(this.list.get(i) / del);
//        }
//
//        return listSplit;
//
//    }

//    public void delElement(int el){
//
//        for(int i = 0; i<this.list.size(); i++) {
//
//            if(this.list.get(i) == el){
//                this.list.remove(i);
//                i = i - 1;
//            }
//
//        }
//    }

//
//    @Override
//    public String toString() {
//        return "MathBox{" +
//                "list=" + list +
//                '}';
//    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        MathBox mathBox = (MathBox) o;
//        return Objects.equals(list, mathBox.list);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(list);
//    }
}
