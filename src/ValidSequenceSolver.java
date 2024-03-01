public class ValidSequenceSolver {
    boolean isValidSequence(int[] array, int[] sequence){
        if (array == null) return sequence == null || sequence.length == 0;
        if (sequence == null) return true;
        if (array.length == 0) return sequence.length == 0;
        int i = 0;
        for (int num : sequence) {
            while(array[i] != num){
                i++;
                if (i >= array.length){
                    return false;
                }
            }
        }
        return true;
    }
}
