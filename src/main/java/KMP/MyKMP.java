package KMP;

import java.util.HashSet;
import java.util.Set;

/**
 * @Classname MyKMP
 * @Description TODO
 * @Date 2022/3/23 0023 16:13
 * @Created by TF014268
 */
public class MyKMP {

    /**
     * 获取匹配值数组
     * @param str2
     */
    public static int[] matchingTable(String str2){
        int[] shuZhu = new int[str2.length()];
        int count = 0;
        for(int i=0;i<str2.length();i++){
            count++;
            if(i==0){
                shuZhu[0] = 0;
                continue;
            }

            /*
            先截取字符串
            比如ABCDABD
            第二轮循环时  应该取的是AB
             */
            String msg = str2.substring(0,i+1);

            //得到前缀
            String pre = msg.substring(0,i);
            Set<String> preSet = preChaiFen(pre);

            //得到后缀
            String suf = msg.substring(1);
            Set<String> sufSet = sufChaiFen(suf);

            //公有字符串的长度
            int chang = 0;
            for(String str : preSet){
                if(sufSet.contains(str) && str.length()>chang){
                    chang = str.length();
                }
            }
            //把公有字符串的长度放入对应的位置
            shuZhu[i] = chang;
        }
        System.out.println("生成匹配值表的循环次数：" + count);
        return shuZhu;
    }

    /**
     * 前缀拆分
     * @param str
     */
    public static Set<String> preChaiFen(String str){
        Set<String> preSet = new HashSet<>();
        for(int i=0;i<str.length();i++){
            preSet.add(str.substring(0,i+1));
        }
        return preSet;
    }

    /**
     * 后缀拆分
     * @param str
     */
    public static Set<String> sufChaiFen(String str){
        Set<String> sufSet = new HashSet<>();
        for(int i=0;i<str.length();i++){
            sufSet.add(str.substring(i));
        }
        return sufSet;
    }

    /**
     * 根据KMP算法找寻str2在str1中出现的位置
     * @param str1 被找寻的字符串
     * @param str2 要找寻的字符串
     * @param str2Shu 要找寻的字符串的匹配值数组
     * @return 返回出现的位置
     */
    public static int getFirstIndexByKMP(String str1,String str2,int[] str2Shu){
        int i=0;
        int j=0;
        int count = 0;
        while(i<str1.length() && j<str2.length()){
            System.out.println("str1下标开始的位置=============" + i);
            count++;
            //值相等，继续判断下一位
            char a1 = str1.charAt(i);
            char a2 = str2.charAt(j);
            if(a1==a2){
                if(j==str2.length()-1){
                    //已经到了最后一位了，最后一位也匹配
                    System.out.println("找str2循环的次数：" + count);
                    System.out.println();
                    return i-j;
                }
                i++;
                j++;
                continue;
            }

            //值不一样的情况
            if(j==0){
                //当str2的第一位就不匹配时，直接i++,从str1的下一位开始判断
                i++;
                continue;
            }
            /*
            移动的位置 = 已经匹配的长度j  减去  最后一个匹配的字符（j-1）在匹配表中的值
             */
            int yi = j - str2Shu[j-1];
            System.out.println("已经匹配位数=" + j);
            System.out.println("要移动的位数=" + yi);
            System.out.println("str1的位置=当前位置" + i + "-已经匹配的位数" + j + "+要移动的位数" + yi + " = " + (i - j + yi));
            //当前i的位置要 先减去 已经匹配的长度 ；再加上 要移动的位置
            i = i - j + yi;
            //str2的匹配位置重置
            j = 0;

        }
        System.out.println("找str2循环的次数：" + count);
        //找不到返回-1
        return -1;
    }

    public static void main(String[] args) {
        //             0123456789
        String str1 = "BBC ABCDAB ABCDABCDABDE";
        //             0123456
        String str2 = "ABCDABD";
        System.out.println("str1的长度=" + str1.length());
        System.out.println("str2的长度=" + str2.length());
        System.out.println("---------求str2的匹配值表---------");
        int[] shuZhu = matchingTable(str2);

        for(int i=0;i<str2.length();i++){
            System.out.print(str2.charAt(i) + "\t");
        }
        System.out.println();
        for(int a : shuZhu){
            System.out.print(a + "\t");
        }
        System.out.println();
        System.out.println("--------------------");
        System.out.println("str2在str1中的开始位置=" + getFirstIndexByKMP(str1,str2,shuZhu));
    }
}
