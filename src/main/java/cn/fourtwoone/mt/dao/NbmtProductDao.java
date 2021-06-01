package cn.fourtwoone.mt.dao;

import cn.fourtwoone.mt.entity.NbmtProduct;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 产品表(NbmtProduct)表数据库访问层
 *
 * @author makejava
 * @since 2021-06-01 20:28:17
 */
public interface NbmtProductDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    NbmtProduct queryById(Long id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<NbmtProduct> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param nbmtProduct 实例对象
     * @return 对象列表
     */
    List<NbmtProduct> queryAll(NbmtProduct nbmtProduct);

    /**
     * 新增数据
     *
     * @param nbmtProduct 实例对象
     * @return 影响行数
     */
    int insert(NbmtProduct nbmtProduct);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<NbmtProduct> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<NbmtProduct> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<NbmtProduct> 实例对象列表
     * @return 影响行数
     */
    int insertOrUpdateBatch(@Param("entities") List<NbmtProduct> entities);

    /**
     * 修改数据
     *
     * @param nbmtProduct 实例对象
     * @return 影响行数
     */
    int update(NbmtProduct nbmtProduct);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);

}

