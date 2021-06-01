package cn.fourtwoone.mt.service.impl;

import cn.fourtwoone.mt.entity.NbmtClient;
import cn.fourtwoone.mt.dao.NbmtClientDao;
import cn.fourtwoone.mt.service.NbmtClientService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 客户表(NbmtClient)表服务实现类
 *
 * @author makejava
 * @since 2021-06-01 20:28:13
 */
@Service("nbmtClientService")
public class NbmtClientServiceImpl implements NbmtClientService {
    @Resource
    private NbmtClientDao nbmtClientDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public NbmtClient queryById(Long id) {
        return this.nbmtClientDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<NbmtClient> queryAllByLimit(int offset, int limit) {
        return this.nbmtClientDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param nbmtClient 实例对象
     * @return 实例对象
     */
    @Override
    public NbmtClient insert(NbmtClient nbmtClient) {
        this.nbmtClientDao.insert(nbmtClient);
        return nbmtClient;
    }

    /**
     * 修改数据
     *
     * @param nbmtClient 实例对象
     * @return 实例对象
     */
    @Override
    public NbmtClient update(NbmtClient nbmtClient) {
        this.nbmtClientDao.update(nbmtClient);
        return this.queryById(nbmtClient.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.nbmtClientDao.deleteById(id) > 0;
    }
}
