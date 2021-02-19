package cn.msw.dao;

import cn.msw.domain.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author 黑马程序员
 * @Company http://www.ithiema.com
 *
 * 用户的持久层接口
 */
public interface IUserDao {

    /**
     * 查询所有操作
     * @return
     */
    List<User> findAll();

    /**
     * 根据id查找用户
     * @param id id
     * @return
     */
    User queryById(@Param("id") Integer id);

    /**
     * 更新用户
     * @param user
     * @return
     */
    Integer updateUser(User user);
}
