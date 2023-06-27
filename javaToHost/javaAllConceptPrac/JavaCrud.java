package javaAllConceptPrac;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

class Student{
    String name;
    int year;
    private String[] courses = new String[5];
    private HashMap<String[],int[]> scores = new HashMap<String[],int[]>();
    public Student(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Student Name: ");
        this.name = in.nextLine();
        System.out.println("Enter Student's year of study: ");
        this.year = in.nextInt();
        this.studentCRUD();
    }
    public void setCourses(){
        Scanner in = new Scanner(System.in);
        for(int i = 0;i < 5;i++){
            System.out.printf("%d.Enter Course name to register: ", i);
            this.courses[i] = in.nextLine();
        }
    }
    public void setScores(){
        Scanner in = new Scanner(System.in);
        String[] coursesRegistered = this.getCourses();
        int[] score = new int[5];
        for(int i = 0;i < coursesRegistered.length;i++){
            System.out.printf("Enter %s's scores: ",coursesRegistered[i]);
            score[i] = in.nextInt();
        }
        scores.put(coursesRegistered,score);
    }

    public String[] getCourses() {
        return courses;
    }
    public int[] getScores()
    {
        String[] courseRegistered = new String[0];
        return scores.get(courseRegistered);
    }
    public void studentCRUD(){
        int choice;
        do
        {
            Scanner ch = new Scanner(System.in);

            System.out.println("***** Choose from the following options *****");
            System.out.println("\t1.Register Student's courses");
            System.out.println("\t2.View Student's registered courses");
            System.out.println("\t3.Input Student's exam scores");
            System.out.println("\t4.View Student's exam scores");
            System.out.println("\t0.Exit");
            System.out.println("Enter Choice to do operation: ");
            choice = ch.nextInt();

            switch (choice)
            {
                case 1:
                    this.setCourses();
                    break;
                case 2:
                    System.out.println(Arrays.toString(this.getCourses()));
                    break;
                case 3:
                    this.setScores();
                    break;
                case 4:
                    System.out.println(Arrays.toString(this.getScores()));
                    break;
                case 0:
                    System.out.println("Programming exiting...");
                default:
                    System.out.println("Enter a valid choice from the options provided..!");
                    break;

            }
        }while(choice != 0);
    }
}
public class JavaCrud {
    public static void main(String[] args){
        Student stud1 = new Student();
    }
}
