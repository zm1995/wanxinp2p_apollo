package cn.itcast.wanxinp2p.api.account;

import cn.itcast.wanxinp2p.common.domain.RestResponse;

public interface AccountAPI {

    /**
     * 获取手机验证码
     * @param mobile 手机号
     * @return
     */
    RestResponse getSMSCode(String mobile);
}
