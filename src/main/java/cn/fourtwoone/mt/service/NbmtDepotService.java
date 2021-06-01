package cn.fourtwoone.mt.service;

import cn.fourtwoone.mt.entity.NbmtDepot;

import java.util.List;

/**
 * 仓库表(NbmtDepot)表服务接口
 *
 * @author makejava
 * @since 2021-06-01 20:28:16
 */
public interface NbmtDepotService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    NbmtDepot queryById(Long id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<NbmtDepot> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param nbmtDepot 实例对象
     * @return 实例对象
     */
    NbmtDepot insert(NbmtDepot nbmtDepot);

    /**
     * 修改数据
     *
     * @param nbmtDepot 实例对象
     * @return 实例对象
     */
    NbmtDepot update(NbmtDepot nbmtDepot);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}
