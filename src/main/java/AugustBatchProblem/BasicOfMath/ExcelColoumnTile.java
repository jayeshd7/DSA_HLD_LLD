package AugustBatchProblem.BasicOfMath;

public class ExcelColoumnTile {
    public static void main(String[] args) {
        System.out.println(solve(123));
    }

            //12 % 26 = 12

    //64 +1  - 65 // A



    private static String solve(int a) {

        int inputValue = a;
        StringBuilder columnTitle = new StringBuilder();
        while(inputValue > 0){
            int reminder = (inputValue%26);
            int digit = reminder + 64;
            if (reminder == 0){
                digit = 26 + 64;
                inputValue = (inputValue/26)-1;
            }else{
                inputValue = inputValue/26;
            }
            columnTitle.append(Character.toString((char)digit));
        }
        return columnTitle.reverse().toString().trim();
    }
}
