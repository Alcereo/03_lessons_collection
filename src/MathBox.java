import java.util.ArrayList;
import java.util.List;

public class MathBox{

    public MathBox(int arr[]) {

        List list = new ArrayList<Integer>();

        for(int i = 0; i < arr.length; i++){
            list.add(arr[i]);
        }

        QuickSort quickSort = new QuickSort();
        list = quickSort.quickSort(list, 0, list.size()-1);

    }

    public int summator(){
        return 0;
    }

//    public List<Integer> splitter(){
//        return list;
//    }

}
