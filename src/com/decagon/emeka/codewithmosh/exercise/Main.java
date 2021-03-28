package com.decagon.emeka.codewithmosh.exercise;

/**
 * This program makes use of the Object Oriented Programming concept
 * More specifically, it implements the use of Encapsulation
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
        var employee = new Employee();

        employee.baseSalary = 50_000;
        employee.hourlyRate = 10;

        int wage = employee.calculateWage(20);

        System.out.println( "Your Wage is: " + wage);
    }

}
