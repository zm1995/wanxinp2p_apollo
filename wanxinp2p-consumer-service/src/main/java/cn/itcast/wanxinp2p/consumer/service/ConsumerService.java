package cn.itcast.wanxinp2p.consumer.service;

import cn.itcast.wanxinp2p.api.consumer.model.ConsumerRegisterDTO;
import cn.itcast.wanxinp2p.consumer.entity.Consumer;
import com.baomidou.mybatisplus.extension.service.IService;

public interface ConsumerService extends IService<Consumer> {

    Integer checkMobile(String mobile);

    void register(ConsumerRegisterDTO consumerRegisterDTO);
}
