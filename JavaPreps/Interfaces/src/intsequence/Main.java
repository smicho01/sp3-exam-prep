package intsequence;

public class Main {

    public static void main(String[] args) {

        SquareSequence squareSequence = new SquareSequence();
        double avg = average(squareSequence, 100);
        System.out.println("Avg of first 100 ints : " + avg);

    }

    public static double average(IntSequence seq, int limit) {
        int count = 0;
        double sum = 0;
        while(seq.hasNext() && count < limit) {
            count ++;
            sum += seq.next();
        }
        return count == 0 ? 0 : sum/count;
    }
}
