package com.parasol.core.dao.experts;

import java.util.List;
import java.util.Map;

public interface Experts_number_messageMapper {

    String selectByNumber_message(Integer id);
    
    
    List<Map<Integer,String>> selectNumber_message();

    
}