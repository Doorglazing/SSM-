package com.lz.service.impl;

import com.lz.dao.GoodsDao;
import com.lz.dao.SaleDao;
import com.lz.domain.Goods01;
import com.lz.domain.Sales01;

import com.lz.execp.NotClassException;
import com.lz.service.BuyGoodsService;


public class BuyGoodServiceImpl implements BuyGoodsService {
    private GoodsDao gd;
    private SaleDao sd;
    @Override
    public void buy(int goodId, int nums) {
        // 记录销售信息
        Sales01 sales = new Sales01();
        sales.setGid(goodId);
        sales.setNums(nums);
        sd.insertSale(sales);
        // 更新库存
        Goods01 goods = gd.selectGoods(goodId);
        if(goods == null){
            throw new NullPointerException("编号是+"+ goodId +"商品不存在");
        } else if(goods.getAmount() < nums){
            throw new NotClassException("商品库存不足");
        }
        // 修改库存
        Goods01 goods1 = new Goods01();
        goods1.setId(goodId);
        goods1.setAmount(nums);
        gd.updateGoods(goods1);
    }
    public void setGd(GoodsDao gd) {
        this.gd = gd;
    }

    public void setSd(SaleDao sd) {
        this.sd = sd;
    }

}
