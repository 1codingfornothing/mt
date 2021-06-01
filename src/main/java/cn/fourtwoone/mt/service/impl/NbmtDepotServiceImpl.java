package cn.fourtwoone.mt.service.impl;

import cn.fourtwoone.mt.entity.NbmtDepot;
import cn.fourtwoone.mt.dao.NbmtDepotDao;
import cn.fourtwoone.mt.service.NbmtDepotService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 仓库表(NbmtDepot)表服务实现类
 *
 * @author makejava
 * @since 2021-06-01 20:28:16
 */
@Service("nbmtDepotService")
public class NbmtDepotServiceImpl implements NbmtDepotService {
    @Resource
    private NbmtDepotDao nbmtDepotDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public NbmtDepot queryById(Long id) {
        return this.nbmtDepotDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<NbmtDepot> queryAllByLimit(int offset, int limit) {
        return this.nbmtDepotDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param nbmtDepot 实例对象
     * @return 实例对象
     */
    @Override
    public NbmtDepot insert(NbmtDepot nbmtDepot) {
        this.nbmtDepotDao.insert(nbmtDepot);
        return nbmtDepot;
    }

    /**
     * 修改数据
     *
     * @param nbmtDepot 实例对象
     * @return 实例对象
     */
    @Override
    public NbmtDepot update(NbmtDepot nbmtDepot) {
        this.nbmtDepotDao.update(nbmtDepot);
        return this.queryById(nbmtDepot.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.nbmtDepotDao.deleteById(id) > 0;
    }
}
