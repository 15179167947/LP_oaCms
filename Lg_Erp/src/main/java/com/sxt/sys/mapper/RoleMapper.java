package com.sxt.sys.mapper;

import com.sxt.sys.domain.Role;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.io.Serializable;
import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author 老雷
 * @since 2020-08-14
 */
public interface RoleMapper extends BaseMapper<Role> {
    /**
     * 根据角色id删除sys_role_permission
     */
    void deleteRolePermissionByRid(Serializable id);
    /**
     * 根据角色id删除sys_role_user
     */
   void deleteRoleUserByRid(Serializable id);


    void saveRolePermission(Integer rid, Integer pid);

    List<Integer> queryRolePermissionIdsByRid(Integer roleId);

    /**
     * 根据当前用户id删除sys_role_user里面数据
     * @param id
     */
    void deleteRoleUserByUid(@Param("id") Serializable id);

    /**
     * 查询当前用户拥有的角色id
     * @param id
     * @return
     */
    List<Integer> queryUserRoleIdsByUid(Integer id);

    /**
     * 保存角色和用户的关系
     */
    void insertUserRole(@Param("uid")Integer uid,@Param("rid")Integer rid);

}
