-- auto Generated on 2019-09-04
-- DROP TABLE IF EXISTS chasesun_edi_order_receipt_main;
CREATE TABLE chasesun_edi_order_receipt_main(
	id VARCHAR (50) NOT NULL COMMENT '@desc 主键 ID',
	umainid VARCHAR (50) COMMENT 'U8采购订单主键',
	tenantcode VARCHAR (50) COMMENT '租户编码',
	asnstatus VARCHAR (50) COMMENT '入库状态',
	asnno VARCHAR (50) COMMENT 'asn编号',
	verifyby VARCHAR (50) COMMENT '审核人',
	shpd VARCHAR (50) COMMENT '审核时间',
	recheckby VARCHAR (50) COMMENT '验收人',
	rechecktime VARCHAR (50) COMMENT '验收时间',
	receiveby VARCHAR (50) COMMENT '收货人',
	finishreceipttime VARCHAR (50) COMMENT '收货时间',
	asntype VARCHAR (50) COMMENT 'ASN类型',
	sourcesys VARCHAR (50) COMMENT '系统来源',
	warehouseid VARCHAR (50) COMMENT '仓库Id',
	edi_status INT (11) COMMENT 'edi_状态',
	create_by VARCHAR (50) COMMENT '创建人',
	create_date DATETIME COMMENT '创建时间',
	update_by VARCHAR (50) COMMENT '修改人',
	update_date DATETIME COMMENT '更新时间',
	`status` INT (11) COMMENT '删除标志位',
	remarks VARCHAR (50) COMMENT '备注',
	PRIMARY KEY (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT 'chasesun_edi_order_receipt_main';
