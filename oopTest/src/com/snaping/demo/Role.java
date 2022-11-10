package com.snaping.demo;

import java.util.Random;

public class Role {
    private String name;
    private int blood;
    private char gender;
    private String face;

    // 长相描述
    String[] boyfaces = {"风流俊雅", "气宇轩昂", "相貌英俊", "五官端正", "相貌平平", "一塌糊涂", "面目狰狞"};
    String[] girlfaces = {"美幻绝伦", "沉鱼落雁", "亭亭玉立", "身材娇好", "相貌平平", "相貌简陋", "惨不忍睹"};

    // 攻击描述
    String[] attacks_desc = {
            "%s使出了一招【背心钉】，转到对方身后，一掌向%s背心的灵台穴拍去。",
            "%s使出了一招【游空探爪】，飞起身形自半空中变掌为爪锁向%s。",
            "%s大喝一声，身形下伏，一招【劈雷坠地】，锤向%s双腿。",
            "%s运气于掌，一瞬间掌心变得血红，一式【掌心雷】，推向%s。",
            "%s阴手翻起阳手跟进，一招【没遮拦】，结结实实的锤向%s。",
            "%s上步抢身，招中套招，一招【劈挂连环】，连环攻向%s",
    };
    // 受伤描述
    String[] injureds_desc = {
            "结果%s退了半步，毫发无伤",
            "结果给%s造成了一处瘀伤",
            "结果一击命中，%s痛的弯下了腰",
            "结果%s痛苦的闷哼了一声，显然受了点内伤",
            "结果%s摇摇晃晃，一跤摔倒在地",
            "结果%s脸色一下变得惨白，连退了好几步",
            "结果【轰】的一声，%s口中献血狂喷而出",
            "结果%s一声惨叫，像摊软泥般塌了下去",
    };
    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getFace() {

        return face;
    }

    public void setFace(char gender) {
        Random r = new Random();
        // 区别男女
        if (gender == '男') {
            int index = r.nextInt(boyfaces.length);
            this.face = boyfaces[index];
        } else if (gender == '女') {
            int index = r.nextInt(girlfaces.length);
            this.face = girlfaces[index];
        } else {
            this.face = "面目狰狞";
        }

    }

    public Role() {
    }

    public Role(String name, int blood, char gender) {
        this.name = name;
        this.blood = blood;
        this.gender = gender;
        setFace(gender);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBlood() {
        return blood;
    }

    public void setBlood(int blood) {
        this.blood = blood;
    }

    // 定义一个方法去攻击别人
    public void attack(Role role) {
        // 计算造成的伤害
        Random r = new Random();

        int index = r.nextInt(attacks_desc.length);
        String KongFu = attacks_desc[index];
        // 输出一个攻击效果
        System.out.printf(KongFu, this.getName(), role.getName());
        System.out.println();

        int hurt = r.nextInt(20) + 1;
        int remindBlood = role.getBlood() - hurt;
        remindBlood = remindBlood < 0 ? 0 : remindBlood;
        role.setBlood(remindBlood);

        // 输出一个受伤描述
        if(remindBlood > 90){
            System.out.printf(injureds_desc[0], role.getName());
        }else if(remindBlood > 80){
            System.out.printf(injureds_desc[1], role.getName());
        }else if(remindBlood > 70){
            System.out.printf(injureds_desc[2], role.getName());
        }else if(remindBlood > 60){
            System.out.printf(injureds_desc[3], role.getName());
        }else if(remindBlood > 40){
            System.out.printf(injureds_desc[4], role.getName());
        }else if(remindBlood > 20){
            System.out.printf(injureds_desc[5], role.getName());
        }else if(remindBlood > 10){
            System.out.printf(injureds_desc[6], role.getName());
        }else {
            System.out.printf(injureds_desc[7], role.getName());
        }

        System.out.println();
        // System.out.println(this.getName() + "举起了拳头对着" + role.getName() + "打了一下，造成了" + hurt + "点伤害，" + role.getName() + "还剩" + remindBlood + "点血");
    }
    public void showRoleInfo(){
        System.out.println("姓名为："+getName());
        System.out.println("血量为："+getBlood());
        System.out.println("性别为："+getGender());
        System.out.println("面相为："+getFace());
    }
}
