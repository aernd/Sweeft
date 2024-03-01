import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        //testEvaluateExpression();
        //testReverseLinkedList();
        //testHappyString();
        //testIntersection();
        //testValidSequence();
        //testLongSubarraySolver();

    }

    private static void testLongSubarraySolver() {
        LongSubarraySolver s = new LongSubarraySolver();
        int[] array= {6,2,2,3,4,1};
        int k = 8;
        System.out.println(s.lenOfLongSubarr(array, k));

        array= new int[]{5, 2, 3, 10};
        k = 10;
        System.out.println(s.lenOfLongSubarr(array, k));

        array= new int[]{5, 2, 3, 10};
        k = 1;
        System.out.println(s.lenOfLongSubarr(array, k));
    }

    private static void testValidSequence() {
        ValidSequenceSolver solver = new ValidSequenceSolver();
        int[] array = {5,1,22,25,6,-1,8,10};
        int[] sequence = {1,6,-1,10};
        System.out.println(solver.isValidSequence(array, sequence));
        array = new int[]{5, 1, 22, 25, 6, -1, 8, 10};
        sequence = new int[]{};
        System.out.println(solver.isValidSequence(array, sequence));
        array = new int[]{};
        sequence = new int[]{5, 1, 22, 25, 6, -1, 8, 10};
        System.out.println(solver.isValidSequence(array, sequence));
        array = new int[]{};
        sequence = new int[]{};
        System.out.println(solver.isValidSequence(array, sequence));
        array = new int[]{5};
        sequence = new int[]{5, 1};
        System.out.println(solver.isValidSequence(array, sequence));
        array = new int[]{5};
        sequence = new int[]{5};
        System.out.println(solver.isValidSequence(array, sequence));
        array = new int[]{};
        System.out.println(solver.isValidSequence(array, null));
        sequence = new int[]{};
        System.out.println(solver.isValidSequence(null, sequence));
        array = new int[]{5};
        System.out.println(solver.isValidSequence(array, null));
        sequence = new int[]{5};
        System.out.println(solver.isValidSequence(null, sequence));
    }

    private static void testIntersection() {
        IntersectionSolver solver = new IntersectionSolver();
        int[] nums1 = {1,2,3,3,4,5};
        int[] nums2 = {3,4,4,5,6,7};
        System.out.println(Arrays.toString(solver.findIntersection(nums1, nums2)));
        nums1 = new int[]{};
        nums2 = new int[]{3, 4, 4, 5, 6, 7};
        System.out.println(Arrays.toString(solver.findIntersection(nums1, nums2)));
        nums1 = new int[]{3, 4, 4, 5, 6, 7};
        nums2 = new int[]{};
        System.out.println(Arrays.toString(solver.findIntersection(nums1, nums2)));
        nums2 = new int[]{3, 4, 4, 5, 6, 7};
        System.out.println(Arrays.toString(solver.findIntersection(null, nums2)));
    }

    private static void testHappyString() {
        HappyStringSolver solver = new HappyStringSolver();
        List<String> l = Arrays.asList("abbcc", "abc", "abcabc", "cabcbb");
        System.out.println(solver.numberOfHappyStrings(l));
        l = Arrays.asList("");
        System.out.println(solver.numberOfHappyStrings(l));
        l = new ArrayList<>();
        System.out.println(solver.numberOfHappyStrings(l));
        l = null;
        System.out.println(solver.numberOfHappyStrings(l));
        l = Arrays.asList("abbc", null);
        System.out.println(solver.numberOfHappyStrings(l));
        try{
            l = Arrays.asList("abb","abxc");
            System.out.println(solver.numberOfHappyStrings(l));
        } catch (IllegalArgumentException e){
            System.out.println("Illegal argument Exception");
        }
    }

    private static void testEvaluateExpression() {
        ExpressionSolver solver = new ExpressionSolver();
        System.out.println(solver.evaluateExpression("5+20-8+5"));
        System.out.println(solver.evaluateExpression("-7+127-9999"));
        System.out.println(solver.evaluateExpression(""));
        System.out.println("78");
        System.out.println(solver.evaluateExpression(null));
        try{
            System.out.println(solver.evaluateExpression("5++20-8+5"));
        } catch (IllegalArgumentException e){
            System.out.println("Illegal argument Exception");
        }
        try{
            System.out.println(solver.evaluateExpression("15+"));
        } catch (IllegalArgumentException e){
            System.out.println("Illegal argument Exception");
        }
    }

    private static void testReverseLinkedList() {
        ReverseListSolver solver = new ReverseListSolver();

        ListNode head = ListNode.linkedListFromArray(new int[]{1, 2, 3, 4, 5, 6});
        head = solver.reverseList(head);
        printLinkedList(head);

        head = ListNode.linkedListFromArray(new int[]{});
        head = solver.reverseList(head);
        printLinkedList(head);

        head = ListNode.linkedListFromArray(new int[]{999});
        head = solver.reverseList(head);
        printLinkedList(head);
    }

    private static void printLinkedList(ListNode head){
        while(head!=null){
            System.out.print(head.getValue() + " ");
            head = head.getNext();
        }
        System.out.println();
    }
}