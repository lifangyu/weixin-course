package com.jiezh.pub;

/**
 * 系统变量
 * 
 * @author liangds
 *
 */
public class Env {

    public static final String WEB_ROOT = "/course";

    public static final String ROOT = "course";

    public static String getWebRoot() {
        return WEB_ROOT;
    }

    /**
     * 分页查询列表显示条数
     */
    public static final int PAGE_SIZE = 10;

    public static final String SUCCESS = "SUCCESS";

    public static final String UPLOAD_CODE_IMG = "img";
    public static final String UPLOAD_CODE_FILE = "file";

    /**
     * 图片类型位置:0:默认、1：焦点图、2:推荐
     */
    public static final String WEIXIN_COURSE_TYPE_LOCATION_0 = "0";
    public static final String WEIXIN_COURSE_TYPE_LOCATION_1 = "1";
    public static final String WEIXIN_COURSE_TYPE_LOCATION_2 = "2";

    /**
     * 订单状态：1：预支付；2：支付中；3：已付款；4：完结
     */
    public static final String WEIXIN_ORDERS_STATUS_1 = "1";
    public static final String WEIXIN_ORDERS_STATUS_2 = "2";
    public static final String WEIXIN_ORDERS_STATUS_3 = "3";
    public static final String WEIXIN_ORDERS_STATUS_4 = "4";

    /**
     * 是否免费:1：免费；2：收费
     */
    public static final String WEIXIN_COURSE_IS_FREE_1 = "1";
    public static final String WEIXIN_COURSE_IS_FREE_2 = "2";

    /**
     * 默认拉新奖励金额
     */
    public static final String WEIXIN_PROMOTERMONEY = "1";

    public static void main(String[] args) {

        Double s1 = Double.valueOf("0.01") * 100;


        // String s2 = s1.substring(0, s1.indexOf(".")) + s1.substring(s1.indexOf(".")+1);


        System.out.println(s1.intValue());

        // System.out.println(new Date().getTime());
    }


}
