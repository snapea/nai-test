package com.snaping.stydentsystem;

import java.util.Scanner;

public class StudentSystem {
    public static void main(String[] args) {
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
                    addStudent();
                    break;
                case "2" :
                    System.out.println("删除学生");
                    deleteStudent();
                    break;
                case "3" :
                    System.out.println("修改学生");
                    updateStudent();
                    break;
                case "4" :
                    System.out.println("查询学生");
                    queryStudent();
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
    public static void addStudent(){
        System.out.println("添加学生");
    }

    // 修改学生
    public static void updateStudent(){
        System.out.println("修改学生");
    }

    // 删除学生
    public static void deleteStudent(){
        System.out.println("删除学生");
    }

    // 查询学生
    public static void queryStudent(){
        System.out.println("查询学生");
    }
}
