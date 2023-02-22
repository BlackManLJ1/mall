package com.blackman.mall.product;

import com.blackman.mall.product.entity.BrandEntity;
import com.blackman.mall.product.service.BrandService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MallProductApplicationTests {

    @Autowired
    private BrandService brandService;

    @Test
	public void contextLoads() {
    }

}
