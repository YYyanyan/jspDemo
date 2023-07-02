
import java.util.ArrayList;
import java.util.List;

public class Concert {
    private String time;  //演唱会的时间
    private String region;  //演唱会的地区
    private int num;  //巡演的场次

    public Concert() { }

    public Concert (int num, String time, String region) {
        this.num = num;
        this.region = region;
        this.time = time;
    }

    public List getConcertList(String year) {
        List concertList = new ArrayList();
        if(year.equals("2018")) {
            concertList.add(new Concert(1,"2018-10-13","北京-五棵松体育馆"));
            concertList.add(new Concert(2,"2018-10-14","北京-五棵松体育馆"));
            concertList.add(new Concert(3,"2018-11-02","澳门-金光综艺馆"));
            concertList.add(new Concert(4,"2018-12-22","深圳-深圳湾体育中心"));
        }
        else if(year.equals("2019")) {
            concertList.add(new Concert(5,"2019-01-19","成都-成都大魔方"));
            concertList.add(new Concert(6,"2019-04-06","台北-小巨蛋"));
            concertList.add(new Concert(7,"2019-04-13","广州-广州宝能体育中心"));
            concertList.add(new Concert(8,"2019-04-27","南京-青奥体育公园体育馆"));
            concertList.add(new Concert(9,"2019-05-11","新加坡-室内体育馆"));
            concertList.add(new Concert(10,"2019-6-08","济南-济南奥体中心体育馆"));
            concertList.add(new Concert(11,"2019-6-22","苏州-苏州奥体中心体育馆"));
            concertList.add(new Concert(12,"2019-6-29","福州-海峡奥体综合体育馆"));
            concertList.add(new Concert(13,"2019-7-13","马来西亚-云顶云星剧场"));
            concertList.add(new Concert(14,"2019-7-14","马来西亚-云顶云星剧场"));
            concertList.add(new Concert(15,"2019-7-26","大连-大连体育中心体育馆"));
            concertList.add(new Concert(16,"2019-8-17","重庆-华熙文化体育中心"));
            concertList.add(new Concert(17,"2019-11-16","佛山-国际体育文化演艺中心"));
            concertList.add(new Concert(18,"2019-11-23","宁波-奥体中心体育馆"));
            concertList.add(new Concert(19,"2019-11-30","长沙-国际会展中心"));
            concertList.add(new Concert(20,"2019-12-14","上海-梅赛德斯奔驰体育中心"));
            concertList.add(new Concert(21,"2019-12-15","上海-梅赛德斯奔驰体育中心"));
            concertList.add(new Concert(22,"2019-12-22","沈阳-辽宁省体育馆"));
        } else if(year.equals("2020")) {
            concertList.add(new Concert(23,"2020-01-01","无锡-无锡市体育馆"));
            concertList.add(new Concert(24,"2020-04-28","英国-伦敦皇家阿尔伯特音乐厅"));
        }
        return concertList;
    }

    public String toString() {
        return "第"+this.num+"场 - " + this.time + " :    " + this.region + "\n";
    }
}