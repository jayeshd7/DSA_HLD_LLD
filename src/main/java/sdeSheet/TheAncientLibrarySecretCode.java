package sdeSheet;

public class TheAncientLibrarySecretCode {

    public static void main(String[] args) {
        double[] [] keys = {{1.0,0.0,0.0},{0.0,1.0,0.0},{0.0,0.0,1.0}};

        boolean ans = solveTheAncientLibrarySecretCode(keys);
        System.out.println("Is it possible to solve the ancient library secret code: " + ans);
    }

    private static boolean solveTheAncientLibrarySecretCode(double[][] keys) {
        boolean b = false;

        // find the rank of matrix

        int n = keys.length;
        int m = keys[0].length;

        int rank = 0;

        for(int i=0;i<m;i++){
            if(keys[rank][i] != 0){
                for(int j=0;j<n;j++){
                    if(j!=rank){
                        double temp = keys[j][i]/keys[rank][i];
                        for(int k=0;k<m;k++){
                            keys[j][k] -= temp*keys[rank][k];
                        }
                    }
                }
                rank++;
            }
        }
        if(rank == n){
            b = true;
        }

        return b;
    }
}
