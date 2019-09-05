public class NestedForLoops {
    static final int MAX =9;
    public static void main(String[]args){
//        int row, column;
//
//        for(row = 1; row <= MAX; row++){
//            for(column = 1; column <= MAX; column++){
//                System.out.println(row * column + "\t");
//            }
//            System.out.println();
//        }

        for(int i = 1; i <= MAX; i++){
            for(int j = 1; j <= (MAX - i); j++){
                System.out.println(" ");
            }
            for(int k = 1; k <= i; k++){
                System.out.println(i);
            }
            System.out.println();
        }
    }
}
