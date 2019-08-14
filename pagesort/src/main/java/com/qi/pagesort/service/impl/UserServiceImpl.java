package com.qi.pagesort.service.impl;

import com.qi.pagesort.dao.UserRepository;
import com.qi.pagesort.entity.User;
import com.qi.pagesort.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

/**
 * @author ：qixianchuan
 * @date ：Created in 2019-08-14 16:01
 * @description：${description}
 * @modified By：
 * @version: $version$
 */
@Service
public class UserServiceImpl implements UserService {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    private UserRepository userRepository;

    @Override
    public Page<User> findByPage(Pageable pageable) {
        LOGGER.info("分页查询用户："
                + " PageNumber = " + pageable.getPageNumber()
                + " PageSize = " + pageable.getPageSize());
        return userRepository.findAll(pageable);
    }

    @Override
    public User insertByUser(User user) {
        LOGGER.info("新增用户：" + user.toString());
        return userRepository.save(user);
    }
}
