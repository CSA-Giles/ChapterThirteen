package practice;

public class TestingArrays {

    public static void main(String[] args){

        int[] values = {10, 5, 21, 15};
        int total = 0;

//        values[0] = 10;
//        values[1] = 5;
//        values[2] = 21;
//        values[3] = 16;

        for(int i = 0; i < values.length; ++i){
            System.out.println(values[i]);
            total = total + values[i];
        }
        System.out.println("Total: " + total);
    }
}
