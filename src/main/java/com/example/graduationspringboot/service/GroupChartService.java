package com.example.graduationspringboot.service;

import com.example.graduationspringboot.vo.Result;
import com.example.graduationspringboot.vo.params.DelGroupChartParam;
import com.example.graduationspringboot.vo.params.GroupChartParam;

public interface GroupChartService {

    Result Xbar(GroupChartParam groupChartParam);

    Result R(GroupChartParam groupChartParam);

    Result S(GroupChartParam groupChartParam);

    Result XbarR(GroupChartParam groupChartParam);

    Result XbarS(GroupChartParam groupChartParam);

    Result delXbar(DelGroupChartParam delGroupChartParam);

    Result delR(DelGroupChartParam delGroupChartParam);

    Result delXbarR(DelGroupChartParam delGroupChartParam);

    Result delS(DelGroupChartParam delGroupChartParam);

    Result delXbarS(DelGroupChartParam delGroupChartParam);
}
