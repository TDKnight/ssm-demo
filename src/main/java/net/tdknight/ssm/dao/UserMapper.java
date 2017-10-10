package net.tdknight.ssm.dao;

import net.tdknight.ssm.entity.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

public interface UserMapper {

    @Select("SELECT * " +
            "FROM t_user " +
            "WHERE id = #{id}")
    User getById(@Param("id") String id);
}
