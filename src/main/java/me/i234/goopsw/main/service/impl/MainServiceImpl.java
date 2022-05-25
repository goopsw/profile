package me.i234.goopsw.main.service.impl;

import me.i234.goopsw.main.service.MainService;
import org.egovframe.rte.fdl.cmmn.EgovAbstractServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;

@Service("mainService")
public class MainServiceImpl extends EgovAbstractServiceImpl implements MainService {

    @Resource(name = "mainMapper")
    MainMapper mainMapper;

    @Override
    public int selectMainTestCnt(HashMap paramMap) throws Exception {
        return mainMapper.selectMainTestCnt(paramMap);
    }
}
