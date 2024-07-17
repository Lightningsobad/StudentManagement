/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

import java.util.Scanner;

/**
 *
 * @author quang
 */
public class Shelf {

    //đặc điểm của 1 cái tủ bất kì là gì: màu sơn:__; giá tiền:___; số ngăn:___các món đồ nhét vào
    //chứa nhiều đồ, nhiều object rõ ràng đến thời điểm này ta càn nhiều mảng object
    //tủ sẽ chứa 1 list/mảng/danh sách các đối tượng
    //ứng dụng của mảng, góp phần tạo dựng nên object khác
    //OOP: tìm các object, chúng phối hợp, trộn với nhau
    private String color;
    private String label;
    //chứa cái gì
    private Student list[] = new Student[300];
    private Scanner sc = new Scanner(System.in);
    private int count = 0; // mới mua tủ về, số hồ sơ = 0;
    //nhét thêm 1 hồ sơ thì count++
    //chơi mảng chỉ for đến count

    //tui có nhiều không gian chứa in4, tui sẽ giải quyết chuyện nhập xuất
    public Shelf(String color, String label) {
        this.color = color;
        this.label = label;
    }

    public void inputAStudent() {

        String id, name;
        int yob;
        double gpa;

        System.out.println("Input student #" + (count + 1) + "/" + list.length);
        System.out.print("Input id: ");
        id = sc.nextLine();
        System.out.print("Input name: ");
        name = sc.nextLine();
        System.out.print("Input yob: ");
        yob = Integer.parseInt(sc.nextLine());
        System.out.print("Input gpa: ");
        gpa = Double.parseDouble(sc.nextLine());

        list[count] = new Student(id, name, yob, gpa);
        count++;

    }

    public void printStudentList() {
        System.out.println("The student list: ");
        for (int i = 0; i < count; i++) {
            list[i].showProfile();  //FOR HẾT LÀ TOANG!!!
            // dùng fore thì vỡ mặt, do fore run to cuối mảng   
        }
    }

    public void searchAStudent() {
        //đưa id vào từ bàn phím và tìm sv theo id
        //for từ đầu đến count của mảng, lôi từng sv ra hỏi, mã số của ku là gì
        //so sánh với id gõ vào, == nhau thì done, tìm ra sinh viên ở vị trí i
        String id;
        System.out.println("Input student's id you want to search: ");
        id = sc.nextLine();
        for (int i = 0; i < count; i++) {
            if (list[i].getId().equalsIgnoreCase(id) == true) {
                System.out.println("Student: ");
                list[i].showProfile();
                return; //thoát ra luôn, vì mã số sv duy nhất, thấy rồi
                //ko còn ai để tìm nữa

            }

        }
        System.out.println("Student not found");
    }

}
