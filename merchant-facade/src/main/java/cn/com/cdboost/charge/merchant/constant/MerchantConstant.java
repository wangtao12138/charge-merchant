package cn.com.cdboost.charge.merchant.constant;

import lombok.AllArgsConstructor;
import lombok.Getter;

public class MerchantConstant {
    /**
     * 服务模式
     */
    public enum ServiceMode {
        COMMON_MERCHANT(0,"普通商户模式"),SERVICE_MERCHANT(1,"服务商模式");

        /**
         * 支付状态
         */
        private Integer mode;

        /**
         * 描述
         */
        private String desc;

        ServiceMode(Integer mode, String desc) {
            this.mode = mode;
            this.desc = desc;
        }

        public Integer getMode() {
            return mode;
        }

        public void setMode(Integer mode) {
            this.mode = mode;
        }

        public String getDesc() {
            return desc;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }
    }
    /**
     * APP类型
     */
    @Getter
    @AllArgsConstructor
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
    }
}
