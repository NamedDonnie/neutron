package pers.donnie.util;

import java.util.Map;
import java.util.Set;

/**
 * Created by liyudong on 2017/9/21.
 */
public class SearchUtil {

    /**
     * for thymeleaf page
     * @param params
     * @return
     */
    public static String getSearchUri(Map<String, Object> params) {
        StringBuilder builder = new StringBuilder();
        if (params != null && params.size() > 0) {
            Set<String> keys = params.keySet();
            for (String key : keys) {
                if(key.equals("pageSize")&&params.get(key).getClass().isArray()){
                    String[] values = ( String[] )params.get(key);
                    builder.append("&").append(key).append("=").append(values[0].toString());
                }else if(!MyStringsUtil.isEmpty(params.get(key))&&!key.equals("pageNum")){
                    builder.append("&").append(key).append("=").append(params.get(key).toString());
                }

            }
        }
        return builder.toString();
    }
}
