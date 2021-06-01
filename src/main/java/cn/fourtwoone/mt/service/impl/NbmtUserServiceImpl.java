package cn.fourtwoone.mt.service.impl;

import cn.fourtwoone.mt.entity.NbmtUser;
import cn.fourtwoone.mt.dao.NbmtUserDao;
import cn.fourtwoone.mt.service.NbmtUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 用户表(NbmtUser)表服务实现类
 *
 * @author makejava
 * @since 2021-06-01 20:28:19
 */
@Service("nbmtUserService")
public class NbmtUserServiceImpl implements NbmtUserService {
    @Resource
    private NbmtUserDao nbmtUserDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public NbmtUser queryById(Long id) {
        return this.nbmtUserDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<NbmtUser> queryAllByLimit(int offset, int limit) {
        return this.nbmtUserDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param nbmtUser 实例对象
     * @return 实例对象
     */
    @Override
    public NbmtUser insert(NbmtUser nbmtUser) {
        this.nbmtUserDao.insert(nbmtUser);
        return nbmtUser;
    }

    /**
     * 修改数据
     *
     * @param nbmtUser 实例对象
     * @return 实例对象
     */
    @Override
    public NbmtUser update(NbmtUser nbmtUser) {
        this.nbmtUserDao.update(nbmtUser);
        return this.queryById(nbmtUser.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.nbmtUserDao.deleteById(id) > 0;
    }
}
