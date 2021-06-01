package cn.fourtwoone.mt.service;

import cn.fourtwoone.mt.entity.NbmtOrder;

import java.util.List;

/**
 * 单据主表(NbmtOrder)表服务接口
 *
 * @author makejava
 * @since 2021-06-01 20:28:16
 */
public interface NbmtOrderService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    NbmtOrder queryById(Long id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<NbmtOrder> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param nbmtOrder 实例对象
     * @return 实例对象
     */
    NbmtOrder insert(NbmtOrder nbmtOrder);

    /**
     * 修改数据
     *
     * @param nbmtOrder 实例对象
     * @return 实例对象
     */
    NbmtOrder update(NbmtOrder nbmtOrder);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}
