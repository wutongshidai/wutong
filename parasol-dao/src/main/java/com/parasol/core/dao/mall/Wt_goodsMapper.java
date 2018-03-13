package com.parasol.core.dao.mall;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.parasol.core.mall.Wt_goods;

public interface Wt_goodsMapper {

    int deleteByPrimaryKey(Integer gdId);

    int insert(Wt_goods record);

    int insertSelective(Wt_goods record);

    Wt_goods selectByPrimaryKey(Integer gdId);

    int updateByPrimaryKeySelective(Wt_goods record);

    int updateByPrimaryKey(Wt_goods record);
    
    List<Wt_goods> selectGoodsByClass(Integer catId);
    
    List<Wt_goods> selectGoodsByAllClass(@Param("startrow") Integer page ,  @Param("catId")  Integer catId);
    
    List<Wt_goods> selectGoodsByThreeClass(@Param("startrow") Integer page ,  @Param("catSonid") Integer catSonid);
    
    List<Wt_goods> selectGoodsAll(Integer startrow);
    
    List<Wt_goods> selectByName(@Param("startrow") Integer startrow ,@Param("gdName")String gdName);
    
    List<Wt_goods> selectOneClass(@Param("startrow") Integer startrow , @Param("catParentid") Integer catParentid);
    
    List<Wt_goods> selectThreeClass(Integer catSonid);
    
    List<Wt_goods> selectGoodsByPrice(@Param("startrow") Integer startrow , @Param("catSonid")Integer catSonid,@Param("catId")Integer catId ,@Param("catParentid")Integer catParentid);
    
    List<Wt_goods> selectGoodsByTime(@Param("startrow") Integer startrow , @Param("catSonid")Integer catSonid,@Param("catId")Integer catId ,@Param("catParentid")Integer catParentid);
    
    int selectGoodsOneCount(Integer catParentid);
    
    int selectGoodsTwoCount(Integer catId);
    
    int selectGoodsThreeCount(Integer catSonid);
    
    int selectGradeCount(@Param("startrow") Integer startrow , @Param("catSonid")Integer catSonid,@Param("catId")Integer catId ,@Param("catParentid")Integer catParentid);
    
    int selectGoodsCount();
    
    List<Wt_goods> selectGoodsGuess(@Param("gdId") Integer gdId , @Param("adExId") Integer adExId);
    
    int selectShopCount(Integer adExId);
    
    List<Wt_goods>  selectGoodsShop(@Param("startrow") Integer startrow , @Param("adExId")Integer adExId);
    
    List<Wt_goods> selectByNameShop(@Param("startrow") Integer startrow ,@Param("gdName") String gdName ,@Param("adExId") Integer adExId);
    
    int selectByNameShopCount(@Param("gdName") String gdName ,@Param("adExId") Integer adExId);
    
    int selectByNameCount(String gdName);
    
    List<Wt_goods> selectByExId(Integer adExId);

    List selectFirst();

    List selectSec();

    List selectThird();
}