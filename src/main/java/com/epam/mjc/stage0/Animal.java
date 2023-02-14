package com.epam.mjc.stage0;

public class Animal {
    private String color;
    private int numberOfPaws;
    private boolean hasFur;

    public Animal() {
    }

    public Animal(String color, int numberOfPaws, boolean hasFur) {
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }

    public String getDescription(){
        String word1="paw";
        String word2="no";

        if(numberOfPaws>1){
            word1="paws";
        }

        if (hasFur==true){
            word2="a";
        }
        return "This animal is mostly "+ color +
                ". It has "+numberOfPaws+" "+word1+" " +
                "and "+word2+" fur.";
    }
}
