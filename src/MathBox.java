import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class MathBox{

    private List<Integer> list = new ArrayList<Integer>();

    public MathBox(int arr[]) {

        for(int i = 0; i < arr.length; i++){
            this.list.add(arr[i]);
        }

        QuickSort quickSort = new QuickSort();
        this.list = quickSort.quickSort(this.list, 0, this.list.size()-1);

    }

    public int summator(){

        int sum = 0;

        for(int i = 0; i < this.list.size(); i++) {
            sum = sum + this.list.get(i);
        }

        return sum;
    }

    public List<Integer> splitter(int del){

        List<Integer> listSplit = new ArrayList<Integer>();

        for(int i = 0; i<this.list.size(); i++) {
            listSplit.add(this.list.get(i) / del);
        }

        return listSplit;

    }

    public void delElement(int el){

        for(int i = 0; i<this.list.size(); i++) {

            if(this.list.get(i) == el){
                this.list.remove(i);
                i = i - 1;
            }

        }
    }

    @Override
    public String toString() {
        return "MathBox{" +
                "list=" + list +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MathBox mathBox = (MathBox) o;
        return Objects.equals(list, mathBox.list);
    }

    @Override
    public int hashCode() {
        return Objects.hash(list);
    }
}
