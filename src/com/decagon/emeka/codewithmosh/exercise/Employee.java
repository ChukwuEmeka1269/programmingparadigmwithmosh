package com.decagon.emeka.codewithmosh.exercise;

/**
 * Created an Employee class that will hold properties associated with the object Employee.
 */
public class Employee {
    private int baseSalary;
    private int hourlyRate;

    public int calculateWage(int extraHours) { //pass the field variable extraHours assuming extraHours is fixed
        return baseSalary + (hourlyRate * extraHours);
    }

    /**
     * create method to validate user input
     * @param baseSalary
     */
    public void setBaseSalary(int baseSalary){
        if (baseSalary <= 0)
            throw new IllegalArgumentException("Salary cannot be 0 or less");
        this.baseSalary = baseSalary;
    }

    public int getBaseSalary() {
        return baseSalary;
    }

    public void setHourlyRate(int hourlyRate) {
        if (hourlyRate <= 0)
            throw  new IllegalArgumentException("Hourly Rate must be greater than 0");
        this.hourlyRate = hourlyRate;
    }

    public int getHourlyRate() {
        return hourlyRate;
    }

}
