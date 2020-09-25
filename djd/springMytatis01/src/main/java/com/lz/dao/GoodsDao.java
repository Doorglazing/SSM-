package com.lz.dao;

import com.lz.domain.Goods;

public interface GoodsDao {

    int updateGoods(Goods goods);

    Goods selectGoods(int id);
}
