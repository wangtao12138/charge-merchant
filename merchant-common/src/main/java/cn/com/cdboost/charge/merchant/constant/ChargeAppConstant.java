package cn.com.cdboost.charge.merchant.constant;

/**
 * 充电app常量枚举类
 */
public class ChargeAppConstant {

    /**
     * IC卡状态
     */
    public enum ICcardStatus {
        INIT(0,"初始"),ENABLE(1,"启用"),DISABLE(2,"停用"),SUSPEND(3,"挂失");

        /**
         * ic卡状态
         */
        private Integer status;

        /**
         * ic卡描述
         */
        private String desc;

        ICcardStatus(Integer status, String desc) {
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
     * 分账类别
     */
    public enum SplitAccountType {
        WECHAT(0,"微信分账"), ALIPAY(1,"支付宝分账");

        /**
         * 类型
         */
        private Integer type;
        /**
         * 描述
         */
        private String desc;

        SplitAccountType(Integer type, String desc) {
            this.type = type;
            this.desc = desc;
        }

        public Integer getType() {
            return type;
        }

        public void setType(Integer type) {
            this.type = type;
        }

        public String getDesc() {
            return desc;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }
    }

    /**
     * 提现类型
     */
    public enum WithdrawCashType {
        WECHAT(1,"微信提现"), ALIPAY(2,"支付宝提现");

        /**
         * 类型
         */
        private Integer type;
        /**
         * 描述
         */
        private String desc;

        WithdrawCashType(Integer type, String desc) {
            this.type = type;
            this.desc = desc;
        }

        public Integer getType() {
            return type;
        }

        public void setType(Integer type) {
            this.type = type;
        }

        public String getDesc() {
            return desc;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }

        public static String getDescByType(Integer type) {
            for (WithdrawCashType withdrawType : WithdrawCashType.values()) {
                if (withdrawType.getType().equals(type)) {
                    return withdrawType.getDesc();
                }
            }
            return "";
        }
    }

    /**
     * 提现状态
     */
    public enum WithdrawCashStatus {
         PROCESSING(0,"处理中"),SUCCESS(1,"提现成功"),FAIL(2,"提现失败");

        /**
         * 状态
         */
        private Integer status;
        /**
         * 描述
         */
        private String desc;

        WithdrawCashStatus(Integer status, String desc) {
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

        public static String getDescByStatus(Integer status) {
            for (ChargeAppConstant.WithdrawCashStatus cashStatus : WithdrawCashStatus.values()) {
                if (cashStatus.getStatus().equals(status)) {
                    return cashStatus.getDesc();
                }
            }
            return "";
        }
    }

    /**
     * 支付方式
     */
    public enum PayWayConstant {
        WECHAT(1,"微信支付"), ALIPAY(2,"支付宝支付"), CASH(3,"现金支付"),BALANCE(4,"余额支付");
        /**
         * 类型
         */
        private Integer type;
        /**
         * 描述
         */
        private String desc;

        PayWayConstant(Integer type, String desc) {
            this.type = type;
            this.desc = desc;
        }

        public Integer getType() {
            return type;
        }

        public void setType(Integer type) {
            this.type = type;
        }

        public String getDesc() {
            return desc;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }

        public static final String getDescByType(Integer type) {
            for (PayWayConstant payWayConstant : PayWayConstant.values()) {
                if (payWayConstant.getType().equals(type)) {
                    return payWayConstant.getDesc();
                }
            }
            return "";
        }
    }

    /**
     * 充电打开方式常量
     */
    public enum OpenMeansConstant {
        WECHAT(1,"微信"),ALIPAY(2,"支付宝"),ICCARD(3,"IC卡");

        /**
         * 类型
         */
        private Integer type;
        /**
         * 描述
         */
        private String desc;

        OpenMeansConstant(Integer type, String desc) {
            this.type = type;
            this.desc = desc;
        }

        public Integer getType() {
            return type;
        }

        public void setType(Integer type) {
            this.type = type;
        }

        public String getDesc() {
            return desc;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }
    }

    /**
     * 支付场景
     */
    public enum PayScene {
        CHARGE_ELEC(0,"充电页面选择充电方案场景"),
        MONTH_CHARGE(1,"月卡充值场景"),
        ACTIVITY_CHARGE(2,"活动购买页给账户余额充值场景"),
        ICCARD_CHARGE(3,"IC卡充值场景");

        /**
         * 类型
         */
        private Integer type;
        /**
         * 描述
         */
        private String desc;

        PayScene(Integer type, String desc) {
            this.type = type;
            this.desc = desc;
        }

        public Integer getType() {
            return type;
        }

        public void setType(Integer type) {
            this.type = type;
        }

        public String getDesc() {
            return desc;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }
    }

    public enum AppType {
        WECHAT(1,"微信"),ALIPAY(2,"支付宝");

        /**
         * 类型
         */
        private Integer type;
        /**
         * 描述
         */
        private String desc;

        AppType(Integer type, String desc) {
            this.type = type;
            this.desc = desc;
        }

        public Integer getType() {
            return type;
        }

        public void setType(Integer type) {
            this.type = type;
        }

        public String getDesc() {
            return desc;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }
    }

    /**
     * 用户注册状态
     */
    public enum RegisterState{
        REGISTER_FAIL(0,"注册失败"),
        REGISTER_SUCCESS(1,"注册成功"),
        REGISTER_HAVED(2,"手机号已被注册");
        /**
         * 状态
         */
        private Integer state;
        /**
         * 描述
         */
        private String desc;

        RegisterState(Integer state, String desc) {
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
    }

    /**
     * 用户是否可购买月卡
     */
    public enum IsCHargeCardOfMonth{
         CHARGE_CARD_ENABLE(1,"用户可购买月卡"),
         CHARGE_CARD_UNABLE(0,"用户还有剩余次数且未过期");
        /**
         * 状态
         */
        private Integer state;
        /**
         * 描述
         */
        private String desc;

        IsCHargeCardOfMonth(Integer state, String desc) {
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
    }

    /**
     * 是否更新电话号码
     */
    public enum UpdatePhone{
        UPDATE_SUCCESS(1,"修改成功"),
        UPDATE_FAILE(0,"修改失败"),
        UPDATE_REGISTER_HAVED(2,"手机号已被注册");
        /**
         * 状态
         */
        private Integer state;
        /**
         * 描述
         */
        private String desc;

        UpdatePhone(Integer state, String desc) {
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
    }

    /**
     * 是否认证
     */
    public enum  IsAuthentication{
        IS_AUTHENTICATION_HAVED(1,"已认证"),
        IS_AUTHENTICATION_NULL(0,"未认证");

        /**
         * 状态
         */
        private Integer state;
        /**
         * 描述
         */
        private String desc;

        IsAuthentication(Integer state, String desc) {
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
    }

    /**
     * 用户类型
     */
    public enum  UserType{
        USER_MONTH(2,"包月用户"),
        USER_COMMON(1,"普通用户");
        /**
         * 状态
         */
        private Integer type;
        /**
         * 描述
         */
        private String typeDesc;

        UserType(Integer type, String typeDesc) {
            this.type = type;
            this.typeDesc = typeDesc;
        }

        public Integer getType() {
            return type;
        }

        public void setType(Integer type) {
            this.type = type;
        }

        public String getTypeDesc() {
            return typeDesc;
        }

        public void setTypeDesc(String typeDesc) {
            this.typeDesc = typeDesc;
        }
    }
    /**
     * 消息类型
     */
    public enum MessageType{
        MESSAGE_ALARM(1,"警告"),
        MESSAGE_CHARGE_STOP(-1,"充电结束"),
        MESSAGE_CHARGE_STOP_ERROR(-2,"异常结束"),
        MESSAGE_LEVEL(0,"正常");
        /**
         * 状态
         */
        private Integer type;
        /**
         * 描述
         */
        private String typeDesc;

        MessageType(Integer type, String typeDesc) {
            this.type = type;
            this.typeDesc = typeDesc;
        }

        public Integer getType() {
            return type;
        }

        public void setType(Integer type) {
            this.type = type;
        }

        public String getTypeDesc() {
            return typeDesc;
        }

        public void setTypeDesc(String typeDesc) {
            this.typeDesc = typeDesc;
        }
    }

    /**
     * 支付方式
     */
    public enum PayWay{
        PAY_MONTH_CNT(1,"月卡次数扣减"),
        PAY_USER_BALANCE(2,"账户余额扣减"),
        IC_CARD_BALANCE(3,"IC卡余额扣减");

        /**
         * 状态
         */
        private Integer payWay;
        /**
         * 描述
         */
        private String payWayDesc;

        PayWay(Integer payWay, String payWayDesc) {
            this.payWay = payWay;
            this.payWayDesc = payWayDesc;
        }

        public Integer getPayWay() {
            return payWay;
        }

        public void setPayWay(Integer payWay) {
            this.payWay = payWay;
        }

        public String getPayWayDesc() {
            return payWayDesc;
        }

        public void setPayWayDesc(String payWayDesc) {
            this.payWayDesc = payWayDesc;
        }
    }

    /**
     * 设备信号强度
     */
    public enum SingalState{
        SINGAL_MIN("1","弱"),
        SINGAL_MID("2","中等"),
        SINGAL_MAX("3","强");
        /**
         * 状态
         */
        private String state;
        /**
         * 描述
         */
        private String stateDesc;

        SingalState(String state, String stateDesc) {
            this.state = state;
            this.stateDesc = stateDesc;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }

        public String getStateDesc() {
            return stateDesc;
        }

        public void setStateDesc(String stateDesc) {
            this.stateDesc = stateDesc;
        }

        /**
         * 根据状态查询状态描述信息
         * @param state
         * @return
         */
        public static String getStateDescByState(String state) {
            for (SingalState singalState : SingalState.values()) {
                if (singalState.getState().equals(state)) {
                    return singalState.getStateDesc();
                }
            }
            return "";
        }
    }

    /**
     * 计费方式
     */
    public enum ChargingWay{
        CHARGING_ELECTRIC(1,"电量计量"),
        CHARGING_TIME(2,"时间计量"),
        CHARGING_TIME_ELECTRIC(3,"电量时间计量");
        /**
         * 状态
         */
        private Integer way;
        /**
         * 描述
         */
        private String wayDesc;

        ChargingWay(Integer way, String wayDesc) {
            this.way = way;
            this.wayDesc = wayDesc;
        }

        public Integer getWay() {
            return way;
        }

        public void setWay(Integer way) {
            this.way = way;
        }

        public String getWayDesc() {
            return wayDesc;
        }

        public void setWayDesc(String wayDesc) {
            this.wayDesc = wayDesc;
        }
    }

    /**
     * 充电计量方式
     */
    public enum MeasureType {
        RE_MEASURE(0,"重新计量"),APPEND_MEASURE(1,"电量追加");

        /**
         * 计量方式
         */
        private Integer type;

        /**
         * 描述
         */
        private String desc;

        MeasureType(Integer type, String desc) {
            this.type = type;
            this.desc = desc;
        }

        public Integer getType() {
            return type;
        }

        public void setType(Integer type) {
            this.type = type;
        }

        public String getDesc() {
            return desc;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }
    }

    public enum IsPay{
        PAY_ENABLE(1,"余额不足,发起第三方支付"),
        PAY_UNABLE(0,"余额足够,扣减余额");
        /**
         * 状态
         */
        private Integer pay;
        /**
         * 描述
         */
        private String payDesc;

        IsPay(Integer pay, String payDesc) {
            this.pay = pay;
            this.payDesc = payDesc;
        }

        public Integer getPay() {
            return pay;
        }

        public void setPay(Integer pay) {
            this.pay = pay;
        }

        public String getPayDesc() {
            return payDesc;
        }

        public void setPayDesc(String payDesc) {
            this.payDesc = payDesc;
        }
    }
}
