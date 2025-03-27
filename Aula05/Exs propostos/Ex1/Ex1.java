public class Ex1 {
    public static void main(String[] args) {
        
    }

    public static void insertionSort(int[] values) {
        for (int i = 1; i < values.length; i++) { 
            
            int j = i;
        
            while (j > 0 && values[j] < values[j-1]) {
                int aux = values[j];
                values[j] = values[j - 1];
                values[j - 1] = aux;
                j -= 1;
            }
        
        }	
    }
}

//https://joaoarthurbm.github.io/eda/posts/insertion-sort/

