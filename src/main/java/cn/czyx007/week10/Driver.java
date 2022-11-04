package cn.czyx007.week10;

import cn.czyx007.week10.bean.*;
import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.List;

/**
 * @author : 张宇轩
 * @createTime : 2022/11/4 - 18:53
 */
public class Driver {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new FileReader("src/main/resources/weather.json"))) {
            StringBuilder jsonStr = new StringBuilder();
            String aLine;
            while ((aLine= br.readLine()) != null){
                jsonStr.append(aLine);
            }

            Response response = new Gson().fromJson(jsonStr.toString(), Response.class);
            Result result = response.getResult();
            Sk sk = result.getSk();
            Today today = result.getToday();
            List<FutureDay> future = result.getFuture();

//            System.out.println(response);
//            System.out.println(sk);
//            System.out.println(today);
//            future.forEach(System.out::println);

            System.out.println("当前温度：" + sk.getTemp());
            System.out.println("今日天气：" + today.getWeather());
            System.out.println("穿衣指数：" + today.getDressing_index());
            int dayCnt = 2;
            FutureDay futureDay = future.get(dayCnt - 1);
            System.out.println("未来的第二天的温度：" + futureDay.getTemperature());
            System.out.println("未来的第二天的天气：" + futureDay.getWeather());

        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
