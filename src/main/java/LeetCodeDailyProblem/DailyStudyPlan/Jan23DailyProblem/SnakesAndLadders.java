package LeetCodeDailyProblem.DailyStudyPlan.Jan23DailyProblem;

public class SnakesAndLadders {
    public static void main(String[] args) {
        int[][] board = {{-1,-1,-1,-1,-1,-1},
                {-1,-1,-1,-1,-1,-1},
                {-1,-1,-1,-1,-1,-1},
                {-1,35,-1,-1,13,-1},
                {-1,-1,-1,-1,-1,-1},
                {-1,15,-1,-1,-1,-1}};
        System.out.println(snakesAndLadders(board));
    }

    private static int snakesAndLadders(int[][] board) {
        int n = board.length;
        int[] arr = new int[n*n];
        int index = 0;
        boolean isEven = true;
        for(int i = n-1;i>=0;i--){
            if(isEven){
                for(int j = 0;j<n;j++){
                    arr[index++] = board[i][j];
                }
            }else{
                for(int j = n-1;j>=0;j--){
                    arr[index++] = board[i][j];
                }
            }
            isEven = !isEven;
        }
        int[] visited = new int[n*n];
        return bfs(arr,visited);
    }

    private static int bfs(int[] arr, int[] visited) {
        int[] queue = new int[arr.length];
        int front = 0;
        int rear = 0;
        queue[rear++] = 0;
        visited[0] = 1;
        int count = 0;
        while(front<rear){
            int size = rear-front;
            for(int i = 0;i<size;i++){
                int curr = queue[front++];
                if(curr==arr.length-1) return count;
                for(int j = 1;j<=6;j++){
                    int next = curr+j;
                    if(next>=arr.length) break;
                    if(arr[next]!=-1) next = arr[next]-1;
                    if(visited[next]==0){
                        visited[next] = 1;
                        queue[rear++] = next;
                    }
                }
            }
            count++;
        }
        return -1;
    }
}
