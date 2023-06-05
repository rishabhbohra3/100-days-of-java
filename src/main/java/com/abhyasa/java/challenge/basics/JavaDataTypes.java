package com.abhyasa.java.challenge.basics;

public class JavaDataTypes {

    /**
     * byte data type
     * size - 1byte - 8bits
     * stores whole numbers from -128 to 127 **/
    private void byteDataType() {
        byte byteValue = 1;
        System.out.println("init byte value: " + byteValue);

        //bytes are in circular, increment a value from last value gives -128
        byte lastByteValue = 127;
        lastByteValue++;
        System.out.println("updated byte value: " + lastByteValue);

        Byte byteWrapper = new Byte("45");
        byte actualByteValue = byteWrapper;
        System.out.println("wrapper to byte value: " + actualByteValue);
    }

    /**
     * short data type
     * size - 2byte - 16bits
     * Stores whole numbers from -32,768 to 32,767 **/
    private void shortDataType() {
        short shortValue = 4567;
        System.out.println("short value: " + shortValue);

        //circular values
        shortValue = 32767;
        shortValue++;
        System.out.println("updated short value:" + shortValue);

        Short shortWrapper = new Short("1244");
        System.out.println("short wrapper value: "+ shortWrapper);
    }

    /**
     * int data type
     * size - 4byte - 32bits
     * Stores whole numbers from -2,147,483,648 to 2,147,483,647 **/
    private void intDataType() {
        int intValue = 129;
        System.out.println("int value: " + intValue);

        //circular values
        int lastIntValue = 2147483647;
        lastIntValue++;
        System.out.println("updated int value:" + lastIntValue);

        //type cast int
        short shortValue = ((short) intValue);

        //does not give error, goes in circular fashion to find equivalent byte value
        byte byteValue = ((byte) intValue);
        float floatValue = ((float) intValue);
        System.out.println("shortValue: " + shortValue);
        System.out.println("byteValue: " + byteValue);
        System.out.println("floatValue: " + floatValue);
        // long and double implicit type casting

        Integer integerWrapper = new Integer("1244");
        System.out.println("int wrapper value: "+ integerWrapper);
    }

    /**
      primitive data types:
      1. byte 2. short 3. int 4. long 5. float 6. double 7. boolean 8. char
     **/
    private void tryPrimitiveDataTypes() {
        byteDataType();
        shortDataType();
        intDataType();
    }
    public static void main(String[] args) {
        JavaDataTypes javaDataTypes = new JavaDataTypes();
        javaDataTypes.tryPrimitiveDataTypes();
    }
}
