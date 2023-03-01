package LeetCodeDailyProblem.DailyStudyPlan.Feb23DailyProblem;

public class ConstructQuadTree {
    public static void main(String[] args) {
        int[][] grid = {{0, 1}, {1, 0}};
        Node root = constructQuadTree(grid);
        for (boolean b : new boolean[]{root.val, root.isLeaf}) {
            System.out.println(b);
        }
        for (Node node : new Node[]{root.topLeft, root.topRight, root.bottomLeft, root.bottomRight}) {
            for (boolean b : new boolean[]{node.val, node.isLeaf}) {
                System.out.println(b);
            }
        }


    }

    private static Node constructQuadTree(int[][] grid) {

        int startRow = 0;
        int startCol = 0;
        int endRow = grid.length - 1;
        int endCol = grid[0].length - 1;
        return constructQuadTreeSolution(grid, startRow, startCol, endRow, endCol);
    }

    private static Node constructQuadTreeSolution(int[][] grid, int startRow, int startCol, int endRow, int endCol) {
        if (startRow > endRow || startCol > endCol) {
            return null;
        }
        if (startRow == endRow && startCol == endCol) {
            return new Node(grid[startRow][startCol] == 1, true);
        }
        int midRow = startRow + (endRow - startRow) / 2;
        int midCol = startCol + (endCol - startCol) / 2;
        Node topLeft = constructQuadTreeSolution(grid, startRow, startCol, midRow, midCol);
        Node topRight = constructQuadTreeSolution(grid, startRow, midCol + 1, midRow, endCol);
        Node bottomLeft = constructQuadTreeSolution(grid, midRow + 1, startCol, endRow, midCol);
        Node bottomRight = constructQuadTreeSolution(grid, midRow + 1, midCol + 1, endRow, endCol);
        if (topLeft.isLeaf && topRight.isLeaf && bottomLeft.isLeaf && bottomRight.isLeaf && topLeft.val == topRight.val && topRight.val == bottomLeft.val && bottomLeft.val == bottomRight.val) {
            return new Node(topLeft.val, true);
        }
        return new Node(false, false, topLeft, topRight, bottomLeft, bottomRight);
    }


    static class Node {
        public boolean val;
        public boolean isLeaf;
        public Node topLeft;
        public Node topRight;
        public Node bottomLeft;
        public Node bottomRight;


        public Node() {
            this.val = false;
            this.isLeaf = false;
            this.topLeft = null;
            this.topRight = null;
            this.bottomLeft = null;
            this.bottomRight = null;
        }

        public Node(boolean val, boolean isLeaf) {
            this.val = val;
            this.isLeaf = isLeaf;
            this.topLeft = null;
            this.topRight = null;
            this.bottomLeft = null;
            this.bottomRight = null;
        }

        public Node(boolean val, boolean isLeaf, Node topLeft, Node topRight, Node bottomLeft, Node bottomRight) {
            this.val = val;
            this.isLeaf = isLeaf;
            this.topLeft = topLeft;
            this.topRight = topRight;
            this.bottomLeft = bottomLeft;
            this.bottomRight = bottomRight;
        }
    }
}
