package pers.donnie.service.util;

import com.github.pagehelper.PageHelper;
import pers.donnie.util.MyStringsUtil;

import java.util.Map;

/**
 * Created by liyudong on 2017/9/21.
 */
public class PageUtil {

    public static void getPageHelper(Map<String, Object> map) {

        Integer pageNum = 1;
        Integer pageSize = 3;
        if (!MyStringsUtil.isEmpty(map.get("pageNum"))) {
            //判断pageNum是否为数字
            if (MyStringsUtil.isNum(map.get("pageNum").toString())) {
                pageNum = Integer.parseInt(map.get("pageNum").toString());
            }
        }
        if (!MyStringsUtil.isEmpty(map.get("pageSize"))) {
            if (MyStringsUtil.isNum(map.get("pageSize").toString())) {
                pageSize = Integer.parseInt(map.get("pageSize").toString());
            }
        }
        PageHelper.startPage(pageNum, pageSize, "id");

    }
}
