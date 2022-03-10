package activities;

class Activity4 {

    public static void main(String[] args){
        int [] array1 = {9,14,3,2,43,58,22};
        System.out.println("Array before Insertion Sort");
        for (int i:array1)
        {
            System.out.println(i);
        }

        InsertionSort(array1);
        System.out.println("Array after Insertion Sort");

        for (int i:array1)
        {
            System.out.println(i);
        }

    }

    static void InsertionSort(int array[]){
        int n = array.length;
        int j;
        for (j=1;j<n;j++){
            int key = array[j];
            int i = j-1;
            while ((i>-1) && (array [i]>key)){
                array [i+1] = array [i];
                i--;
            }

            array[i+1] = key;
        }
    }
}
