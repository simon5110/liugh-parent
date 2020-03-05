package com.liugh.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.liugh.entity.UserInfo;
import com.liugh.mapper.UserInfoMapper;
import com.liugh.service.IUserInfoService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户电话关系表 服务实现类
 * </p>
 *
 * @author liugh123
 * @since 2018-10-29
 */
@Service
public class UserInfoServiceImpl extends ServiceImpl<UserInfoMapper, UserInfo> implements IUserInfoService {

}
