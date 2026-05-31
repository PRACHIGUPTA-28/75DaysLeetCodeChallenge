class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites){
        List<Integer>[] graph = new ArrayList[numCourses];

        for (int i = 0; i < numCourses; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int[] i : prerequisites) {
            int c = i[0];
            int p = i[1];

            graph[p].add(c);
        }

        int[] arr = new int[numCourses];

        for (int i = 0; i < numCourses; i++) {
            if (!dfs(i, graph, arr)) {
                return false;
            }
        }

        return true;
    }
    private boolean dfs(int node,
                        List<Integer>[] graph,
                        int[] arr) {

        if (arr[node] == 1) {
            return false;
        }if (arr[node] == 2) {
            return true;
        }
        arr[node] = 1; 

        for (int neighbor : graph[node]) {
            if (!dfs(neighbor, graph, arr)) {
                return false;
            }
        }
        arr[node] = 2;
         return true;
    }
}   