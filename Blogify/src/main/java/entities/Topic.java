package entities;

public class Topic {
	private int topicid;
	private String topicname;
	private String topicdesc;
	private String uid;

	public Topic(int topicid, String topicname, String topicdesc, String uid) {
		super();
		this.topicid = topicid;
		this.topicname = topicname;
		this.topicdesc = topicdesc;
		this.uid = uid;
	}

	public int getTopicid() {
		return topicid;
	}

	public void setTopicid(int topicid) {
		this.topicid = topicid;
	}

	public String getTopicname() {
		return topicname;
	}

	public void setTopicname(String topicname) {
		this.topicname = topicname;
	}

	public String getTopicdesc() {
		return topicdesc;
	}

	public void setTopicdesc(String topicdesc) {
		this.topicdesc = topicdesc;
	}

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public Topic() {
		// TODO Auto-generated constructor stub
	}

}
