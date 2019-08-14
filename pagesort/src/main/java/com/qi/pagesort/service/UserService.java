package com.qi.pagesort.service;

import com.qi.pagesort.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * @author ：qixianchuan
 * @date ：Created in 2019-08-14 16:00
 * @description：${description}
 * @modified By：
 * @version: $version$
 */
public interface UserService {

    Page<User> findByPage(Pageable pageable);

    User insertByUser(User user);
}
