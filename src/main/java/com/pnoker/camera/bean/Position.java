package com.pnoker.camera.bean;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.List;

/**
 * @author pnoker
 */
@Data
@NoArgsConstructor
@Accessors(chain = true)
public class Position implements Serializable {
    private static final long serialVersionUID = 1L;

    private String name;

    @JSONField(alternateNames = "aa")
    private int type;

    @JSONField(alternateNames = "center")
    private List<Double> position;

}
