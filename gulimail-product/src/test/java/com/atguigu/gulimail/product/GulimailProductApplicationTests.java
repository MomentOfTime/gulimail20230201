package com.atguigu.gulimail.product;

import com.atguigu.gulimail.product.entity.BrandEntity;
import com.atguigu.gulimail.product.service.BrandService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class GulimailProductApplicationTests {


    @Autowired
    BrandService brandService;

    @Test
    void contextLoads() {

        BrandEntity brandEntity = new BrandEntity();
        // 插入
//        brandEntity.setName("华子2");
//        brandService.save(brandEntity);

        // 更新
//        brandEntity.setBrandId(1L);
//        brandEntity.setName("华子2333");
//        brandService.updateById(brandEntity);
        // 查找
        List<BrandEntity> list = brandService.list(new QueryWrapper<BrandEntity>().in("brand_id", 1L,2L,3L));
        list.forEach(System.out::println);
    }

}
