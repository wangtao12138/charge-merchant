package cn.com.cdboost.charge.merchant.constant;

/**
 * 充电相关常量
 */
public class DeviceConstant {
    /**
     * 物业状态 0-停用1-正常
     */
    public enum PropertyState {
        STOP(0,"停用"),NOT_STOP(0,"正常");
        /**
         * 状态
         */
        private Integer status;

        /**
         * 描述
         */
        private String desc;

        PropertyState(Integer status, String desc) {
            this.status = status;
            this.desc = desc;
        }

        public Integer getStatus() {
            return status;
        }

        public void setStatus(Integer status) {
            this.status = status;
        }

        public String getDesc() {
            return desc;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }
    }
    /**
     * 下发状态
     */
    public enum SendFlag {
        SEND(1,"已下发"),NOT_SEND(0,"未下发");
        /**
         * 运行状态
         */
        private Integer status;

        /**
         * 描述
         */
        private String desc;

        SendFlag(Integer status, String desc) {
            this.status = status;
            this.desc = desc;
        }

        public Integer getStatus() {
            return status;
        }

        public void setStatus(Integer status) {
            this.status = status;
        }

        public String getDesc() {
            return desc;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }
    }

    /**
     * 设备在线状态
     */
    public enum DeviceOnlineStatus {
        OFFLINE(0,"离线"),ONLINE(1,"在线");
        /**
         * 运行状态
         */
        private Integer status;

        /**
         * 描述
         */
        private String desc;

        DeviceOnlineStatus(Integer status, String desc) {
            this.status = status;
            this.desc = desc;
        }

        public Integer getStatus() {
            return status;
        }

        public void setStatus(Integer status) {
            this.status = status;
        }

        public String getDesc() {
            return desc;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }
    }

    /**
     * 是否删除
     */
    public enum IsDel {
        NOTDEL(1,"正常"),DEL(0,"删除");
        /**
         * 是否删除
         */
        private Integer status;

        /**
         * 描述
         */
        private String desc;

        IsDel(Integer status, String desc) {
            this.status = status;
            this.desc = desc;
        }

        public Integer getStatus() {
            return status;
        }

        public void setStatus(Integer status) {
            this.status = status;
        }

        public String getDesc() {
            return desc;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }
    }

    /**
     * 充电桩设备运行状态
     */
    public enum DeviceRunState {
        IDEL(0,"空闲"),
        CHARGING(1,"充电 "),
        UN_USE(2,"停用"),
        FAULT(-1,"故障");

        /**
         * 运行状态
         */
        private Integer state;

        /**
         * 描述
         */
        private String desc;

        DeviceRunState(Integer state, String desc) {
            this.state = state;
            this.desc = desc;
        }

        public Integer getState() {
            return state;
        }

        public void setState(Integer state) {
            this.state = state;
        }

        public String getDesc() {
            return desc;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }

        /**
         * 根据状态查询对应描述信息
         * @param state
         * @return
         */
        public static final String getDescByState(Integer state) {
            for (DeviceRunState deviceRunState : DeviceRunState.values()) {
                if (deviceRunState.getState().equals(state)) {
                    return deviceRunState.getDesc();
                }
            }
            return "";
        }
    }
}
