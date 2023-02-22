package com.snaping.stydentsystem;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentSystem {
    public static final String NUMBER_AND_WORD = "^(?![A-Za-z]+$)(?!\\d+$)[A-Za-z0-9]{3,15}$";

    public static void main(String[] args) {
        Boolean isLogin = false;
        ArrayList<Student> list = new ArrayList();
        ArrayList<User> userArrayList = new ArrayList<>();
        while (true) {

            if (isLogin) {
                loop:
                while (true) {
                    System.out.println("-----------欢迎来到学生管理系统-----------");
                    System.out.println("1、添加学生");
                    System.out.println("2、删除学生");
                    System.out.println("3、修改学生");
                    System.out.println("4、查询学生");
                    System.out.println("请输入您的选择：");

                    Scanner sc = new Scanner(System.in);

                    String choose = sc.next();

                    switch (choose) {
                        case "1":
                            System.out.println("添加学生");
                            addStudent(list);
                            break;
                        case "2":
                            System.out.println("删除学生");
                            deleteStudent(list);
                            break;
                        case "3":
                            System.out.println("修改学生");
                            updateStudent(list);
                            break;
                        case "4":
                            System.out.println("查询学生");
                            queryStudent(list);
                            break;
                        case "5":
                            System.out.println("退出");
                            break loop;
                        default:
                            System.out.println("您输入的信息有误");
                    }
                }
            } else {
                System.out.println("-----------欢迎登录学生管理系统-----------");
                System.out.println("请选择操作");
                System.out.println("1、登录");
                System.out.println("2、注册");
                System.out.println("3、忘记密码");

                Scanner sc = new Scanner(System.in);

                String select = sc.next();
                switch (select) {
                    case "1":
                        boolean loginRes = login(userArrayList);
                        if (loginRes) {
                            isLogin = true;
                        }
                        break;
                    case "2":
                        register(userArrayList);
                        break;
                    case "3":
                        forgetPassword();
                        break;
                    default:
                        System.out.println("您的输入有误");
                }
            }
        }


    }

    public static boolean login(ArrayList<User> userArrayList) {
        System.out.println("登录");
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名");
        String username = sc.next();
        int userIndex = getUserIndex(userArrayList, username);
        if (userIndex == -1) {
            System.out.println("的用户名不存在！");
            return false;
        }

        System.out.println("请输入密码");
        String localPassword = sc.next();
        User user = userArrayList.get(userIndex);
        String password = user.getPassword();
        if (!password.equals(localPassword)) {
            System.out.println("账户或密码错误");
            return false;
        }
        System.out.println("登录成功");
        return true;
    }

    public static boolean register(ArrayList<User> userList) {

        System.out.println("注册");
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名");
        String username = sc.next();
        int userIndex = getUserIndex(userList, username);
        if (userIndex != -1) {
            System.out.println("您输入的用户名已存在");
            return false;
        }
        String password = "";
        loop:
        while (true) {
            System.out.println("请输入密码");
            password = sc.next();
            if (password.matches(NUMBER_AND_WORD)) {
                break loop;
            } else {
                System.out.println("您的密码太简单了！请重新输入");
            }
        }

        System.out.println("请输入再次输入密码");
        String rePassword = sc.next();

        if (!password.equals(rePassword)) {
            System.out.println("注册失败！两次密码不一样");
            return false;
        }
        System.out.println("请输入身份证号码");
        String idCard = sc.next();
        System.out.println("请输入手机号码");
        String phone = sc.next();


        User user = new User(username, rePassword, idCard, phone);
        userList.add(user);
        System.out.println("注册成功");
        return true;
    }

    public static void forgetPassword() {
        System.out.println("忘记密码");
    }

    public static int getUserIndex(ArrayList<User> userArrayList, String username) {

        for (int i = 0; i < userArrayList.size(); i++) {
            User user = userArrayList.get(i);
            if (user.getUsername().equals(username)) {
                return i;
            }
        }

        return -1;
    }


    // 添加学生
    public static void addStudent(ArrayList<Student> list) {
        System.out.println("添加学生");
        Student s = new Student();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("请添加学生ID");
            String id = sc.next();
            if (contains(list, id)) {
                s.setId(id);
                break;
            } else {
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
    public static void updateStudent(ArrayList<Student> list) {
        System.out.println("请输入要修改学生的ID");
        Scanner sc = new Scanner(System.in);
        String id = sc.next();

        int index = getIndex(list, id);
        if (index >= 0) {
            Student student = list.get(index);
            System.out.println("请输入学生的姓名");
            String name = sc.next();
            student.setName(name);
            System.out.println("请输入学生的年龄");
            int age = sc.nextInt();
            student.setAge(age);
            System.out.println("请输入学生的家庭住址");
            String address = sc.next();
            student.setAddress(address);

            System.out.println("修改成功");
        } else {
            System.out.println("修改失败！没有" + id + "的学生");
        }
    }

    // 删除学生
    public static void deleteStudent(ArrayList<Student> list) {
        System.out.println("请输入删除的学生ID");
        Scanner sc = new Scanner(System.in);
        String id = sc.next();

        int index = getIndex(list, id);
        if (index >= 0) {
            list.remove(index);
            System.out.println("删除了ID为" + id + "的学生");
        } else {
            System.out.println("删除失败！没有id " + id + "的学生");
        }


    }

    // 查询学生
    public static void queryStudent(ArrayList<Student> list) {
        System.out.println("查询学生");
        if (list.size() == 0) {
            System.out.println("当前无学生信息，请添加后再查询");
        } else {
            System.out.println("id\t姓名\t年龄\t家庭住址");

            for (int i = 0; i < list.size(); i++) {
                Student s = list.get(i);
                System.out.println(s.getId() + "\t" + s.getName() + "\t" + s.getAge() + "\t" + s.getAddress());
            }
        }
    }

    public static boolean contains(ArrayList<Student> list, String id) {

        return getIndex(list, id) < 0;
    }

    public static int getIndex(ArrayList<Student> list, String id) {

        for (int i = 0; i < list.size(); i++) {
            Student s = list.get(i);
            if (s.getId().equals(id)) {
                return i;
            }
        }
        return -1;
    }
}
