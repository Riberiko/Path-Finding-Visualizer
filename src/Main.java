import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Map map = new Map(3,3);

        Stack<Vertex> path = new Stack<>();
        ArrayList<Vertex> open = new ArrayList<>();
        ArrayList<Vertex> closed = new ArrayList<>();

        System.out.println(Arrays.toString(map.getNeighbors(0,0)));
        System.out.println(map.getVertex(0,0).getNumNeighbors());

    }
}
