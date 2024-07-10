package com.dao;

import com.entity.MeishiCollectionEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.MeishiCollectionView;

/**
 * 美食收藏 Dao 接口
 *
 * @author 
 */
public interface MeishiCollectionDao extends BaseMapper<MeishiCollectionEntity> {

   List<MeishiCollectionView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
