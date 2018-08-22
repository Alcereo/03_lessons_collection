import java.util.Random;

public class GenerateArray {

    private int size;

    public int[] GenerateArray(int size) {

        this.size = size;
        int[] array = new int[size];

        for(int i = 0; i <size; i++ ){
            Random random = new Random();
            array[i] = random.nextInt(size*size);
        }

        return array;

    }

}
