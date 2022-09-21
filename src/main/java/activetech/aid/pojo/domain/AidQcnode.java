package activetech.aid.pojo.domain;

public class AidQcnode {
    private String nodeid;

    private String nodetype;

    private String headnode;

    private String tailnode;

    private Long qcnumb;

	public String getNodeid() {
        return nodeid;
    }

    public void setNodeid(String nodeid) {
        this.nodeid = nodeid == null ? null : nodeid.trim();
    }

    public String getNodetype() {
        return nodetype;
    }

    public void setNodetype(String nodetype) {
        this.nodetype = nodetype == null ? null : nodetype.trim();
    }

    public String getHeadnode() {
        return headnode;
    }

    public void setHeadnode(String headnode) {
        this.headnode = headnode == null ? null : headnode.trim();
    }

    public String getTailnode() {
        return tailnode;
    }

    public void setTailnode(String tailnode) {
        this.tailnode = tailnode == null ? null : tailnode.trim();
    }

    public Long getQcnumb() {
        return qcnumb;
    }

    public void setQcnumb(Long qcnumb) {
        this.qcnumb = qcnumb;
    }
}