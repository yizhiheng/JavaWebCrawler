package us.codecraft.webmagic.processor.example;

/**
 * Created by Zhiheng on 2015-09-01.
 */
import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.ResultItems;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.Spider;
import us.codecraft.webmagic.processor.PageProcessor;

import java.util.ArrayList;
import java.util.List;

public class CustomizedPageProcessor implements PageProcessor  {

    private Site site = Site.me()
            .setRetryTimes(3)
            .setSleepTime(1000);

    @Override
    public void process(Page page) {
        page.putField("name", page.getHtml().css("h1 h1.lemmaTitle","innerHTML").toString());

    }
    @Override
    public Site getSite() {
        return site;
    }

    public static void main(String[] args) {
        System.out.println("HelloWorld");
    }
}
