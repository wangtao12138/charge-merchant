package cn.com.cdboost.charge.merchant.service.impl;

import cn.com.cdboost.charge.base.vo.PageData;
import cn.com.cdboost.charge.merchant.common.BaseServiceImpl;
import cn.com.cdboost.charge.merchant.dao.DeviceEventMapper;
import cn.com.cdboost.charge.merchant.model.DeviceEvent;
import cn.com.cdboost.charge.merchant.service.IDeviceEventService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import tk.mybatis.mapper.entity.Condition;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * 设备事件记录单表接口实现
 */
@Service
public class IDeviceEventServiceImpl extends BaseServiceImpl<DeviceEvent> implements IDeviceEventService {
    @Autowired
    private DeviceEventMapper deviceEventMapper;
    @Override
    public PageData<DeviceEvent> queryEventPage(String merchantGuid, Integer eventCode, Integer pageNumber, Integer pageSize) {
        PageData<DeviceEvent> pageData = new PageData<>();
        Condition condition = new Condition(DeviceEvent.class);
        Example.Criteria criteria = condition.createCriteria();
        if (!StringUtils.isEmpty(eventCode)) {
            criteria.andEqualTo("eventCode",eventCode);
        }
        criteria.andEqualTo("merchantGuid",merchantGuid);
        PageHelper.startPage(pageNumber,pageSize,"id desc");
        List<DeviceEvent> deviceEvents = deviceEventMapper.selectByCondition(condition);
        PageInfo<DeviceEvent> pageInfo = new PageInfo<>(deviceEvents);
        pageData.setList(deviceEvents);
        pageData.setTotal(pageInfo.getTotal());
        return pageData;
    }
}
