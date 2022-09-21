package activetech.edpc.pojo.domain;

public class HspFlowChartInf {
    private String flowchartSeq;

    private String emgSeq;

    private String nodeId;

    private String status;

    private String flowType;

    public String getFlowchartSeq() {
        return flowchartSeq;
    }

    public void setFlowchartSeq(String flowchartSeq) {
        this.flowchartSeq = flowchartSeq == null ? null : flowchartSeq.trim();
    }

    public String getEmgSeq() {
        return emgSeq;
    }

    public void setEmgSeq(String emgSeq) {
        this.emgSeq = emgSeq == null ? null : emgSeq.trim();
    }

    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId == null ? null : nodeId.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getFlowType() {
        return flowType;
    }

    public void setFlowType(String flowType) {
        this.flowType = flowType == null ? null : flowType.trim();
    }
}