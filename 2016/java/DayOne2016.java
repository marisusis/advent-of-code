import java.util.Scanner;
import java.util.Arrays;

public class DayOne2016 { 
  public static void main(String args[]) {
    
//     Direction facing = Direction.NORTH;
    
    int facing = 0;
    int x = 0;
    int y = 0;
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the directions: ");
    String inputDirections = input.nextLine();
    int[] offset = {0,0,0,0};

    String[] directions = inputDirections.split(", ");
    for (String s : directions) {
//       s = s.substring(1);
      System.out.println(s);
      int val = Integer.parseInt(String.valueOf(s.substring(1)));
      switch (s.charAt(0)) {
        case 'R':
          facing += 1;
          facing %= 4;
          break;
        case 'L':
          facing -= 1;
          if (facing < 0) {
            facing = 3;
          }
          break;
      }
      switch (facing) {
        case 0:
          x += val;
          break;
        case 1:
          y += val;
          break;
        case 2:
          x -= val;
          break;
        case 3:
          y -= val;
          break;
          
      }
    }
    for (int i =0;i<4;i++) {
       System.out.println(Direction.values()[i] +":"+Integer.toString(offset[i]));
    }
          System.out.println(String.valueOf(Math.abs(x)+Math.abs(y)));
  }

}

enum Direction {
  NORTH(0), EAST(1),SOUTH(2), WEST(3);
  
    private final int value;   

    Direction(int value) {
        this.value= value;
    }
}