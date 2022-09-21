package activetech.eicu.pojo.dto;

import java.math.BigDecimal;

import activetech.eicu.pojo.domain.IcuVsDef;

public class IcuVsDefCustom extends IcuVsDef{
	/**
	 * 上限
	 */
	private BigDecimal uppLmt;
	/**
	 * 下限
	 */
	private BigDecimal lowLmt;
	/**
	 * 管路类型
	 */
	private String pipeType;
	/**
	 * 管路名称
	 */
	private String typeName;
	
	public String getPipeType() {
		return pipeType;
	}
	public void setPipeType(String pipeType) {
		this.pipeType = pipeType;
	}
	public String getTypeName() {
		return typeName;
	}
	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}
	public BigDecimal getUppLmt() {
		return uppLmt;
	}
	public void setUppLmt(BigDecimal uppLmt) {
		this.uppLmt = uppLmt;
	}
	public BigDecimal getLowLmt() {
		return lowLmt;
	}
	public void setLowLmt(BigDecimal lowLmt) {
		this.lowLmt = lowLmt;
	}
	
}
