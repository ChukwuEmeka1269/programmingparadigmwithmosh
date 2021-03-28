package com.decagon.emeka.codewithmosh.exercise;

/**
 * Created an Employee class that will hold properties associated with the object Employee.
 */
public class Employee {
    public int baseSalary;
    public int hourlyRate;

    public int calculateWage(int extraHours) { //pass the field variable extraHours assuming extraHours is fixed
        return baseSalary + (hourlyRate * extraHours);
    }

}
