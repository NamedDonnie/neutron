package pers.donnie.general;

import org.junit.Test;
import pers.donnie.model.User;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by liyudong on 2017/9/21.
 */
public class GeneralTest {
    /**
     * map内没有东西也可以get()
     * 如果map=null 则会出空指针异常
     */
    @Test
    public void testMap() {
        Map map = new HashMap();
        map.get("fdasdf");
    }


    @Test
    public void hello() {

        Runnable runnable = () -> System.out.println("hello") ;
        runnable.run();
        User user = new User();
        User[] users= new User[10];
        Object[] objects = new Object[1];
    }


}
