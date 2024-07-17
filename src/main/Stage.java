/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import data.Shelf;
import data.Student;
import java.util.Scanner;

/**
 *
 * @author quang
 */
public class Stage {

    public static void main(String[] args) {
        //RÁP menu cảm giác 1 cái app
        Scanner sc = new Scanner(System.in);
        int choice;
        Shelf tuSE = new Shelf("Pink", "SE");
        do {
            printMenu();
            System.out.println("Input your choice[1..6]");  //Mytoy
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    tuSE.inputAStudent();
                    break;
                case 2:
                    tuSE.printStudentList();
                    break;
                case 3:
                    tuSE.searchAStudent();
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    System.out.println("Bye bye, see u next time!");
                    break;
                default:
                    System.out.println("Please choose [1..6]");
                    break;
            }

        } while (choice != 6);
    }
    
    

    public static void printMenu() {
        System.out.println("Welcome to Student HAUI");
        System.out.println("Choose the following function to play with");
        System.out.println("1. Add a new student profile");
        System.out.println("2. Print a student list");
        System.out.println("3. Search a student by id");
        System.out.println("4. Update a student profile");
        System.out.println("5. Remove a student profile");
        System.out.println("6.Quit");

    }

    public static void testShelf() {
        //inputStudentList();
        inputStudentByShelf();
    }

    public static void inputStudentList() {
        Scanner sc = new Scanner(System.in);
        String id, name;
        int yob, count;
        double gpa;

        System.out.println("Enter the numbers of the students: ");
        count = Integer.parseInt(sc.nextLine());

        Student arr[] = new Student[count];
        //for nhập 5 hồ sơ
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Input student #" + (i + 1) + "/" + count);
            System.out.print("Input id: ");
            id = sc.nextLine();
            System.out.print("Input name: ");
            name = sc.nextLine();
            System.out.print("Input yob: ");
            yob = Integer.parseInt(sc.nextLine());
            System.out.print("Input gpa: ");
            gpa = Double.parseDouble(sc.nextLine());

            arr[i] = new Student(id, name, yob, gpa);
        }
        System.out.println("The student List:");
        for (Student x : arr) {
            x.showProfile();
        }
        //sort đã làm
    }

    public static void inputStudentByShelf() {
        Shelf tuSE = new Shelf("PINK", "SE");
        tuSE.inputAStudent();
        tuSE.inputAStudent();
        tuSE.printStudentList();

        Shelf tuCS = new Shelf("Green", "CS");
        tuCS.inputAStudent();
        tuCS.printStudentList();
    }
}
