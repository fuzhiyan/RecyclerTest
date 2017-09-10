package com.baway.fuzhiyan.recyclertest.bean;

import com.google.gson.Gson;

import java.util.List;

/**
 * Created by Administrator on 2017/9/10.
 * time:
 * author:付智焱
 */

public class MyBean {

    public List<美女Bean> 美女;

    public static MyBean objectFromData(String str) {

        return new Gson().fromJson(str, MyBean.class);
    }

    public static class 美女Bean {
        /**
         * adtype : 0
         * boardid : comment_bbs
         * clkNum : 0
         * danmu : 1
         * digest : 心变得很孤独，仅仅想的只是你  纯洁清新灵动娇嫩小女生头像
         * docid : COOR7GI190017GI2
         * downTimes : 71
         * hasAD : 1
         * img : http://dmr.nosdn.127.net/8S4RCX_RZiwQ2kiecZgeEg==/6896093023014049730.jpg
         * imgType : 0
         * imgsrc : http://dmr.nosdn.127.net/8S4RCX_RZiwQ2kiecZgeEg==/6896093023014049730.jpg
         * imgsum : 0
         * picCount : 0
         * pixel : 300*300
         * program : HY
         * prompt : 成功为您推荐20条新内容
         * rank : 0
         * recNews : 0
         * recType : 0
         * refreshPrompt : 0
         * replyCount : 4
         * replyid : COOR7GI190017GI2
         * source : 唯美图片
         * title : 心变得很孤独，仅仅想的只是你  纯洁清新灵动娇嫩小女生头像
         * upTimes : 255
         */

        public int adtype;
        public String boardid;
        public int clkNum;
        public int danmu;
        public String digest;
        public String docid;
        public int downTimes;
        public int hasAD;
        public String img;
        public int imgType;
        public String imgsrc;
        public int imgsum;
        public int picCount;
        public String pixel;
        public String program;
        public String prompt;
        public int rank;
        public int recNews;
        public int recType;
        public int refreshPrompt;
        public int replyCount;
        public String replyid;
        public String source;
        public String title;
        public int upTimes;

        public static 美女Bean objectFromData(String str) {

            return new Gson().fromJson(str, 美女Bean.class);
        }
    }
}
