package com.itheima.health.dao;

import com.itheima.health.pojo.Member;
import org.springframework.stereotype.Repository;

/**
 * @Author ysl
 * @Date 2020/3/20 16:59
 * @Description:
 **/

@Repository
public interface MemberDao {


    /**
     *根据id查询会员
     * @param telephone
     * @return
     */
    Member findByTelephone(String telephone);


    /**
     * 新增会员
     * @param member
     */
    void add(Member member);
}