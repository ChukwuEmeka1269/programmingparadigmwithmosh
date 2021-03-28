package com.decagon.emeka.codewithmosh.exercise;

/**
 * This program is an exercise of procedural programming paradigm
 * It calculates the wages of employees based on three(3) inputs namely:
 * baseSalary
 * extraHours
 * hourlyRate
 *
 */

public class Main {

    /**
     * main method begins execution of program with
     * @param args
     *
     *
     */
    public static void main(String[] args) {
	    int baseSalary = 50_000;
	    int extraHours = 10;
	    int hourlyRate = 20;
    int wage = calculateWage(baseSalary, extraHours, hourlyRate); //Called calculateWage method
        System.out.println( "Your Wage is: " + wage);
    }

    /**
     * Created a method for calculating wages called calculateWage using the below parameter
     * @param baseSalary = minimum wage
     * @param extraHours = overtime payment
     * @param hourlyRate = pay per hour
     * @return
     */
    public static int calculateWage(
            int baseSalary,
            int extraHours,
            int hourlyRate) {
        return baseSalary + (extraHours * hourlyRate);

    }
}
