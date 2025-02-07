public class ShortestPath {
    public static float getShortestPath(String s) {
        int x = 0, y = 0;
        for (int i = 0; i < s.length(); i++) {
            char dir = s.charAt(i);
            if (dir == 'N') { // North
                y++;
            } else if (dir == 'S') { // South
                y--;
            } else if (dir == 'E') { // East
                x++;
            } else if (dir == 'W') { // West
                x--;
            } else {
                break;
            }
        }

        return (float) Math.sqrt((x * x) + (y * y));
    }

    public static void main(String args[]) {
        String s = "WNEENESENNN";
        System.out.println(getShortestPath(s));
    }
}
