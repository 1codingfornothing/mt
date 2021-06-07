package cn.fourtwoone.mt.controller;

import cn.fourtwoone.mt.entity.NbmtDepot;
import cn.fourtwoone.mt.entity.NbmtProduct;
import cn.fourtwoone.mt.service.NbmtDepotService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;

/**
 * 仓库表(NbmtDepot)表控制层
 *
 * @author makejava
 * @since 2021-06-01 20:28:16
 */

@Controller
//@RequestMapping("depot")
public class NbmtDepotController {
    /**
     * 服务对象
     */
    @Resource
    private NbmtDepotService nbmtDepotService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne/{id}")
    public NbmtDepot selectOne(@PathVariable("id") Long id) {
        return this.nbmtDepotService.queryById(id);
    }

//    @GetMapping("selectall")
//    public List<NbmtDepot> selectAll() {
//        return this.nbmtDepotService.queryAllByLimit(0,100);
//    }

//
    @GetMapping("depotall")
    public String selectAll(Model model){
        List<NbmtDepot> nbmtDepots = nbmtDepotService.queryAllByLimit(0,100);
        System.out.println(nbmtDepots);
        model.addAttribute("depots",nbmtDepots);
        return "ckgl";

    }
    @PostMapping("depotadd")
    public String depotadd(NbmtDepot depot){
        System.out.println(depot);
        nbmtDepotService.insert(depot);
        return "redirect:/depotall";
    }
    @GetMapping("depotupdate/{id}")
    public String toupdate(@PathVariable("id") Long id){
//        System.out.println(product);
//        nbmtProductService.update(product);
        return "depotupdate";
    }
    @PostMapping("depotsave")
    public String depotsave(NbmtDepot depot){
        System.out.println(depot.getId()+depot.getName());
        nbmtDepotService.update(depot);
        return "redirect:/depotall";
    }


    @GetMapping("depotdel/{id}")
    public String depotdel(@PathVariable("id")Long id){
        nbmtDepotService.deleteById(id);
        return "redirect:/depotall";

    }

}
