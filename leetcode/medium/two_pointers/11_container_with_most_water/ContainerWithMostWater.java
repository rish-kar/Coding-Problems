import java.util.*;

public class ContainerWithMostWater {
  public int maxArea(int[] height) {

    // Case 1: Height is null -> Return 0
    if (height == null) return 0;

    // Case 2: Height length is 1 (By passing constraints) -> Return 0
    if (height.length < 2) return 0;

    // Case 3: Usual case
    //         - Two pointer, opposite sides
    //         - Keep computing areas (minimum of both elements * distance between indexes) from left and right
    //         - Keep a track of max area
    //         - Move the pointer with minimum value only
    int left = 0;
    int right = height.length - 1;
    int maxArea = 0;

    while (left < right) {

      int area = Math.min(height[left], height[right]) * (right - left);
      maxArea = Math.max(maxArea, area);

      if (height[right] < height[left]) right--;
      else left++;
    }

    return maxArea;
  }
}
