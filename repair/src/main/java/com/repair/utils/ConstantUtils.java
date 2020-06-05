package com.repair.utils;

//常量工具类
public interface ConstantUtils {
    class Cookie {

        //Cookie最长存活时间(单位：秒)
        public static final int COOKIE_MAX_TIME = 3*24*3600;
    }

    class Mail {
        public static final String FROM_MAIL="nxj1522036939@163.com";
    }

    class Page {

        //一页展示多少条内容
        public static final Integer PAGESIZE = 10;

        //页吗展示数量
        public static final Integer PAGESNUM = 4;
    }

    class Path {

        //虚拟目录地址
        public static final String DIRPATH = "opt/Image";

        //二维码
        public static final String QRCODEPATH = "/QRCODE";
    }
}


