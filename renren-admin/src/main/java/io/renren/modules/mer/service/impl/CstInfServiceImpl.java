package io.renren.modules.mer.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;

import io.renren.modules.mer.dao.CstInfDao;
import io.renren.modules.mer.entity.CstInfEntity;
import io.renren.modules.mer.service.CstInfService;


@Service("cstInfService")
public class CstInfServiceImpl extends ServiceImpl<CstInfDao, CstInfEntity> implements CstInfService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<CstInfEntity> page = this.selectPage(
                new Query<CstInfEntity>(params).getPage(),
                new EntityWrapper<CstInfEntity>()
        );

        return new PageUtils(page);
    }

}
