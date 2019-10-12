package imic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    static ArrayList<Containers> listCon = new ArrayList<Containers>();
    static ArrayList<Containers> listLanh = new ArrayList<Containers>();
    static ArrayList<Containers> listThuong = new ArrayList<Containers>();
    static ArrayList<Containers> listHuHong = new ArrayList<Containers>();
    static Scanner sc = new Scanner(System.in);

    public static void main( String[] args )
    {
        while (true) {
            System.out.println("Nhập số để lựa chọn các mục sau:");
            System.out.println("1.Thêm containers");
            System.out.println("2.Coi danh sách container gốc");
            System.out.println("3.Để lọc danh sách container lạnh đã phân loại");
            System.out.println("4.Để lọc danh sách container hư hỏng đã phân loại");
            System.out.println("5.Thiết lập miêu tả trong danh sách container hư hỏng");
            System.out.println("6.Thoát chương trình");
            System.out.println("7.Coi danh sách lạnh");
            System.out.println("8.Coi danh sách hư hỏng");
            int luachon = sc.nextInt();
            if (luachon == 1){
                ContainerAdd();
            }
            else if (luachon == 3){
                ContainerPhanLoaiLanh();
            }
            else if (luachon == 2){
                ContainerView();
            }
            else if (luachon == 4){
                ContainerPhanLoaiHuHong();
            }
            else if (luachon == 5){
                ContainerThietLapMieuTa();
            }
            else if (luachon == 6){
                break;
            }
            else if (luachon == 7){
                ContainerlanhView();
            }
            else if (luachon == 8){
                ContainerHuHongView();
            }
        }
    }
    public static void ContainerAdd(){
        ContainersController ec = new ContainersController();
        listCon = ec.addCon(listCon);
    }
    public static void ContainerView(){
        ContainersController ec = new ContainersController();
        listCon = ec.displayCon(listCon);
    }
    public static void ContainerlanhView(){
        ContainersController ec = new ContainersController();
        listLanh = ec.displayCon(listLanh);
    }
    public static void ContainerHuHongView(){
        ContainersController ec = new ContainersController();
        listHuHong = ec.displayCon(listHuHong);
    }
    public static void ContainerPhanLoaiLanh(){
        ContainersController ec = new ContainersController();
        for (Containers p1 : listCon) {
            if (p1.type.equals("lanh"))
            {
                listLanh.add(p1);
                //listCon.remove(p1);
            }
        }
        System.out.println("Đã phân loại ra danh sách mới");
        //listLanh = ec.displayCon(listLanh);
    }
    public static void ContainerPhanLoaiHuHong(){
        ContainersController ec = new ContainersController();
        for (Containers p1 : listCon) {
            if (p1.flag==false)
            {
                listHuHong.add(p1);
                //listCon.remove(p1);
            }
        }
        System.out.println("Đã phân loại ra danh sách mới");
        //listHuHong = ec.displayCon(listHuHong);
    }
    public static void ContainerThietLapMieuTa(){
        ContainersController ec = new ContainersController();
        if (listHuHong.isEmpty())
        {
            System.out.println("Danh sách hư hỏng trống rỗng");
        }
        else {
            for (Containers p2 : listHuHong) {
                System.out.println("Container" + " " + p2.id + " có miêu tả: " + p2.des);
                System.out.println("Nhập 1 để thay đổi miêu tả, 2 để ko thay đổi: ");
                int luachon = sc.nextInt();
                if (luachon == 1) {
                    System.out.println("Nhập dòng miêu tả mới: ");
                    String mieuta1 = sc.nextLine();
                    String mieuta = sc.nextLine();
                    p2.des = mieuta;
                } else if (luachon == 2) {
                    break;
                }
            }
        }
    }
}
