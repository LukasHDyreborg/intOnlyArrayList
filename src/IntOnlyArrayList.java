import java.util.Arrays;

public class IntOnlyArrayList {

    private int[] array;

    public IntOnlyArrayList() {
        array = new int[0];
    }

    public int get(int i) {
        return array[i];
    }

    public void add(int value) {
        int length = getArray().length;
        int[] newArray = new int[length + 1];
        for (int i = 0; i < getArray().length; i++) {
            newArray[i] = array[i];
        }
        setArray(newArray);
        array[length] = value;
    }

    public void add(int index, int value) {
        try {
            int length = getArray().length;
            int[] newArray = new int[length + 1];

            for (int i = 0; i < newArray.length; i++) {
                if (i < index) {
                    newArray[i] = array[i];
                } else if (i == index){
                    newArray[i] = value;
                } else if (i > index) {
                    newArray[i] = array[i-1];
                }
            }

            setArray(newArray);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("The given index is outside of the array!");
        }
    }

    public int size() {
        return getArray().length;
    }

    public void remove(int index) {
        try {
            int length = size() - 1;
            int[] newArray = new int[length];
            for (int i = 0; i <= length; i++) {
                if (i < index) {
                    newArray[i] = array[i];
                } else if (i == index){

                } else if (i > index) {
                    newArray[i-1] = array[i];
                }
            }
            setArray(newArray);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("The given index is outside of the array!");
        }

    }

    public void clear() {
        int[] newArray = new int[0];
        setArray(newArray);
    }

    @Override
    public String toString() {
        return "IntOnlyArrayList{" +
                "array=" + Arrays.toString(array) +
                '}';
    }

    private int[] getArray() {
        return array;
    }

    private void setArray(int[] array) {
        this.array = array;
    }
}
