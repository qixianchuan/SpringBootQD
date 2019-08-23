package com.qi.jpa.dao;

import com.qi.jpa.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author ：qixianchuan
 * @date ：Created in 2019-08-14 14:00
 * @description：BookDao
 * @modified By：
 * @version: $version$
 */
public interface BookDao extends JpaRepository<Book, Long> {
}
