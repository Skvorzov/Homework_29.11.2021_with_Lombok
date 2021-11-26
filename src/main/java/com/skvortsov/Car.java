package com.skvortsov;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Car {
    private double fuel; // количество бензина в баке
    private double consumption; // расход топлива на 100 км

    public boolean canDrive() {
        return fuel > 0;
    }

    public double getDistance() {
        return fuel / consumption * 100;
    }
}