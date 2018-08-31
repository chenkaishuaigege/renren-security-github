package io.renren.modules.mer.controller;

import java.util.Arrays;
import java.util.Map;

import io.renren.common.validator.ValidatorUtils;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.renren.modules.mer.entity.CstInfEntity;
import io.renren.modules.mer.service.CstInfService;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.R;



/**
 * 
 *
 * @author chenkai
 * @email 13141325785@163.com.com
 * @date 2018-08-31 11:01:18
 */
@RestController
@RequestMapping("mer/cstinf")
public class CstInfController {
    @Autowired
    private CstInfService cstInfService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("mer:cstinf:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = cstInfService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{merCstNo}")
    @RequiresPermissions("mer:cstinf:info")
    public R info(@PathVariable("merCstNo") String merCstNo){
        CstInfEntity cstInf = cstInfService.selectById(merCstNo);

        return R.ok().put("cstInf", cstInf);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("mer:cstinf:save")
    public R save(@RequestBody CstInfEntity cstInf){
        cstInfService.insert(cstInf);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("mer:cstinf:update")
    public R update(@RequestBody CstInfEntity cstInf){
        ValidatorUtils.validateEntity(cstInf);
        cstInfService.updateAllColumnById(cstInf);//全部更新
        
        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("mer:cstinf:delete")
    public R delete(@RequestBody String[] merCstNos){
        cstInfService.deleteBatchIds(Arrays.asList(merCstNos));

        return R.ok();
    }

}
