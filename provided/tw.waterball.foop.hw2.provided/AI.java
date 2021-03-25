package tw.waterball.foop.hw2.provided;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * AI-made decisions.
 * @author - johnny850807@gmail.com (Waterball)
 */
public class AI {
    public int selectAction(List<Integer> availableActionIndices) {
        return availableActionIndices.get(FixedRandom.nextInt(availableActionIndices.size()));
    }

    public List<Integer> selectTarget(int targetCandidatesCount, int headCount) {
        List<Integer> indices = new ArrayList<>();
        for (int i = 0; i < targetCandidatesCount; i++) {
            indices.add(i);
        }

        // shuffle
        for (int i = 0; i < indices.size(); i++) {
            Collections.swap(indices, i, FixedRandom.nextInt(indices.size()));
        }
        return indices.subList(0, headCount);
    }
}
