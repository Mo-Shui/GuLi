package com.moshui.guli.product;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.moshui.guli.product.entity.BrandEntity;
import com.moshui.guli.product.service.BrandService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GuliProductApplicationTests {
    
    @Autowired
    private BrandService brandService;

    @Test
    public void contextLoads() {
        // BrandEntity brandEntity = new BrandEntity();
        // brandEntity.setName("哈哈呵呵");
        // brandEntity.setBrandId(1L);
        // brandEntity.setDescript("呵呵嘻嘻嘻");
        
        // brandService.save(brandEntity);
        // System.out.println("添加成功");
        
        // brandService.updateById(brandEntity);

        List<BrandEntity> list = brandService.list(new QueryWrapper<BrandEntity>().eq("brand_id", 1L));
        list.forEach(x -> System.out.println(x));
    }

}
