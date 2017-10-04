package pers.donnie.util;

import org.springframework.util.CollectionUtils;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by liyudong on 2017/9/21.
 */
public class MyStringsUtil {

    /**
     * Determine whether the given object is empty.
     * <p>This method supports the following object types.
     * <ul>
     * <li>{@code Array}: considered empty if its length is zero</li>
     * <li>{@link CharSequence}: considered empty if its length is zero</li>
     * <li>{@link Collection}: delegates to {@link Collection#isEmpty()}</li>
     * <li>{@link Map}: delegates to {@link Map#isEmpty()}</li>
     * </ul>
     * <p>If the given object is non-null and not one of the aforementioned
     * supported types, this method returns {@code false}.
     * @param obj the object to check
     * @return {@code true} if the object is {@code null} or <em>empty</em>
     * @since 4.2
     * @see ObjectUtils#isEmpty(Object[])
     * @see StringUtils#hasLength(CharSequence)
     * @see StringUtils#isEmpty(Object)
     * @see CollectionUtils#isEmpty(java.util.Collection)
     * @see CollectionUtils#isEmpty(java.util.Map)
     */
    @SuppressWarnings("rawtypes")
    public static boolean isEmpty(Object obj) {
        if (obj == null) {
            return true;
        }

        if (obj.getClass().isArray()) {
            return Array.getLength(obj) == 0;
        }
        if (obj instanceof CharSequence) {
            return ((CharSequence) obj).length() == 0;
        }
        if (obj instanceof Collection) {
            return ((Collection) obj).isEmpty();
        }
        if (obj instanceof Map) {
            return ((Map) obj).isEmpty();
        }

        // else
        return false;
    }

    /**
     * 判断是否为数字
     */
    public static boolean isNum(String s){
        Pattern pattern = Pattern.compile("[1-9]{1}\\d*");
        Matcher matcher = pattern.matcher(s.trim());
        return matcher.matches();
    }

    /**
     * 讲对象转化为
     * @return
     */
    public static String objToStr(Object o){
        if(!isEmpty(o)){
            return o.toString();
        }
        return "";
    }



}
