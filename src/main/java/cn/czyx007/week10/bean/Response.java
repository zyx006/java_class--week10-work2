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
public class Response {
    private String resultcode;
    private String reason;
    private Result result;
    private Integer error_code;

    @Override
    public String toString() {
        return "{\n" +
                "\t\"resultcode\": " + "\"" + resultcode + "\",\n" +
                "\t\"reason\": " + "\"" + reason + "\",\n" +
                result +
                "\t\"error_code\": " + error_code + "\n" +
                "}";
    }
}
