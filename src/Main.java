public class Main {



}
    //Compliant example: variable declared within for statement.
//    public static void main(String[] args) {
//        for (int i = 0; i < 5; i++) {
//            System.out.println("Hello world!");
//        }
//    }
//}


    //Non-compliant example: variable declaration outside of loop.
//    public static void main(String[] args) {
//        int i = 0; //variable declared outside of loop when it should be declared within loop.
//        for (i = 0; i < 5; i++ ){
//            System.out.println("Hello world!");
//        }
//    }
//}