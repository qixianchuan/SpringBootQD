package com.qi.pagesort.dao;

import com.qi.pagesort.entity.User;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * @author ：qixianchuan
 * @date ：Created in 2019-08-14 15:59
 * @description：${description}
 * @modified By：
 * @version: $version$
 */
public interface UserRepository extends PagingAndSortingRepository<User, Long> {
}
