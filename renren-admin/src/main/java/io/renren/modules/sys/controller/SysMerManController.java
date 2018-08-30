package io.renren.modules.sys.controller;

import io.renren.common.utils.PageUtils;
import io.renren.common.utils.R;
import io.renren.modules.sys.service.SysRoleService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * 商户管理
 *
 * @author chenkai
 * @email 13141325785@163.com
 * @date 2018年8月27日15:49:50
 */

@RestController
@RequestMapping("/mer")
public class SysMerManController extends AbstractController {

    @Autowired
    private SysRoleService sysRoleService;

    /**
     * 角色列表
     */
    @RequestMapping("/list")
   // @RequiresPermissions("mer:role:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = sysRoleService.queryPage(params);

        return R.ok().put("page", page);
    }

}
