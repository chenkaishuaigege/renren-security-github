package io.renren.modules.mer.service;

import com.baomidou.mybatisplus.service.IService;
import io.renren.common.utils.PageUtils;
import io.renren.modules.mer.entity.CstInfEntity;

import java.util.Map;

/**
 * 
 *
 * @author chenkai
 * @email 13141325785@163.com.com
 * @date 2018-08-31 11:01:18
 */
public interface CstInfService extends IService<CstInfEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

