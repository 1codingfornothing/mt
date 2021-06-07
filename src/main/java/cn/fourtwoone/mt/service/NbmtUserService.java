package cn.fourtwoone.mt.service;

import cn.fourtwoone.mt.entity.NbmtUser;

import java.util.List;

/**
 * 用户表(NbmtUser)表服务接口
 *
 * @author makejava
 * @since 2021-06-01 20:28:19
 */
public interface NbmtUserService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */

    NbmtUser login(String username, String password);

    NbmtUser queryById(Long id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<NbmtUser> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param nbmtUser 实例对象
     * @return 实例对象
     */
    NbmtUser insert(NbmtUser nbmtUser);

    /**
     * 修改数据
     *
     * @param nbmtUser 实例对象
     * @return 实例对象
     */
    NbmtUser update(NbmtUser nbmtUser);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}
