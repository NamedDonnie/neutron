package pers.donnie.bean;

/**
 * Created by liyudong on 2017/9/28.
 */
public class CommunityParam {

    private Integer id;

    /**
     * 小区名称
     */
    private String name;

    /**
     * 小区标识
     */
    private String number;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
