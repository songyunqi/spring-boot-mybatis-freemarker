package com.foo.mapper;

import com.foo.form.UserQueryForm;
import com.foo.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.transaction.annotation.Transactional;

@Mapper
public interface UserMapper {

    @Transactional
    @Select("user/find-by-username.sql")
    User queryByName(@Param("username") String name);

    @Transactional
    @Select("user/find-user-by-multi-query.sql")
    User queryByForm(@Param("form") UserQueryForm form);
}
