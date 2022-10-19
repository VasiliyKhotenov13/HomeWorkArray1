public class Main {
    public static void main(String[] args) {

//        int [] weights1 = {90, 91, 92, 95, 93, 89, 85, 83, 0, 0, 0, 0};
//        weights1[0] = 90;
//        int januaryWeights = weights1 [0];
//        System.out.println(januaryWeights);
//        System.out.println(weights1[0]);
//        System.out.println(weights1[4]);
//        int january1 = 0;
//        System.out.println(weights1[january1]);
//        for (int i1 = 0; i1 < weights1.length; i1++) {
//            System.out.println(weights1[i1]);
//        }

        System.out.println("ЗАДАНИЕ 1.1");
        int[]n = new int[]{1, 2, 3};
        System.out.println(n[0]);
        System.out.println(n[1]);
        System.out.println(n[2]);

        System.out.println("ЗАДАНИЕ 1.2");
        double[]m = new double[]{1.57, 7.654, 9.986};
        System.out.println(m[0]);
        System.out.println(m[1]);
        System.out.println(m[2]);

        System.out.println("ЗАДАНИЕ 1.3");
        int[] array = {4, 345, 13};
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);

        System.out.println("ЗАДАНИЕ 2");
        for (int i=0; i < 3; i++) {
            System.out.print(n[i]);
            if(i < array.length - 1){
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i2=0; i2 < 3; i2++) {
            System.out.print(m[i2]);
            if(i2 < array.length - 1){
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i3=0; i3 < 3; i3++) {
            System.out.print(array[i3]);
            if(i3 < array.length - 1){
                System.out.print(", ");
            }
        }
        System.out.println();

        System.out.println("ЗАДАНИЕ 3");
        for (int i=2; i >= 0; i--) {
            System.out.print(n[i]);
            if(i != 0){
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i2=2; i2 >= 0; i2--) {
            System.out.print(m[i2]);
            if(i2 != 0){
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i3=2; i3 >= 0; i3--) {
            System.out.print(array[i3]);
            if(i3 != 0){
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.println("ЗАДАНИЕ 4");
        int[]array2 = {1, 2, 3};
        for (int a = 0; a < 3; a++){
            if (array2[a] % 2 == 1)
                array2[a] = array2[a] + 1;
                System.out.println(array2[a]);
        }

    }
}