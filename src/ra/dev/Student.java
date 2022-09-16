package ra.dev;

import java.util.Scanner;

public class Student {
    //Thành phần 1: đặc điểm của đối tượng(fields/Attributes)
    private String studentId;
    private String studentName;
    private int age;
    private boolean gender;
    private String address;

    //Thành phần 2:Hàm tạo để khởi tạo đối tượng(Contructors)
    public Student() {
    }

    public Student(String studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
    }

    public Student(String studentId, String studentName, int age, boolean gender, String address) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.age = age;
        this.gender = gender;
        this.address = address;
    }
    //thành phần 3: phương thức mô tả hành vi của đối tượng
    //3.1:Các phương thức getter/setter

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    //3.2:Các phương thức mô tả hành vi của đối tượng
    //Access Modifiers + Return Data + Method name(params)
    public int sumTwoNumber(int num1, int num2) {
        int sum = num1 + num2;
        return sum;
    }
    public void hello() {
        System.out.println("hello");
    }
    public void inputData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap ma sinh vien: ");
        this.studentId = sc.nextLine();
        System.out.println("nhap ten sinh vien: ");
        this.studentName = sc.nextLine();
        System.out.println("nhap tuoi sinh vien: ");
        this.age = Integer.parseInt(sc.nextLine());
        System.out.println("nhap vao gioi tinh sinh vien: ");
        this.gender = Boolean.parseBoolean(sc.nextLine());
        System.out.println("nhap vao dia chi: ");
        this.address = sc.nextLine();
    }
    public void displayData() {
        System.out.printf("Ma SV: %s - Ten SV: %s - Tuoi: %d\n", this.studentId, this.studentName, this.age);
        System.out.printf("Gioi tinh: %b - Dia chi: %s \n",this.gender, this.address);
    }
}
