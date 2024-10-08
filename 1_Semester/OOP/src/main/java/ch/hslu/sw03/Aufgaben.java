package ch.hslu.sw03;

public class Aufgaben {
    public int max(int a, int b) {
        return Math.max(a, b);
    }

    public int min(int a, int b) {
        return Math.min(a, b);
    }

    public int max(int a, int b, int c) {
        int temp = max(a, b);
        return max(temp, c);
    }

    public void counter(int count){
        for(int i = 0; i < count; i++){
            System.out.println(i+"\n");
        }
    }

    public void floatAdder(float initialValue,float maxValue){
        final float adder = 0.000025F;

        if(initialValue > maxValue){
            System.out.println("Initial value is greater than max value");
            return;
        }

        while(initialValue <= maxValue){
            initialValue += adder;
        }

        System.out.println(initialValue);
    }

    public static void printBox(int height, int width){
        //top
        for(int i = 0; i < width; i++){
            System.out.print("#");
        }

        System.out.print("\n");
        //center
       for(int j = 0; j <= height-2; j++){
           for(int i = 0; i< width; i++){
                if(i == 0 || i == width-1){
                    System.out.print("#");
                }
                else{
                    System.out.print(" ");
                }
            }
           System.out.print("\n");
        }

        //bottom
        for(int i = 0; i < width; i++){
            System.out.print("#");
        }
    }
}
