package cn.czyx007.week10.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author : 张宇轩
 * @createTime : 2022/11/4
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Sk {
    private String temp;
    private String wind_direction;
    private String wind_strength;
    private String humidity;
    private String time;

    @Override
    public String toString() {
        return "\t\t\"sk\": {\n" +
                "\t\t\t\"temp\": " + "\"" + temp + "\",\n" +
                "\t\t\t\"wind_direction\": " + "\"" + wind_direction + "\",\n" +
                "\t\t\t\"wind_strength\": " + "\"" + wind_strength + "\",\n" +
                "\t\t\t\"humidity\": " + "\"" + humidity + "\",\n" +
                "\t\t\t\"time\": " + "\"" + time + "\"\n" +
                "\t\t},\n";
    }
}
