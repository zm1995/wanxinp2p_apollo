package cn.itcast.wanxinp2p.account.controller;

import cn.itcast.wanxinp2p.account.service.SmsService;
import cn.itcast.wanxinp2p.api.account.AccountAPI;
import cn.itcast.wanxinp2p.common.domain.RestResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@Slf4j
@Api(value = "统一账号服务", tags = "Account", description = "统一账号服务API")
@RestController
public class AccountController implements AccountAPI {

    @Autowired
    SmsService smsService;

    @ApiOperation("测试")
    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }

    @Override
    @ApiOperation("获取手机验证码")
    @ApiImplicitParam(name = "mobile", value = "手机号", dataType = "String")
    @GetMapping("/sms/{mobile}")
    public RestResponse getSMSCode(@PathVariable String mobile) {

        return smsService.getSmsCode(mobile);
    }
}
