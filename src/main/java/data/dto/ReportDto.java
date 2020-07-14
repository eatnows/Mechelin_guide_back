package data.dto;

import java.sql.Timestamp;

public class ReportDto {
	private int id;
	private int register_user_id;
	private int reported_user_id;
	private int post_id;
	private String content;
	private Timestamp created_at;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getRegister_user_id() {
		return register_user_id;
	}
	public void setRegister_user_id(int register_user_id) {
		this.register_user_id = register_user_id;
	}
	public int getReported_user_id() {
		return reported_user_id;
	}
	public void setReported_user_id(int reported_user_id) {
		this.reported_user_id = reported_user_id;
	}
	public int getPost_id() {
		return post_id;
	}
	public void setPost_id(int post_id) {
		this.post_id = post_id;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Timestamp getCreated_at() {
		return created_at;
	}
	public void setCreated_at(Timestamp created_at) {
		this.created_at = created_at;
	}
	
	
	
}