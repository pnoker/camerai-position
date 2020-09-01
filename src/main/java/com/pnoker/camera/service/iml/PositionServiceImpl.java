package com.pnoker.camera.service.iml;

import com.alibaba.fastjson.JSON;
import com.pnoker.camera.bean.Position;
import com.pnoker.camera.service.PositionService;
import lombok.extern.slf4j.Slf4j;
import org.jsoup.Jsoup;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author pnoker
 */
@Slf4j
@Service
public class PositionServiceImpl implements PositionService {

    @Override
    public List<Position> getPositionFromWeb() {
        String url = "http://www.jinjing365.com/index.asp";

        String content = null;
        try {
            content = Jsoup.connect(url).get().body().getElementsByTag("script").get(3).html();
        } catch (IOException e) {
            return new ArrayList<>();
        }
        int start = content.indexOf("var capitals = [{") + 14;
        int end = content.indexOf("var title = '详细';");

        return JSON.parseArray(content.substring(start, end).trim(), Position.class);
    }
}
