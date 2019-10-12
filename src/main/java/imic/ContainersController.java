package imic;

import java.util.ArrayList;
import java.util.Scanner;

public class ContainersController {
    Scanner sc = new Scanner(System.in);

    public ArrayList<Containers> addCon(ArrayList<Containers> listCon) {
        while (true) {
            System.out.println("Ban co muon them container, nhap 1 de them, 2 break");
            String i = sc.nextLine();
            if (i.equals("1")){
            Containers e = new Containers();
            System.out.println("Nhap id");
            e.id = sc.nextLine();
            System.out.println("Nhap chieu dai");
            e.chieudai = sc.nextFloat();
            System.out.println("Nhap chieu rong");
            e.chieucao = sc.nextFloat();
            System.out.println("Nhap loai container(lanh/thuong)");
            e.type = sc.nextLine();
            e.type = sc.nextLine();
            System.out.println("Nhap loai flag container");
            e.flag = sc.nextBoolean();
            System.out.println("Nhap mieu ta container");
            e.des = sc.nextLine();
            e.des = sc.nextLine();
            listCon.add(e);
            }
            else if (i.equals("2"))
            {
                break;
            }
        }
        return listCon;
    }

    public ArrayList<Containers> displayCon(ArrayList<Containers> listCon) {
        for (Containers p1 : listCon) {
            System.out.println(p1.toString());
        }
        return listCon;
    }
}
