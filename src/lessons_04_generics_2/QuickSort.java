package lessons_04_generics_2;

import java.util.List;

public class QuickSort {

    public List<Object> quickSort(List<Object> list, int left, int right) {

        int index = partition( list, left, right);
        if (left < index - 1)
            quickSort(list, left, index - 1);
        if (index < right)
            quickSort(list, index, right);

        return list;
    }

    int partition(List<Object> list, int left, int right)
    {
        int i = left, j = right;
        int tmp;
        int pivot = (int) list.get((left + right) / 2);

        while (i <= j) {
            while ((int)list.get(i) < pivot)
                i++;
            while ((int)list.get(j) > pivot)
                j--;

            if (i <= j) {
                tmp = (int) list.get(i);
                list.set(i, list.get(j));
                list.set(j, tmp);
                i++;
                j--;
            }
        }

        return i;
    }

}
