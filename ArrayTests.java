import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
  @Test
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    assertArrayEquals(new int[]{ 3 }, ArrayExamples.reverseInPlace(input1)); // Case 1 item
	}
  
  @Test
	public void testReverseInPlace2() {
    int[] input2 = { 3 };
    assertArrayEquals(new int[] { }, ArrayExamples.reverseInPlace(input2)); //Edge case Empty
  }

  @Test
	public void testReverseInPlace3() {
    int[] input3 = { 1, 3 };
    assertArrayEquals(new int[]{ 3, 1 }, ArrayExamples.reverseInPlace(input3)); //Even case
  }

  @Test
	public void testReverseInPlace4() {
    int[] input4 = {4, 3, 1};
    assertArrayEquals(new int[]{1, 3, 4}, ArrayExamples.reverseInPlace(input4)); //Odd case
  }

  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1)); 
  }
  @Test
  public void testReversed2() {
    int[] input2 = { 3 };
    assertArrayEquals(new int[]{ 3 }, ArrayExamples.reverse(input2)); // Case 1 item
  }

  @Test
  public void testReversed3() {
    int[] input3 = { 1, 3 };
    assertArrayEquals(new int[]{ 3, 1 }, ArrayExamples.reverse(input3)); //Even case
  }

  @Test
  public void testReversed4() {
    int[] input4 = {4, 3, 1};
    assertArrayEquals(new int[]{1, 3, 4}, ArrayExamples.reverse(input4)); //Odd case
  }
}
