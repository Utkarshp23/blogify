package entities;

public class Comment {
	
	private int commentid;
	private String commentcontent;
	private int topicid;
	private String userid;
	

	private String username;
	private String topicname;

	
	public Comment(int commentid, String commentcontent, int topicid, String userid, String username, String topicname) {
		super();
		this.commentid = commentid;
		this.commentcontent = commentcontent;
		this.topicid = topicid;
		this.userid = userid;
		this.username = username;
		this.topicname = topicname;
	}
	
	public Comment() {
		// TODO Auto-generated constructor stub
	}

	public int getCommentid() {
		return commentid;
	}

	public void setCommentid(int commentid) {
		this.commentid = commentid;
	}

	public String getCommentcontent() {
		return commentcontent;
	}

	public void setCommentcontent(String commentcontent) {
		this.commentcontent = commentcontent;
	}

	public int getTopicid() {
		return topicid;
	}

	public void setTopicid(int topicid) {
		this.topicid = topicid;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getTopicname() {
		return topicname;
	}

	public void setTopicname(String topicname) {
		this.topicname = topicname;
	}

	

}
