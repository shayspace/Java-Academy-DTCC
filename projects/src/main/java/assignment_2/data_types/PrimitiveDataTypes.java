package assignment_2.data_types;

public class PrimitiveDataTypes {
    public static void main (String[] args) {
        /*
            Declare your code here!
         */

        int i = 0;
        boolean success = true;
        byte entry;
        char name;
        short sum;
        int a = 0;
        long product;
        float quotient = (float) 2345.0089E23;
        double difference = 567893.05;

        double newdouble = (double) a;
        float newfloat = (float) (quotient * difference);
        int newint = (int)(quotient * difference);

        char c;
        c = 2;
        int newintchar = c;

        System.out.println("\n" + newintchar + ", is int value of: " + c + ".\n");

    }
}
