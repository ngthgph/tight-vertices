import java.util.Arrays;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        int n = 13;

        Integer[] ke1 = {2, 3, 4};
        Integer[] ke5 = {3, 6, 7, 8, 12};
        Integer[] ke9 = {10, 11, 13};
        Integer[] ke2 = {1, 3, 4, 6};
        Integer[] ke6 = {2, 5, 7, 12};
        Integer[] ke10 = {9, 11, 12, 13};
        Integer[] ke3 = {1, 2, 4, 5};
        Integer[] ke7 = {4, 5, 6, 8};
        Integer[] ke11 = {9, 10, 13};
        Integer[] ke4 = {1, 2, 3, 7};
        Integer[] ke8 = {5, 7, 12};
        Integer[] ke12 = {5, 6, 8, 10};
        Integer[] ke13 = {9, 10, 11};

        LinkedList<Integer> [] data = new LinkedList[n+1];

        data[1] = new LinkedList<>(Arrays.asList(ke1));
        data[2] = new LinkedList<>(Arrays.asList(ke2));
        data[3] = new LinkedList<>(Arrays.asList(ke3));
        data[4] = new LinkedList<>(Arrays.asList(ke4));
        data[5] = new LinkedList<>(Arrays.asList(ke5));
        data[6] = new LinkedList<>(Arrays.asList(ke6));
        data[7] = new LinkedList<>(Arrays.asList(ke7));
        data[8] = new LinkedList<>(Arrays.asList(ke8));
        data[9] = new LinkedList<>(Arrays.asList(ke9));
        data[10] = new LinkedList<>(Arrays.asList(ke10));
        data[11] = new LinkedList<>(Arrays.asList(ke11));
        data[12] = new LinkedList<>(Arrays.asList(ke12));
        data[13] = new LinkedList<>(Arrays.asList(ke13));

        Graph g = new Graph();
        g.setData(data);

        g.dfs(1,13);
    }
}