package com.snaping.doudizhu;


import java.util.*;

public class PokerGame {
    static HashMap<Integer, String> hm = new HashMap<>();
    static ArrayList<Integer> list = new ArrayList<>();
    static HashMap<String, Integer> weight = new HashMap<>();


    static {
        // 准备牌
        int serialNumber = 1;
        String[] color = {"♥️", "♠️", "♦️", "♣️"};
        String[] number = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};

        weight.put("J", 11);
        weight.put("Q", 12);
        weight.put("K", 13);
        weight.put("A", 14);
        weight.put("2", 15);
        weight.put(" 🐮", 100);
        weight.put(" 🐎", 50);

        for (String n : number) {
            for (String c : color) {
                hm.put(serialNumber, c + n);
                list.add(serialNumber);
                serialNumber++;
            }
        }
        // 🐮 大王
        // 🐎 小王
        hm.put(serialNumber, "🐮");
        list.add(serialNumber);
        serialNumber++;
        list.add(serialNumber);
        hm.put(serialNumber, "🐎");

    }

    public PokerGame() {
        // 洗牌
        Collections.shuffle(list);
        // 发牌
        TreeSet<Integer> basicPoker = new TreeSet<>();
        TreeSet<Integer> player1 = new TreeSet<>();
        TreeSet<Integer> player2 = new TreeSet<>();
        TreeSet<Integer> player3 = new TreeSet<>();
        for (int i = 0; i < list.size(); i++) {
            if (i <= 2) {
                basicPoker.add(list.get(i));
            } else if (i % 3 == 0) {
                player1.add(list.get(i));
            } else if (i % 3 == 1) {
                player2.add(list.get(i));
            } else {
                player3.add(list.get(i));
            }
        }

//        // 排序
//        order(basicPoker);
//        order(player1);
//        order(player2);
//        order(player3);

        // 看牌
//        lookPoker("底牌", basicPoker);
//
//        lookPoker("张三", player1);
//        lookPoker("李四", player2);
//        lookPoker("王五", player3);


        double a = 0.1;
        double b = 0.2;

        System.out.println(a + b);
    }

    public void lookPoker(String name, TreeSet<Integer> ts) {
        System.out.print(name + ":");
        for (int poker : ts) {
            String s = hm.get(poker);
            System.out.print(s + " ");
        }

        System.out.println();
    }

    public void order(ArrayList<String> list) {
        Collections.sort(list, (o1, o2) -> {
            String o1Color = o1.substring(0, 1);
            int o1Weight = getWeight(o1);
            String o2Color = o2.substring(0, 1);
            int o2Weight = getWeight(o1);
            // 获取价值
            int i = o1Weight - o2Weight;
            return i == 0 ? o1Color.compareTo(o2Color) : i;
        });
    }

    public int getWeight(String poker) {

        String key = poker.substring(1);

        if (weight.containsKey(key)) {
            return weight.get(key);
        } else {
            return Integer.parseInt(key);
        }
    }

}
