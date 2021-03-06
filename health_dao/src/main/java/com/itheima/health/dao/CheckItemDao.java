package com.itheima.health.dao;

import com.github.pagehelper.Page;
import com.itheima.health.pojo.CheckItem;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author ysl
 * @Date 2020/3/11 21:29
 * @Description: 持久层Dao接口
 **/

@Repository
public interface CheckItemDao {


    /**
     * 添加检查项
     * @param checkItem
     */
    public void add(CheckItem checkItem);


    /**
     * 分页
     * @param queryString
     * @return
     */
    Page<CheckItem> selectByCondition(String queryString);


    /**
     * 当前检查项是否被检查组引用
     * @param id
     * @return
     */
    long findCountCheckItemId(Integer id);


    /**
     * 删除检查项
     * @param id
     */
    void deleteById(Integer id);


    /**
     * 主键查询
     * @param id
     * @return
     */
    CheckItem findCheckItemId(Integer id);


    /**
     * 编辑保存
     * @param checkItem
     */
    void edit(CheckItem checkItem);


    /**
     * 查询所有
     * @return
     */
    List<CheckItem> findAll();



    List<CheckItem> findCheckItemListById(Integer id);
}
