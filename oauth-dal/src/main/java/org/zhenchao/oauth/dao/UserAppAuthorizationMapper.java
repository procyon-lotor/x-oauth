package org.zhenchao.oauth.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.zhenchao.oauth.model.UserAppAuthorization;
import org.zhenchao.oauth.model.UserAppAuthorizationExample;

public interface UserAppAuthorizationMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_app_authorization
     *
     * @mbg.generated Wed Dec 28 16:41:47 CST 2016
     */
    long countByExample(UserAppAuthorizationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_app_authorization
     *
     * @mbg.generated Wed Dec 28 16:41:47 CST 2016
     */
    int deleteByExample(UserAppAuthorizationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_app_authorization
     *
     * @mbg.generated Wed Dec 28 16:41:47 CST 2016
     */
    int deleteByPrimaryKey(Long appId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_app_authorization
     *
     * @mbg.generated Wed Dec 28 16:41:47 CST 2016
     */
    int insert(UserAppAuthorization record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_app_authorization
     *
     * @mbg.generated Wed Dec 28 16:41:47 CST 2016
     */
    int insertSelective(UserAppAuthorization record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_app_authorization
     *
     * @mbg.generated Wed Dec 28 16:41:47 CST 2016
     */
    List<UserAppAuthorization> selectByExample(UserAppAuthorizationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_app_authorization
     *
     * @mbg.generated Wed Dec 28 16:41:47 CST 2016
     */
    UserAppAuthorization selectByPrimaryKey(Long appId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_app_authorization
     *
     * @mbg.generated Wed Dec 28 16:41:47 CST 2016
     */
    int updateByExampleSelective(@Param("record") UserAppAuthorization record, @Param("example") UserAppAuthorizationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_app_authorization
     *
     * @mbg.generated Wed Dec 28 16:41:47 CST 2016
     */
    int updateByExample(@Param("record") UserAppAuthorization record, @Param("example") UserAppAuthorizationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_app_authorization
     *
     * @mbg.generated Wed Dec 28 16:41:47 CST 2016
     */
    int updateByPrimaryKeySelective(UserAppAuthorization record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_app_authorization
     *
     * @mbg.generated Wed Dec 28 16:41:47 CST 2016
     */
    int updateByPrimaryKey(UserAppAuthorization record);
}