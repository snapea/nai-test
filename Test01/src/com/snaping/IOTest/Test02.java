package com.snaping.IOTest;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test02 {
    public static void main(String[] args) throws IOException {
        /*
         * 获取姓氏: https://hanyu.baidu.com/shici/detail?pid=0b2f26d4c0ddb3ee693fdb1137ee1b0d&from=kg0
         * 获取男生名字: http://www.haoming8.cn/baobao/10881.html
         * 获取女生名字: http://www.haoming8.cn/baobao/7641.html
         * */

        // 爬取数据
        String nameUrl = "https://hanyu.baidu.com/shici/detail?pid=0b2f26d4c0ddb3ee693fdb1137ee1b0d&from=kg0";
        String nameBoyUrl = "https://hanyu.baidu.com/shici/detail?pid=0b2f26d4c0ddb3ee693fdb1137ee1b0d&from=kg0";
        String nameGirlUrl = "http://www.haoming8.cn/baobao/7641.html";


        String nameStr = webCrawler(nameUrl);
        String nameBoyStr = webCrawler(nameBoyUrl);
        String nameGirlStr = webCrawler(nameGirlUrl);

        ArrayList<String> familyTmpList = getData(nameStr, "(.{4})(，|。)", 1);
        ArrayList<String> nameBoyTmpList = getData(nameBoyStr, "([\\u4E00-\\u9FA5]{2})(、|。)", 1);
        ArrayList<String> nameGirlTmpList = getData(nameGirlStr, "(.. ){4}..", 0);

        ArrayList<String> familyList = new ArrayList<>();
        ArrayList<String> boyNameList = new ArrayList<>();
        ArrayList<String> girlNameList = new ArrayList<>();
        for (String s : familyTmpList) {
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                familyList.add(c + " ");
            }
        }

        for (String s : nameBoyTmpList) {
            if (!boyNameList.contains(s)) {
                boyNameList.add(s);
            }
        }


        for (String s : nameGirlTmpList) {
            String[] split = s.split(" ");
            for (String name : split) {
                girlNameList.add(name);
            }
        }

        getName(familyList, boyNameList, girlNameList, 3,3);
    }

    private static ArrayList<String> getName (ArrayList<String> familyList,ArrayList<String> boyNameList,ArrayList<String> girlNameList, int boyCount, int girlCount) {

        ArrayList<String> nameList = new ArrayList<>();
        // 生成不重复的名字
        HashSet<String> boys = new HashSet<>();
        HashSet<String> girl = new HashSet<>();
        while (true){
            if (boyCount == boys.size()) {
                break;
            }
            Collections.shuffle(familyList);
            Collections.shuffle(boyNameList);
            boys.add(familyList.get(0) + boyNameList.get(0));
        }

        while (true){
            if (girlCount == girl.size()) {
                break;
            }
            Collections.shuffle(familyList);
            Collections.shuffle(girlNameList);
            girl.add(familyList.get(0) + girlNameList.get(0));
        }


        System.out.println(girl);
        System.out.println(boys);


        return new ArrayList<>();
    }

    private static ArrayList<String> getData(String str, String regex, int index) {
        ArrayList<String> list = new ArrayList<>();
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);

        while (matcher.find()) {
            list.add(matcher.group(index));
        }

        return list;
    }

    public static String webCrawler(String net) throws IOException {
        StringBuilder stringBuilder = new StringBuilder();

        URL url = new URL(net);
        URLConnection conn = url.openConnection();
        // 将字节流转换为字符流
        InputStreamReader inputStreamReader = new InputStreamReader(conn.getInputStream());
        int ch;
        while ((ch = inputStreamReader.read()) != -1) {
            stringBuilder.append((char) ch);
        }
        inputStreamReader.close();

        return stringBuilder.toString();
    }

}
