package cn.fourtwoone.mt.dao;

import cn.fourtwoone.mt.entity.NbmtClient;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 客户表(NbmtClient)表数据库访问层
 *
 * @author makejava
 * @since 2021-06-01 20:28:12
 */
public interface NbmtClientDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    NbmtClient queryById(Long id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<NbmtClient> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param nbmtClient 实例对象
     * @return 对象列表
     */
    List<NbmtClient> queryAll(NbmtClient nbmtClient);

    /**
     * 新增数据
     *
     * @param nbmtClient 实例对象
     * @return 影响行数
     */
    int insert(NbmtClient nbmtClient);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<NbmtClient> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<NbmtClient> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<NbmtClient> 实例对象列表
     * @return 影响行数
     */
    int insertOrUpdateBatch(@Param("entities") List<NbmtClient> entities);

    /**
     * 修改数据
     *
     * @param nbmtClient 实例对象
     * @return 影响行数
     */
    int update(NbmtClient nbmtClient);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);

}

