package com.company;

public class MyArraySizeException extends IndexOutOfBoundsException {
    public MyArraySizeException(){
        super("Массив не формата 4х4");
    }
}