package com.snaping.stydentsystem;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentSystem {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList();
        loop: while (true) {
            System.out.println("-----------欢迎来到学生管理系统-----------");
            System.out.println("1、添加学生");
            System.out.println("2、删除学生");
            System.out.println("3、修改学生");
            System.out.println("4、查询学生");
            System.out.println("请输入您的选择：");

            Scanner sc = new Scanner(System.in);

            String choose = sc.next();

            switch (choose){
                case "1" :
                    System.out.println("添加学生");
                    addStudent(list);
                    break;
                case "2" :
                    System.out.println("删除学生");
                    deleteStudent(list);
                    break;
                case "3" :
                    System.out.println("修改学生");
                    updateStudent(list);
                    break;
                case "4" :
                    System.out.println("查询学生");
                    queryStudent(list);
                    break;
                case "5" :
                    System.out.println("退出");
                    break loop;
                default:
                    System.out.println("您输入的信息有误");
            }
        }
    }


    // 添加学生
    public static void addStudent(ArrayList<Student> list){
        System.out.println("添加学生");
        Student s = new Student();
        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.println("请添加学生ID");
            String id = sc.next();
            if(contains(list, id)){
                s.setId(id);
                break;
            }else{
                System.out.println("ID已经重复了，请重新输入");
            }
        }

        System.out.println("请添加学生姓名");
        String name = sc.next();
        s.setName(name);
        System.out.println("请添加学生年龄");
        int age = sc.nextInt();
        s.setAge(age);
        System.out.println("请添加学生家庭住址");
        String address = sc.next();
        s.setAddress(address);


        System.out.println("添加成功！");
        list.add(s);
    }

    // 修改学生
    public static void updateStudent(ArrayList<Student> list){
        System.out.println("修改学生");
    }

    // 删除学生
    public static void deleteStudent(ArrayList<Student> list){
        System.out.println("删除学生");
    }

    // 查询学生
    public static void queryStudent(ArrayList<Student> list){
        System.out.println("查询学生");
        if(list.size() == 0){
            System.out.println("当前无学生信息，请添加后再查询");
        }else{
            System.out.println("id\t姓名\t年龄\t家庭住址");

            for (int i = 0; i < list.size(); i++) {
                Student s = list.get(i);
                System.out.println(s.getId() + "\t" + s.getName() + "\t" + s.getAge() + "\t" + s.getAddress());
            }
        }
    }

    public static boolean contains (ArrayList<Student> list, String id){


        for (int i = 0; i < list.size(); i++) {
            Student s = list.get(i);
            System.out.println(s.getId());
            System.out.println(id);
            if(s.getId().equals(id)){
                return false;
            }
        }
        return true;
    }
}
