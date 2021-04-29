import java.util.*;

class Day12 {
    protected String firstName;
    protected String lastName;
    protected int idNumber;

    // Constructor
    Person(String firstName, String lastName, int identification){
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = identification;
    }

    // Print person data
    public void printPerson(){
        System.out.println(
                "Name: " + lastName + ", " + firstName
                        + 	"\nID: " + idNumber);
    }

}

class Student extends Person{
    private int[] testScores;

    /*
     *   Class Constructor
     *
     *   @param firstName - A string denoting the Person's first name.
     *   @param lastName - A string denoting the Person's last name.
     *   @param id - An integer denoting the Person's ID number.
     *   @param scores - An array of integers denoting the Person's test scores.
     */
    // Write your constructor here

    /*
     *   Method Name: calculate
     *   @return A character denoting the grade.
     */
    // Write your method here

    Student(String firstName, String lastName, int identification, int testScores[])
    {
        super(firstName, lastName, identification);
        this.testScores = testScores;
    }
    char calculate(){
        char grade = 'O';
        int sum = 0, a;
        for(int i = 0 ; i < testScores.length; i++){
            sum = sum+testScores[i];
        }
        a = sum/testScores.length;
        if (90 <= a && a <= 100){
            grade = 'O';
        }if(80 <= a && a < 90){
            grade = 'E';
        }if(70 <= a && a < 80){
            grade = 'A';
        }if(55 <= a && a < 70){
            grade = 'P';
        }if(40 <= a && a < 55){
            grade = 'D';
        }if(a<40){
            grade = 'T';
        }
        return grade;
    }
}

class Solution {