package activetech.edpc.pojo.domain;

public class HspFlowChartDef extends HspFlowChartDefKey {
    private String nodeName;

    private String nodeType;

    private String nodeTriggerEvent;

    public String getNodeName() {
        return nodeName;
    }

    public void setNodeName(String nodeName) {
        this.nodeName = nodeName == null ? null : nodeName.trim();
    }

    public String getNodeType() {
        return nodeType;
    }

    public void setNodeType(String nodeType) {
        this.nodeType = nodeType == null ? null : nodeType.trim();
    }

    public String getNodeTriggerEvent() {
        return nodeTriggerEvent;
    }

    public void setNodeTriggerEvent(String nodeTriggerEvent) {
        this.nodeTriggerEvent = nodeTriggerEvent == null ? null : nodeTriggerEvent.trim();
    }
}