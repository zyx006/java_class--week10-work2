package cn.czyx007.week10.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;
import java.util.Set;

/**
 * @author : 张宇轩
 * @createTime : 2022/11/4
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class FutureDay {
    private String temperature;
    private String weather;
    private Map<String, String> weather_id;
    private String wind;
    private String week;
    private String date;

    public String displayWeatherId(){
        StringBuilder weatherIdStr = new StringBuilder();
        weatherIdStr.append("\t\t\t\t\"weather_id\": {\n");
        Set<String> keys = weather_id.keySet();
        int size = keys.size();
        int cnt = 0;
        for (String key : keys) {
            weatherIdStr.append("\t\t\t\t\t\"").append(key).append("\": ");
            weatherIdStr.append("\"").append(weather_id.get(key)).append("\"");
            if (cnt++ < size-1){
                weatherIdStr.append(",");
            }
            weatherIdStr.append("\n");
        }
        weatherIdStr.append("\t\t\t\t},\n");
        return weatherIdStr.toString();
    }

    @Override
    public String toString() {
        return "\t\t\t{\n" +
                "\t\t\t\t\"temperature\": " + "\"" + temperature + "\",\n" +
                "\t\t\t\t\"weather\": " + "\"" + weather + "\",\n" +
                displayWeatherId() +
                "\t\t\t\t\"wind\": " + "\"" + wind + "\",\n" +
                "\t\t\t\t\"week\": " + "\"" + week + "\",\n" +
                "\t\t\t\t\"date\": " + "\"" + date + "\"\n" +
                "\t\t\t}";
    }
}
