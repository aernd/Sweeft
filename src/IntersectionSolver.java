import java.util.Arrays;
import java.util.HashSet;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class IntersectionSolver {
    int[] findIntersection(int[] nums1, int[] nums2){
        if (nums1 == null || nums2 == null) return new int[]{};
        HashSet<Integer> s1 = Arrays.stream(nums1)
                                .boxed()
                                .collect(Collectors.toCollection(HashSet::new));
        return Arrays.stream(nums2)
                .distinct()
                .filter(s1::contains)
                .toArray();
    }
}
