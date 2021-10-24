package the_five;

import java.util.Scanner;

public class five_28 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        System.out.println("输入年份和代表该年第一天是周几的数字");
        int year = input.nextInt();
        int day = input.nextInt();

        // 计算指定年份1月1号到
        String str = "";  //定义字符串时候记得初始化
        String str2 = "";
        for (int month = 1; month <= 12 ; month++){
            // 月份天数（不考虑闰年）
            switch (month){
                case 1: {day += 0; str += "January 1, ";} break;
                case 2: {day += 31; str += "Febrary 1, ";} break;
                case 3: {day += 28; str += "March 1, ";} break;
                case 4: {day += 31; str += "April 1, ";} break;
                case 5: {day += 30; str += "May 1, ";} break;
                case 6: {day += 31; str += "June 1, ";} break;
                case 7: {day += 30; str += "July 1, ";} break;
                case 8: {day += 31; str += "August 1, ";} break;
                case 9: {day += 31; str += "September 1, ";} break;
                case 10: {day += 30; str += "November 1, ";} break;
                case 11: {day += 31; str += "October 1, ";} break;
                case 12: {day += 30; str += "December 1, ";}
            }
            // 判断闰年+month大于等于2则day+1
            if (((year % 4 == 0) && (year % 100 != 0)) || ((year % 400 == 0) && (year % 100 == 0))){
                if (month != 1&&month != 2)
                    day +=1;
            }
            // 求是周几
            int week = day % 7;
            switch (week){
                case 1:str2 = " is Monday";break;
                case 2:str2 = " is Tuesday";break;
                case 3:str2 = " is Wednesday";break;
                case 4:str2 = " is Thurday";break;
                case 5:str2 = " is Friday";break;
                case 6:str2 = " is Saturday";break;
                case 0:str2 = " is Sunday";break;
            }
            // 输出
            System.out.println(str + year + str2);
            str = "";
            str2 = "";
        }


	}

}
