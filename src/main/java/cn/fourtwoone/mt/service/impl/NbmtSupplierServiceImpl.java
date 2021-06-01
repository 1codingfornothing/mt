package cn.fourtwoone.mt.service.impl;

import cn.fourtwoone.mt.entity.NbmtSupplier;
import cn.fourtwoone.mt.dao.NbmtSupplierDao;
import cn.fourtwoone.mt.service.NbmtSupplierService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 供应商表(NbmtSupplier)表服务实现类
 *
 * @author makejava
 * @since 2021-06-01 20:28:18
 */
@Service("nbmtSupplierService")
public class NbmtSupplierServiceImpl implements NbmtSupplierService {
    @Resource
    private NbmtSupplierDao nbmtSupplierDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public NbmtSupplier queryById(Long id) {
        return this.nbmtSupplierDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<NbmtSupplier> queryAllByLimit(int offset, int limit) {
        return this.nbmtSupplierDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param nbmtSupplier 实例对象
     * @return 实例对象
     */
    @Override
    public NbmtSupplier insert(NbmtSupplier nbmtSupplier) {
        this.nbmtSupplierDao.insert(nbmtSupplier);
        return nbmtSupplier;
    }

    /**
     * 修改数据
     *
     * @param nbmtSupplier 实例对象
     * @return 实例对象
     */
    @Override
    public NbmtSupplier update(NbmtSupplier nbmtSupplier) {
        this.nbmtSupplierDao.update(nbmtSupplier);
        return this.queryById(nbmtSupplier.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.nbmtSupplierDao.deleteById(id) > 0;
    }
}
