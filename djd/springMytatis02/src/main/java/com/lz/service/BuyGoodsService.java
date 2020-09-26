package com.lz.service;

import com.lz.domain.Goods01;

public interface BuyGoodsService {
    // 购买商品的方法
    void buy(int goodId, int nums);

    void insertInto(Goods01 goods01);
}
