package com.example.demo;

public class Square {
    private final long id;
    private final long number;
    private long square;

    public Square(long id, long number){
        this.id = id;
        long pow = (long)Math.pow(number, 2);
        this.number = number;
        this.square = pow;
    }

    public long getId(){
        return id;
    }

    public long getNumber(){
        return number;
    }

    public long getSquare(){
        return square;
    }
}
