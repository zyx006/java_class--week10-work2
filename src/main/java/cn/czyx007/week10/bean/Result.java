package cn.czyx007.week10.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author : 张宇轩
 * @createTime : 2022/11/4
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Result {
    private Sk sk;
    private Today today;
    private List<FutureDay> future;

    public String displayFuture(){
        StringBuilder futureStr = new StringBuilder();
        futureStr.append("\t\t\"future\": [\n");
        for (int i = 0; i < future.size(); i++) {
            futureStr.append(future.get(i));
            if(i < future.size()-1){
                futureStr.append(",");
            }
            futureStr.append("\n");
        }
        futureStr.append("\t\t]\n");
        return futureStr.toString();
    }

    @Override
    public String toString() {
        return "\t\"result\": {\n" +
                sk +
                today +
                displayFuture() +
                "\t},\n";
    }
}
