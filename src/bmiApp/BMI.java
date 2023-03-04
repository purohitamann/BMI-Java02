/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.BMI to edit this template
 */
package bmiApp;

/**
 *
 * @author purohiam
 */
public class BMI {

    // Java Assignment-02 Done!
    /*
 * @Author: Aman Hiran Purohit
 * Date: 2023-02-08 13:39:59 
 * Student Id:- 991669656
 */
    private String name;
    private int age;
    private double mass; // mass in pounds
    private double height; // height in inches

    private double massInKg;
    private double heightInMeter;
    private double calculatedBmi;
    private double calculatedBmiMetric;

    public BMI() {
        // no-arg constructor
    }

    public BMI(String name, int age, double mass, double height) {
        this.name = name;
        this.age = age;
        this.mass = mass;
        this.height = height;

    }

    // getters and setters

    public String getName() {
        return name;
    }

    public double getMassInKg() {
        return massInKg;
    }

    public void setMassInKg(double massInKg) {
        this.massInKg = massInKg;
    }

    public double getHeightInMeter() {
        return heightInMeter;
    }

    public void setHeightInMeter(double heightInMeter) {
        this.heightInMeter = heightInMeter;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getCalculatedBmi() {
        return calculatedBmi;
    }

    public void setCalculatedBmi(double calculatedBmi) {
        this.calculatedBmi = calculatedBmi;
    }

    public double getCalculatedBmiMetric() {
        return calculatedBmiMetric;
    }

    public void setCalculatedBmiMetric(double calculatedBmiMetric) {
        this.calculatedBmiMetric = calculatedBmiMetric;
    }

    // manipulator methods
    public double calculateBMI() {
        this.calculatedBmi = this.mass / ((this.height) * (this.height));
        return Math.round(this.calculatedBmi);
    }

    public double calculateBMIMetric() {
        this.calculatedBmiMetric = (this.calculatedBmi * 703);
        return this.calculatedBmiMetric;
    }

    public double massInKg(double mass) {
        massInKg = (mass * 0.454);
        return massInKg;
    }

    public double heightInMeter(double height) {
        heightInMeter = height * 0.0254;
        return heightInMeter;
    }
    
     // overridden method
    public String statusBMI() {
        if (this.calculatedBmiMetric <= 18.5 && this.calculatedBmiMetric >= 0) {
            return "Underweight";
        } else if (this.calculatedBmiMetric <= 25 && this.calculatedBmiMetric > 18.5) {
            return "Normal Weight";
        } else if (this.calculatedBmiMetric <= 30 && this.calculatedBmiMetric > 25) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }

    

}

