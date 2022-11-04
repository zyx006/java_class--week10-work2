package cn.czyx007.week10.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;
import java.util.Set;

/**
 * @author : 张宇轩
 * @createTime : 2022/11/4 - 18:40
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Today {
    private String city;
    private String date_y;
    private String week;
    private String temperature;
    private String weather;
    private Map<String, String> weather_id;
    private String wind;
    private String dressing_index;
    private String dressing_advice;
    private String uv_index;
    private String wash_index;
    private String travel_index;
    private String exercise_index;
    private String drying_index;

    public String displayWeatherId(){
        StringBuilder weatherIdStr = new StringBuilder();
        weatherIdStr.append("\t\t\t\"weather_id\": {\n");
        Set<String> keys = weather_id.keySet();
        int size = keys.size();
        int cnt = 0;
        for (String key : keys) {
            weatherIdStr.append("\t\t\t\t\"").append(key).append("\": ");
            weatherIdStr.append("\"").append(weather_id.get(key)).append("\"");
            if (cnt++ < size-1){
                weatherIdStr.append(",");
            }
            weatherIdStr.append("\n");
        }
        weatherIdStr.append("\t\t\t},\n");
        return weatherIdStr.toString();
    }

    @Override
    public String toString() {
        return "\t\t\"today\": {\n" +
                "\t\t\t\"city\": " + "\"" + city + "\",\n" +
                "\t\t\t\"date_y\": " + "\"" + date_y + "\",\n" +
                "\t\t\t\"week\": " + "\"" + week + "\",\n" +
                "\t\t\t\"temperature\": " + "\"" + temperature + "\",\n" +
                "\t\t\t\"weather\": " + "\"" + weather + "\",\n" +
                displayWeatherId() +
                "\t\t\t\"wind\": " + "\"" + wind + "\",\n" +
                "\t\t\t\"dressing_index\": " + "\"" + dressing_index + "\",\n" +
                "\t\t\t\"dressing_advice\": " + "\"" + dressing_advice + "\",\n" +
                "\t\t\t\"uv_index\": " + "\"" + uv_index + "\",\n" +
                "\t\t\t\"wash_index\": " + "\"" + wash_index + "\",\n" +
                "\t\t\t\"travel_index\": " + "\"" + travel_index + "\",\n" +
                "\t\t\t\"exercise_index\": " + "\"" + exercise_index + "\",\n" +
                "\t\t\t\"drying_index\": " + "\"" + drying_index + "\"\n" +
                "\t\t},\n";
    }
}
