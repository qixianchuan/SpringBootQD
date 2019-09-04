package com.qi.war.domain;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @author ：qixianchuan
 * @date ：Created in 2019-09-04 13:26
 * @description：${description}
 * @modified By：
 * @version: $version$
 */
public class ChasesunEdiOrderReceiptMain implements Serializable {
    /**
     * @desc 主键 ID
     */
    private String id;

    /**
     * U8采购订单主键
     */
    private String umainid;

    /**
     * 租户编码
     */
    private String tenantcode;

    /**
     * 入库状态
     */
    private String asnstatus;

    /**
     * asn编号
     */
    private String asnno;

    /**
     * 审核人
     */
    private String verifyby;

    /**
     * 审核时间
     */
    private String shpd;

    /**
     * 验收人
     */
    private String recheckby;

    /**
     * 验收时间
     */
    private String rechecktime;

    /**
     * 收货人
     */
    private String receiveby;

    /**
     * 收货时间
     */
    private String finishreceipttime;

    /**
     * ASN类型
     */
    private String asntype;

    /**
     * 系统来源
     */
    private String sourcesys;

    /**
     * 仓库Id
     */
    private String warehouseid;

    /**
     * edi_状态
     */
    private Integer ediStatus;

    /**
     * 创建人
     */
    private String createBy;

    /**
     * 创建时间
     */
    private LocalDateTime createDate;

    /**
     * 修改人
     */
    private String updateBy;

    /**
     * 更新时间
     */
    private LocalDateTime updateDate;

    /**
     * 删除标志位
     */
    private Integer status;

    /**
     * 备注
     */
    private String remarks;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUmainid() {
        return umainid;
    }

    public void setUmainid(String umainid) {
        this.umainid = umainid;
    }

    public String getTenantcode() {
        return tenantcode;
    }

    public void setTenantcode(String tenantcode) {
        this.tenantcode = tenantcode;
    }

    public String getAsnstatus() {
        return asnstatus;
    }

    public void setAsnstatus(String asnstatus) {
        this.asnstatus = asnstatus;
    }

    public String getAsnno() {
        return asnno;
    }

    public void setAsnno(String asnno) {
        this.asnno = asnno;
    }

    public String getVerifyby() {
        return verifyby;
    }

    public void setVerifyby(String verifyby) {
        this.verifyby = verifyby;
    }

    public String getShpd() {
        return shpd;
    }

    public void setShpd(String shpd) {
        this.shpd = shpd;
    }

    public String getRecheckby() {
        return recheckby;
    }

    public void setRecheckby(String recheckby) {
        this.recheckby = recheckby;
    }

    public String getRechecktime() {
        return rechecktime;
    }

    public void setRechecktime(String rechecktime) {
        this.rechecktime = rechecktime;
    }

    public String getReceiveby() {
        return receiveby;
    }

    public void setReceiveby(String receiveby) {
        this.receiveby = receiveby;
    }

    public String getFinishreceipttime() {
        return finishreceipttime;
    }

    public void setFinishreceipttime(String finishreceipttime) {
        this.finishreceipttime = finishreceipttime;
    }

    public String getAsntype() {
        return asntype;
    }

    public void setAsntype(String asntype) {
        this.asntype = asntype;
    }

    public String getSourcesys() {
        return sourcesys;
    }

    public void setSourcesys(String sourcesys) {
        this.sourcesys = sourcesys;
    }

    public String getWarehouseid() {
        return warehouseid;
    }

    public void setWarehouseid(String warehouseid) {
        this.warehouseid = warehouseid;
    }

    public Integer getEdiStatus() {
        return ediStatus;
    }

