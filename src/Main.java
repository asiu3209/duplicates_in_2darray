public class Main {
    public static void main(String[] args){
        int[][] temp = {{3,3,3,3},{3,4,4,4},{5,5,5,5}};
        System.out.println(isDuplicates(temp));

    }
    public static boolean isDuplicates(int[][] arr){
        for (int i = 0; i < arr[0].length;i++){
            for (int k= 0; k<arr.length;k++){
                for (int p = 0; p<arr.length;p++){
                    int temp = arr[k][i];
                    if (temp == arr[p][i] && k != p){
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
//i is for each column
//k is for each item
//p is for each item r

//3 3 3 3 3
//4 4 4 4 4
//5 5 5 5 5
//6 6 6 6 6
