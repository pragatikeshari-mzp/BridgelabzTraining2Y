package Linear_BinarySearch;
public class ConcatenationPerfComparison {
    public static void main(String[] args) {
        int iterations = 1000000;

        StringBuffer stringBuffer = new StringBuffer();
        long startTimeBuffer = System.nanoTime();
        for (int i = 0; i < iterations; i++) {
            stringBuffer.append("hello");
        }
        long endTimeBuffer = System.nanoTime();
        long durationBuffer = endTimeBuffer - startTimeBuffer;

        StringBuilder stringBuilder = new StringBuilder();
        long startTimeBuilder = System.nanoTime();
        for (int i = 0; i < iterations; i++) {
            stringBuilder.append("hello");
        }
        long endTimeBuilder = System.nanoTime();
        long durationBuilder = endTimeBuilder - startTimeBuilder;

        System.out.println("Time taken by StringBuffer: " + durationBuffer + " nanoseconds");
        System.out.println("Time taken by StringBuilder: " + durationBuilder + " nanoseconds");
    }
}
