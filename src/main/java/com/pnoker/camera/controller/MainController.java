package com.pnoker.camera.controller;

import com.pnoker.camera.bean.Position;
import com.pnoker.camera.service.PositionService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author pnoker
 */
@Controller
public class MainController {

    @Resource
    private PositionService positionService;

    @GetMapping(value = "/")
    public String index() {
        return "index";
    }

    @ResponseBody
    @GetMapping(value = "/positions")
    public List<Position> positions() {
        return positionService.getPositionFromWeb();
    }
}
