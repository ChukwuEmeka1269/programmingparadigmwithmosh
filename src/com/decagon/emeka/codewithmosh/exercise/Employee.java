package com.decagon.emeka.codewithmosh.exercise;

/**
 * Created an Employee class that will hold properties associated with the object Employee.
 */
public class Employee {
    private int baseSalary;
    private int hourlyRate;

    /**
     * setting up a default constructor for the Employee object with the below fields:
     * @param baseSalary
     * @param hourlyRate
     */
    public Employee(int baseSalary, int hourlyRate){
        setBaseSalary(baseSalary);
        setHourlyRate(hourlyRate);
    }

    public int calculateWage(int extraHours) { //pass the field variable extraHours assuming extraHours is fixed
        return baseSalary + (hourlyRate * extraHours);
    }

    /**
     * create method to validate user input using the set and get methods
     * @param baseSalary
     */
    private void setBaseSalary(int baseSalary){
        if (baseSalary <= 0)
            throw new IllegalArgumentException("Salary cannot be 0 or less");
        this.baseSalary = baseSalary;
    }

    private int getBaseSalary() {
        return baseSalary;
    }

    private void setHourlyRate(int hourlyRate) {
        if (hourlyRate <= 0)
            throw  new IllegalArgumentException("Hourly Rate must be greater than 0");
        this.hourlyRate = hourlyRate;
    }

    private int getHourlyRate() {
        return hourlyRate;
    }

}
