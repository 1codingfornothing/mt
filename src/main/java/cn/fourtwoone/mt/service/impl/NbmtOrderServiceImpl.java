package cn.fourtwoone.mt.service.impl;

import cn.fourtwoone.mt.entity.NbmtOrder;
import cn.fourtwoone.mt.dao.NbmtOrderDao;
import cn.fourtwoone.mt.service.NbmtOrderService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 单据主表(NbmtOrder)表服务实现类
 *
 * @author makejava
 * @since 2021-06-01 20:28:16
 */
@Service("nbmtOrderService")
public class NbmtOrderServiceImpl implements NbmtOrderService {
    @Resource
    private NbmtOrderDao nbmtOrderDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public NbmtOrder queryById(Long id) {
        return this.nbmtOrderDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<NbmtOrder> queryAllByLimit(int offset, int limit) {
        return this.nbmtOrderDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param nbmtOrder 实例对象
     * @return 实例对象
     */
    @Override
    public NbmtOrder insert(NbmtOrder nbmtOrder) {
        this.nbmtOrderDao.insert(nbmtOrder);
        return nbmtOrder;
    }

    /**
     * 修改数据
     *
     * @param nbmtOrder 实例对象
     * @return 实例对象
     */
    @Override
    public NbmtOrder update(NbmtOrder nbmtOrder) {
        this.nbmtOrderDao.update(nbmtOrder);
        return this.queryById(nbmtOrder.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.nbmtOrderDao.deleteById(id) > 0;
    }
}
