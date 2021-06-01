package cn.fourtwoone.mt.service.impl;

import cn.fourtwoone.mt.entity.NbmtProduct;
import cn.fourtwoone.mt.dao.NbmtProductDao;
import cn.fourtwoone.mt.service.NbmtProductService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 产品表(NbmtProduct)表服务实现类
 *
 * @author makejava
 * @since 2021-06-01 20:28:18
 */
@Service("nbmtProductService")
public class NbmtProductServiceImpl implements NbmtProductService {
    @Resource
    private NbmtProductDao nbmtProductDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public NbmtProduct queryById(Long id) {
        return this.nbmtProductDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<NbmtProduct> queryAllByLimit(int offset, int limit) {
        return this.nbmtProductDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param nbmtProduct 实例对象
     * @return 实例对象
     */
    @Override
    public NbmtProduct insert(NbmtProduct nbmtProduct) {
        this.nbmtProductDao.insert(nbmtProduct);
        return nbmtProduct;
    }

    /**
     * 修改数据
     *
     * @param nbmtProduct 实例对象
     * @return 实例对象
     */
    @Override
    public NbmtProduct update(NbmtProduct nbmtProduct) {
        this.nbmtProductDao.update(nbmtProduct);
        return this.queryById(nbmtProduct.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.nbmtProductDao.deleteById(id) > 0;
    }
}
