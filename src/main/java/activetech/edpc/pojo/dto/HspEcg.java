package activetech.edpc.pojo.dto;

import java.io.Serializable;
import java.math.BigDecimal;

public class HspEcg implements Serializable{
	private BigDecimal c1;

    private BigDecimal c2;

    private BigDecimal c3;

    private BigDecimal v1;

    private BigDecimal v2;

    private BigDecimal v3;

    private BigDecimal v4;

    private BigDecimal v5;

    private BigDecimal v6;

    private BigDecimal avl;

    private BigDecimal avr;

    private BigDecimal avf;

    private static final long serialVersionUID = 1L;

	public BigDecimal getC1() {
		return c1;
	}

	public void setC1(BigDecimal c1) {
		this.c1 = c1;
	}

	public BigDecimal getC2() {
		return c2;
	}

	public void setC2(BigDecimal c2) {
		this.c2 = c2;
	}

	public BigDecimal getC3() {
		return c3;
	}

	public void setC3(BigDecimal c3) {
		this.c3 = c3;
	}

	public BigDecimal getV1() {
		return v1;
	}

	public void setV1(BigDecimal v1) {
		this.v1 = v1;
	}

	public BigDecimal getV2() {
		return v2;
	}

	public void setV2(BigDecimal v2) {
		this.v2 = v2;
	}

	public BigDecimal getV3() {
		return v3;
	}

	public void setV3(BigDecimal v3) {
		this.v3 = v3;
	}

	public BigDecimal getV4() {
		return v4;
	}

	public void setV4(BigDecimal v4) {
		this.v4 = v4;
	}

	public BigDecimal getV5() {
		return v5;
	}

	public void setV5(BigDecimal v5) {
		this.v5 = v5;
	}

	public BigDecimal getV6() {
		return v6;
	}

	public void setV6(BigDecimal v6) {
		this.v6 = v6;
	}

	public BigDecimal getAvl() {
		return avl;
	}

	public void setAvl(BigDecimal avl) {
		this.avl = avl;
	}

	public BigDecimal getAvr() {
		return avr;
	}

	public void setAvr(BigDecimal avr) {
		this.avr = avr;
	}

	public BigDecimal getAvf() {
		return avf;
	}

	public void setAvf(BigDecimal avf) {
		this.avf = avf;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
    
    

}
