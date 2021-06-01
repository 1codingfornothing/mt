package cn.fourtwoone.mt.controller;

import cn.fourtwoone.mt.entity.NbmtOrder;
import cn.fourtwoone.mt.service.NbmtOrderService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 单据主表(NbmtOrder)表控制层
 *
 * @author makejava
 * @since 2021-06-01 20:28:16
 */
@RestController
@RequestMapping("nbmtOrder")
public class NbmtOrderController {
    /**
     * 服务对象
     */
    @Resource
    private NbmtOrderService nbmtOrderService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public NbmtOrder selectOne(Long id) {
        return this.nbmtOrderService.queryById(id);
    }

}
