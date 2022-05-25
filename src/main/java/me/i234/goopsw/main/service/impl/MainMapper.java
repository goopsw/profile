package me.i234.goopsw.main.service.impl;

import org.egovframe.rte.psl.dataaccess.mapper.Mapper;

import java.util.HashMap;

@Mapper("mainMapper")
public interface MainMapper {

    int selectMainTestCnt(HashMap paramMap) throws Exception;
}
