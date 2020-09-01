package com.pnoker.camera.service;

import com.pnoker.camera.bean.Position;

import java.io.IOException;
import java.util.List;

/**
 * @author pnoker
 */

public interface PositionService {

    List<Position> getPositionFromWeb();
}
