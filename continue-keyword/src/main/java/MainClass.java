public class MainClass {
    public static void main(String[] args) {
//        testContinue();
        int[] a = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        testContinue3(a);
    }

    private static void testContinue(){
        for(int i=0;i<=100; i++){
            System.out.println("Number is " + i);

            if(i % 3 == 0){
                System.out.println(i + " is a multiple of 3");
                continue;
            }

            System.out.println("Doing stuff AAAAA");

            if(i % 5 == 0){
                System.out.println(i + " is a multiple of 5");
                continue;
            }

            System.out.println("Doing stuff BBBBB");

            if(i % 7 == 0){
                System.out.println(i + " is a multiple of 7");
                continue;
            }

            System.out.println("Doing stuff C");
        }
    }

    private static void testContinue1(int[] intArray){
        for(int i=0; i< intArray.length;i++){
            if(intArray[i]<5){
                System.out.println("Number is less than 5");
                continue;
            }

            System.out.println("Doing stuff AAAAA");

            if(intArray[i]==5){
                System.out.println("Number is equal to 5");
                continue;
            }

            System.out.println("Doing stuff BBBBB");

            if(intArray[i]>=5){
                System.out.println("Number is greater than 5");
                continue;
            }

            System.out.println("Doing stuff CCCCC");
        }
    }

    private static void testContinue2(int[] intArray){
        for(int i=0; i< intArray.length;i++){
            if(!(intArray[i]<5)){

                System.out.println("Doing stuff AAAAA");

                if(intArray[i]==5){
                    System.out.println("Number is equal to 5");
                    continue;
                }

                System.out.println("Doing stuff BBBBB");

                if(intArray[i]>=5){
                    System.out.println("Number is greater than 5");
                    continue;
                }

                System.out.println("Doing stuff CCCCC");

            }
        }
    }
    private static void testContinue3(int[] intArray){
        for(int i=0; i< intArray.length;i++){
            if(!(intArray[i]<5)){

                System.out.println("Doing stuff AAAAA");

                if(intArray[i]!=5){
                    System.out.println("Doing stuff BBBBB");

                    if(intArray[i]>=5){
                        System.out.println("Number is greater than 5");
                        continue;
                    }

                    System.out.println("Doing stuff CCCCC");
                }

            }
        }
    }

}
