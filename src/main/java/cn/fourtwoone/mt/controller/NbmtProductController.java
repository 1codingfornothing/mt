package cn.fourtwoone.mt.controller;

import cn.fourtwoone.mt.entity.NbmtDepot;
import cn.fourtwoone.mt.entity.NbmtProduct;
import cn.fourtwoone.mt.service.NbmtProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * 产品表(NbmtProduct)表控制层
 *
 * @author makejava
 * @since 2021-06-01 20:28:18
 */
@Controller

public class NbmtProductController {
    /**
     * 服务对象
     */
    @Resource
    private NbmtProductService nbmtProductService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public NbmtProduct selectOne(Long id) {
        return this.nbmtProductService.queryById(id);
    }
//    @GetMapping("all")
//    public List<NbmtProduct> selectAll() {
//        return this.nbmtProductService.queryAllByLimit(0,100);
//    }

//    @GetMapping("all")
//    public String queryall(Model model){
//        List<NbmtProduct> nbmtProducts = nbmtProductService.queryAllByLimit(0, 100);
//        model.addAttribute("products",nbmtProducts);
//        return "yg-jbxx";
//    }

    @GetMapping("productall")
    public String selectAll(Model model){
        List<NbmtProduct> nbmtProducts = nbmtProductService.queryAllByLimit(0,100);
        System.out.println(nbmtProducts);
        model.addAttribute("products",nbmtProducts);
        return "cpgl";

    }
    @PostMapping("productadd")
    public String productadd(NbmtProduct product){
        System.out.println(product);
        nbmtProductService.insert(product);
        return "redirect:/productall";
    }

    @GetMapping("productupdate/{id}")
    public String toupdate(@PathVariable("id") Long id){
//        System.out.println(product);
//        nbmtProductService.update(product);
        return "productupdate";
    }
    @PostMapping("productsave")
    public String productsave(NbmtProduct product){
        System.out.println(product.getId()+product.getName());
        nbmtProductService.update(product);
        return "redirect:/productall";
    }
    @PostMapping("productdel")
    public String productdel(@PathVariable("id") Long id){
        System.out.println(id);
        nbmtProductService.deleteById(id);
        return "redirect:/productall";
    }

}
