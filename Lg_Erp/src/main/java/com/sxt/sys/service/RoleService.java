package com.sxt.sys.service;

import com.sxt.sys.domain.Role;
import com.baomidou.mybatisplus.extension.service.IService;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 老雷
 * @since 2020-08-14
 */
public interface RoleService extends IService<Role> {
    /**
     * 保存角色和权限之间的关系
     * @param rid
     * @param ids
     */
    void saveRolePermission(@Param("rid") Integer rid, @Param("pid") Integer[] ids);

    /**
     * 根据角色ID查询当前角色拥有的所有权限或菜单 ID
     * @param roleId
     * @return
     */
    List<Integer> queryRolePermissionIdsByRid(Integer roleId);

    List<Integer> queryUserRoleIdsByUid(Integer id);
}
