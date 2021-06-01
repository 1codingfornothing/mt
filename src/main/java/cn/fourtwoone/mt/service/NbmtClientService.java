package cn.fourtwoone.mt.service;

import cn.fourtwoone.mt.entity.NbmtClient;

import java.util.List;

/**
 * 客户表(NbmtClient)表服务接口
 *
 * @author makejava
 * @since 2021-06-01 20:28:13
 */
public interface NbmtClientService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    NbmtClient queryById(Long id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<NbmtClient> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param nbmtClient 实例对象
     * @return 实例对象
     */
    NbmtClient insert(NbmtClient nbmtClient);

    /**
     * 修改数据
     *
     * @param nbmtClient 实例对象
     * @return 实例对象
     */
    NbmtClient update(NbmtClient nbmtClient);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}
