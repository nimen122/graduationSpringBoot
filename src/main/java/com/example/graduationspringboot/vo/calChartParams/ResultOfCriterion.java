package com.example.graduationspringboot.vo.calChartParams;

import lombok.Data;

import java.util.List;

@Data
public class ResultOfCriterion {

    private boolean isFit;
    private String msg;
    private List<Integer> errorPointIndex;


}
