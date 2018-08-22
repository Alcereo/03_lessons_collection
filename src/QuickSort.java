import java.util.List;

public class QuickSort {

    public List<Integer> quickSort(List<Integer> list, int left, int right) {

        int index = partition( list, left, right);
        if (left < index - 1)
            quickSort(list, left, index - 1);
        if (index < right)
            quickSort(list, index, right);

//            System.out.println(Arrays.toString(arr));

        return list;
    }

    int partition(List<Integer> list, int left, int right)
    {
        int i = left, j = right;
        int tmp;
        int pivot = list.get((left + right) / 2);

        while (i <= j) {
            while (list.get(i) < pivot)
                i++;
            while (list.get(j) > pivot)
                j--;

            if (i <= j) {
                tmp = list.get(i);
                list.set(i, list.get(j));
                list.set(j, tmp);
                i++;
                j--;
            }
        }

        return i;
    }

}
