package cn.com.cdboost.charge.merchant.constant;

public class IcCardConstant {
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

}
