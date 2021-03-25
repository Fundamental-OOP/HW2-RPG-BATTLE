package tw.waterball.foop.hw2.provided;

/**
 * Your AI entities must use this class to make every choice.
 * Otherwise you won't get the same output as our test case's.
 */
final class FixedRandom {
    private final static long SEED = 2021;
    private final static java.util.Random random = new java.util.Random(SEED);

    public static int nextInt(int bound) {
        return random.nextInt(bound);
    }

    public static boolean nextBoolean() {
        return random.nextBoolean();
    }
}
