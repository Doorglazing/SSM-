package com.lz.dao;

import com.lz.domain.Goods01;

public interface GoodsDao {

    int updateGoods(Goods01 goods);

    Goods01 selectGoods(int id);


    int insertInto(Goods01 goods);
}
