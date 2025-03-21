/*
 * Created on 2025-03-13
 *
 * Copyright (c) 2024 Nadine von Frankenberg
 */

import java.util.Arrays;

// NO NEED TO TOUCH THIS FILE
public class TrainCar {

    private String[] trainCarString = { " _________", " |       |", " |       |", "-|_______|", "   o   o  " };

    public TrainCar(String cargo) {
        if (cargo.equalsIgnoreCase("person") || cargo.equalsIgnoreCase("people")) {
            trainCarString[1] = " | o/\\o/ |";
            trainCarString[2] = " |/|  |  |";
            trainCarString[3] = "-|/\\__/\\_|";
        } else if (cargo.equalsIgnoreCase("potatoes")) {
            trainCarString[1] = " |ooooooo|";
            trainCarString[2] = " |ooooooo|";
        } else {
            System.out.println("Cargo not found: " + cargo);
        }
    }

    public String[] getTrainCarString() {
        return trainCarString;
    }

    @Override
    public String toString() {
        return "TrainCar [trainCarString=" + Arrays.toString(trainCarString) + "]";
    }

}
