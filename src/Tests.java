import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

class Tests {

  @Test
  void toUpperCase() {
    assertEquals("Hello Tom", JadenCase.toUpperCase("hello tom"));
  }

  @Test
  void highestAndLowest() {
    assertEquals("1, 9", HighestAndLowest.highAndLow("8 4 1 3 9"));
    assertEquals("-1, 9", HighestAndLowest.highAndLow("8 4 1 3 9 -1"));
  }

  @Test
  void rotations() {
    assertTrue(Rotations
        .containAllRots("ahoj", new ArrayList<>(List.of("asdkfj", "aůslkdfj", "sfdkaj", "joha"))));
    assertFalse(Rotations
        .containAllRots("ahj", new ArrayList<>(List.of("asdkfj", "aůslkdfj", "sfdkaj", "joha"))));
  }

  @Test
  void helloMatrix() {
    assertEquals("hello",
        HelloMatrix.hello(new char[][]{{'h', 'p', 'e'}, {'k', 'l', 'a'}, {'l', 'm', 'o'}}));
  }

  @Test
  void getTrickyAvarage() {
    assertEquals(4.5, TrickyAverage.getTrickyAvg(new int[]{3, 4, 5, 6}));
  }

  @Test
  void isSymmetric() {
    assertTrue(SymmetricMatrix.isSymmetric(new int[][]{{5, 0, 1}, {0, 2, 2}, {1, 2, 5}}));
    assertFalse(SymmetricMatrix.isSymmetric(new int[][]{{5, 0, 1}, {2, 2, 2}, {1, 2, 5}}));
  }

  @Test
  void rotation1() {
    assertTrue(RotationOfStringFromStati.isRotation("asder", "redsa"));
    assertFalse(RotationOfStringFromStati.isRotation("ahoj", "ahjo"));
  }

  @Test
  void rotation2() {
    assertTrue(RotationOfStringFromStati.isRotation2("asder", "redsa"));
    assertFalse(RotationOfStringFromStati.isRotation2("ahoj", "ahjo"));
  }

  @Test
  void suffPref() {
    assertEquals(4, StringPrefixAndSuffix.solve("ahojasfdahoj"));
    assertEquals(0, StringPrefixAndSuffix.solve("asdfůjkf"));
  }

  @Test
  void findNextPerfectSquare() {
    assertEquals(144, FindTheNextPerfectSquare.findNextSquare(121));
    assertEquals(-1, FindTheNextPerfectSquare.findNextSquare(114));
  }
}