package com.github.myself.utils.common;

/**
 * Created by MySelf on 2019/1/31.
 */
public enum Types {

    READ("阅读产品与商业咨询",1),
    WRITE("发表文章",2),
    FITNESS("健身运动",3),
    ANSWER("解答粉丝问题",4),
    PARTY("与朋友聚会",5),
    MOVIE("看电影",6),
    GAME("老年人电竞",7),
    TUTORIAL("录制教程",8),
    KTV("唱K",9),
    Recording("记录",10);

    private String name;

    private Integer code;

    Types(String name, Integer code) {
        this.name = name;
        this.code = code;
    }
}
