package cn.fourtwoone.mt.dao;

import cn.fourtwoone.mt.entity.NbmtUser;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 用户表(NbmtUser)表数据库访问层
 *
 * @author makejava
 * @since 2021-06-01 20:28:19
 */
public interface NbmtUserDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    NbmtUser queryById(Long id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<NbmtUser> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param nbmtUser 实例对象
     * @return 对象列表
     */
    List<NbmtUser> queryAll(NbmtUser nbmtUser);

    /**
     * 新增数据
     *
     * @param nbmtUser 实例对象
     * @return 影响行数
     */
    int insert(NbmtUser nbmtUser);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<NbmtUser> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<NbmtUser> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<NbmtUser> 实例对象列表
     * @return 影响行数
     */
    int insertOrUpdateBatch(@Param("entities") List<NbmtUser> entities);

    /**
     * 修改数据
     *
     * @param nbmtUser 实例对象
     * @return 影响行数
     */
    int update(NbmtUser nbmtUser);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);

}

