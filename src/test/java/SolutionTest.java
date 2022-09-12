import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
  final private Solution sol = new Solution();
  @Test
  void maxDepthExample1() {
    assertEquals(3, sol.maxDepth(sol.createBinaryTree(new String[]{
        "3", "9", "20", "null", "null", "15", "7"
    })));
  }
  @Test
  void maxDepthExample2() {
    assertEquals(2, sol.maxDepth(sol.createBinaryTree(new String[]{
        "1", "null", "2"
    })));
  }
}