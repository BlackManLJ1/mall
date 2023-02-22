package com.blackman.mall.member.feign;

import com.blackman.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("mall-coupon")
public interface CouponFeignService {

    @RequestMapping("coupon/coupon/member/coupons")
    public R memberCoupons();
}
