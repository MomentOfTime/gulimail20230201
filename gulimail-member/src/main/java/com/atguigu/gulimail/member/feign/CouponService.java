package com.atguigu.gulimail.member.feign;

import com.atguigu.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "gulimail-coupon7001")
public interface CouponService {

    @RequestMapping("/coupon/coupon/coupons")
    public R coupons();
}
