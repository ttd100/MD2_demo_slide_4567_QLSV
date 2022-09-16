import ra.dev.Student;

import java.io.StringReader;
import java.util.Scanner;

import static jdk.nashorn.internal.objects.NativeFunction.function;

public class Main {
    public  static void main(String[] args){
        //khoi tao doi tuong sinh vien 1:
        Student st1 = new Student();
        //khoi tao doi tuong sinh vien 2:
        Student st2 = new Student("Sv002","Nguyen Van B");
        //khoi tao doi tuong sinh vien 3:
        Student st3 = new Student("Sv003","Nguyen Van C",22,false,"TP.HCM");
        //Nhap thong tin con lai cho sinh vien 2:
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao tuoi sinh vien 2 ");
        st2.setAge(Integer.parseInt(sc.nextLine()));
        System.out.println("nhap vao gioi tinh sinh vien 2");
        st2.setGender(Boolean.parseBoolean(sc.nextLine()));
        System.out.println("nhap vao dia chi cua sinh vien 2");
        st2.setAddress(sc.nextLine());
        //cho sinh vien 3 tinh tong 2 so in ra:
        System.out.println("Tong 2 so la: "+ st3.sumTwoNumber(5,7));
        //In ra ten sinh vien 3 :
        System.out.println("Ten sinh vien 3 la: "+st3.getStudentName());
        // In thong tin cac sinh vien :
        //Nhap thong tin cho sinh vien 1:
        st1.inputData();
        System.out.println("----------SV1-----------");
        st1.displayData();
        System.out.println("----------SV2-----------");
        st2.displayData();
        System.out.println("----------SV3-----------");
        st3.displayData();
    }
}