    public void setEdiStatus(Integer ediStatus) {
        this.ediStatus = ediStatus;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public LocalDateTime getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDateTime createDate) {
        this.createDate = createDate;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public LocalDateTime getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(LocalDateTime updateDate) {
        this.updateDate = updateDate;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", umainid=").append(umainid);
        sb.append(", tenantcode=").append(tenantcode);
        sb.append(", asnstatus=").append(asnstatus);
        sb.append(", asnno=").append(asnno);
        sb.append(", verifyby=").append(verifyby);
        sb.append(", shpd=").append(shpd);
        sb.append(", recheckby=").append(recheckby);
        sb.append(", rechecktime=").append(rechecktime);
        sb.append(", receiveby=").append(receiveby);
        sb.append(", finishreceipttime=").append(finishreceipttime);
        sb.append(", asntype=").append(asntype);
        sb.append(", sourcesys=").append(sourcesys);
        sb.append(", warehouseid=").append(warehouseid);
        sb.append(", ediStatus=").append(ediStatus);
        sb.append(", createBy=").append(createBy);
        sb.append(", createDate=").append(createDate);
        sb.append(", updateBy=").append(updateBy);
        sb.append(", updateDate=").append(updateDate);
        sb.append(", status=").append(status);
        sb.append(", remarks=").append(remarks);
        sb.append("]");
        return sb.toString();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        ChasesunEdiOrderReceiptMain other = (ChasesunEdiOrderReceiptMain) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
                && (this.getUmainid() == null ? other.getUmainid() == null : this.getUmainid().equals(other.getUmainid()))
                && (this.getTenantcode() == null ? other.getTenantcode() == null : this.getTenantcode().equals(other.getTenantcode()))
                && (this.getAsnstatus() == null ? other.getAsnstatus() == null : this.getAsnstatus().equals(other.getAsnstatus()))
                && (this.getAsnno() == null ? other.getAsnno() == null : this.getAsnno().equals(other.getAsnno()))
                && (this.getVerifyby() == null ? other.getVerifyby() == null : this.getVerifyby().equals(other.getVerifyby()))
                && (this.getShpd() == null ? other.getShpd() == null : this.getShpd().equals(other.getShpd()))
                && (this.getRecheckby() == null ? other.getRecheckby() == null : this.getRecheckby().equals(other.getRecheckby()))
                && (this.getRechecktime() == null ? other.getRechecktime() == null : this.getRechecktime().equals(other.getRechecktime()))
                && (this.getReceiveby() == null ? other.getReceiveby() == null : this.getReceiveby().equals(other.getReceiveby()))
                && (this.getFinishreceipttime() == null ? other.getFinishreceipttime() == null : this.getFinishreceipttime().equals(other.getFinishreceipttime()))
                && (this.getAsntype() == null ? other.getAsntype() == null : this.getAsntype().equals(other.getAsntype()))
                && (this.getSourcesys() == null ? other.getSourcesys() == null : this.getSourcesys().equals(other.getSourcesys()))
                && (this.getWarehouseid() == null ? other.getWarehouseid() == null : this.getWarehouseid().equals(other.getWarehouseid()))
                && (this.getEdiStatus() == null ? other.getEdiStatus() == null : this.getEdiStatus().equals(other.getEdiStatus()))
                && (this.getCreateBy() == null ? other.getCreateBy() == null : this.getCreateBy().equals(other.getCreateBy()))
                && (this.getCreateDate() == null ? other.getCreateDate() == null : this.getCreateDate().equals(other.getCreateDate()))
                && (this.getUpdateBy() == null ? other.getUpdateBy() == null : this.getUpdateBy().equals(other.getUpdateBy()))
                && (this.getUpdateDate() == null ? other.getUpdateDate() == null : this.getUpdateDate().equals(other.getUpdateDate()))
                && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
                && (this.getRemarks() == null ? other.getRemarks() == null : this.getRemarks().equals(other.getRemarks()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUmainid() == null) ? 0 : getUmainid().hashCode());
        result = prime * result + ((getTenantcode() == null) ? 0 : getTenantcode().hashCode());
        result = prime * result + ((getAsnstatus() == null) ? 0 : getAsnstatus().hashCode());
        result = prime * result + ((getAsnno() == null) ? 0 : getAsnno().hashCode());
        result = prime * result + ((getVerifyby() == null) ? 0 : getVerifyby().hashCode());
        result = prime * result + ((getShpd() == null) ? 0 : getShpd().hashCode());
        result = prime * result + ((getRecheckby() == null) ? 0 : getRecheckby().hashCode());
        result = prime * result + ((getRechecktime() == null) ? 0 : getRechecktime().hashCode());
        result = prime * result + ((getReceiveby() == null) ? 0 : getReceiveby().hashCode());
        result = prime * result + ((getFinishreceipttime() == null) ? 0 : getFinishreceipttime().hashCode());
        result = prime * result + ((getAsntype() == null) ? 0 : getAsntype().hashCode());
        result = prime * result + ((getSourcesys() == null) ? 0 : getSourcesys().hashCode());
        result = prime * result + ((getWarehouseid() == null) ? 0 : getWarehouseid().hashCode());
        result = prime * result + ((getEdiStatus() == null) ? 0 : getEdiStatus().hashCode());
        result = prime * result + ((getCreateBy() == null) ? 0 : getCreateBy().hashCode());
        result = prime * result + ((getCreateDate() == null) ? 0 : getCreateDate().hashCode());
        result = prime * result + ((getUpdateBy() == null) ? 0 : getUpdateBy().hashCode());
        result = prime * result + ((getUpdateDate() == null) ? 0 : getUpdateDate().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getRemarks() == null) ? 0 : getRemarks().hashCode());
        return result;
    }
}