package activetech.zyyhospital.pojo.domain;

public class HspJjbhzmx {
	private String jjbglSeq;

    private String emgSeq;
    
    private String emgType;

    private String memo;

    public String getJjbglSeq() {
		return jjbglSeq;
	}

	public void setJjbglSeq(String jjbglSeq) {
		this.jjbglSeq = jjbglSeq;
	}

	public String getEmgSeq() {
		return emgSeq;
	}

	public void setEmgSeq(String emgSeq) {
		this.emgSeq = emgSeq;
	}

	public String getEmgType() {
        return emgType;
    }

    public void setEmgType(String emgType) {
        this.emgType = emgType == null ? null : emgType.trim();
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }
}