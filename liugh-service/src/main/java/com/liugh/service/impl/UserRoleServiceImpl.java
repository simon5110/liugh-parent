package com.liugh.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.liugh.entity.UserRole;
import com.liugh.mapper.UserRoleMapper;
import com.liugh.service.IUserRoleService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.liugh.util.ComUtil;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author liugh123
 * @since 2018-05-03
 */
@Service
public class UserRoleServiceImpl extends ServiceImpl<UserRoleMapper, UserRole> implements IUserRoleService {

    @Override
//    @Cacheable(value = "UserRole",keyGenerator="wiselyKeyGenerator")
    public UserRole selectByUserNo(String userNo) {
        EntityWrapper<UserRole> ew = new EntityWrapper<>();
        ew.where("user_no={0}", userNo);
        List<UserRole> userRoleList = this.selectList(ew);
        return ComUtil.isEmpty(userRoleList)? null: userRoleList.get(0);
    }
}
