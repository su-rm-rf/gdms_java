package com.yuhualing.www.gdms.dao.impl;

import com.yuhualing.www.gdms.dao.IShopDao;
import com.yuhualing.www.gdms.entity.Shop;
import com.yuhualing.www.gdms.util.StringUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * Created by macbook on 17/4/20.
 */
@Repository("shopDao")
public class ShopDaoImpl implements IShopDao {

    @Resource
    private SessionFactory sessionFactory;

    private Session getSession() {
        return sessionFactory.getCurrentSession();
    }

    @Override
    public Serializable saveShop(Shop shop) {
        return this.getSession().save(shop);
    }

    @Override
    public void updateShop(Shop shop) {
        this.getSession().update(shop);
    }

    @Override
    public void deleteShopById(String shopId) {
        Shop shop = this.queryShopById(shopId);
        shop.setDelete_flag("Y");
        this.getSession().update(shop);
    }

    @Override
    public Shop queryShopById(String shopId) {
        return (Shop) this.getSession().createQuery("from Shop where shop_id = ? and delete_flag = ?")
                .setParameter(0, shopId).setParameter(1, "N").uniqueResult();
    }

    @Override
    public List<Shop> queryShopList(Shop shop) {
        StringBuffer sql = new StringBuffer("select * from shop where delete_flag = 'N' ");

        if(!StringUtil.isBlank(shop.getShopName())) {
            sql.append(" and shop_name like '%").append( shop.getShopName() ).append("%'");
        }
        if(!StringUtil.isBlank(shop.getShopCity())) {
            sql.append(" and shop_city = '").append( shop.getShopCity() ).append("'");
        }
        if(!StringUtil.isBlank(shop.getShopAddress())) {
            sql.append(" and shop_address like '%").append( shop.getShopAddress() ).append("%'");
        }

        return this.getSession().createNativeQuery(String.valueOf(sql), Shop.class).getResultList();
    }
}
