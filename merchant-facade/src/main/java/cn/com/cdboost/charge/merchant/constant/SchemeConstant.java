package cn.com.cdboost.charge.merchant.constant;

public class SchemeConstant {
    /**
     * 方案充值类别
     */
    public enum SchemePayCategory {
        TEMPORARY_RECHARGE(1,"临时充值"),
        MONTH_RECHARGE(2,"包月充值"),
        RECHARGE_FULL(3,"一次充满"),
        BALANCE_RECHARGE(4,"余额活动充值"),
        IC_RECHARGE(5,"IC卡充值");

        /**
         * 充值类别
         */
        private Integer type;

        /**
         * 描述
         */
        private String desc;

        SchemePayCategory(Integer type, String desc) {
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
            for (SchemePayCategory category : SchemePayCategory.values()) {
                if (category.getType().equals(type)) {
                    return category.getDesc();
                }
            }
            return "";
        }
    }
    /**
     * 方案类别
     */
    public enum SchemeType {
        SCHEME_ONE(0,"方案1"),
        SCHEME_TWO(1,"方案2");

        /**
         * 类别
         */
        private Integer type;

        /**
         * 描述
         */
        private String desc;

        SchemeType(Integer type, String desc) {
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
            for (SchemePayCategory category : SchemePayCategory.values()) {
                if (category.getType().equals(type)) {
                    return category.getDesc();
                }
            }
            return "";
        }
    }
    /**
     * 方案充值类别
     */
    public enum SchemeIsDel {
        ABLE(1,"启用"),
        UNABLE(0,"禁用");

        /**
         * 充值类别
         */
        private Integer type;

        /**
         * 描述
         */
        private String desc;

        SchemeIsDel(Integer type, String desc) {
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
            for (SchemePayCategory category : SchemePayCategory.values()) {
                if (category.getType().equals(type)) {
                    return category.getDesc();
                }
            }
            return "";
        }
    }
}
