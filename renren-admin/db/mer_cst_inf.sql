CREATE TABLE `mer_cst_inf` (
  `mer_cst_no`  varchar(255) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL COMMENT '商户号(主键唯一)' ,
  `mer_name`  varchar(255) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL COMMENT '商户名称' ,
  `mer_no`  varchar(255) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL COMMENT '商户编码',
  `mer_legal_name`  varchar(255) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL COMMENT '商户联系人姓名' ,
  `mer_id_number`  int(24) NULL DEFAULT NULL COMMENT '商户证件号码' ,
  `mer_phone`  int(24) NULL DEFAULT NULL COMMENT '商户联系人联系电话' ,
  `mer_provice_city`  varchar(255) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL COMMENT '商户所在省,市' ,
  `mer_address`  varchar(255) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL COMMENT '商户详细地址' ,
  `mer_remork_name`  varchar(255) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL COMMENT '商户备注' ,
  `mer_remrk`  varchar(24) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL COMMENT '商户联系人姓名' ,
  `mer_contact_email`  varchar(24) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL COMMENT '商户邮箱' ,
  `mer_contact_phone`  int(24) NOT NULL COMMENT '商户联系人手机号' ,
  `mer_contact_qq`  int(24) NULL DEFAULT NULL COMMENT '商户联系人QQ号' ,
  `mer_contact_wechat`  varchar(24) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL  COMMENT '商户联系人微信号' ,
  `mer_create_time`  int(24) NULL DEFAULT NULL COMMENT '商户创建时间' ,
  `mer_modify_time`  int(24) NULL DEFAULT NULL COMMENT '商户最后修改时间' ,
  PRIMARY KEY (`mer_cst_no`)
)
  ENGINE=InnoDB
  DEFAULT CHARACTER SET=latin1 COLLATE=latin1_swedish_ci
  ROW_FORMAT=COMPACT
;
