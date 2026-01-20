package com.pcwk.ehr.notice.domain;

import java.io.Serializable;
import com.pcwk.ehr.cmn.DTO;

/**
 * NoticeVO: 공지사항 데이터를 담는 객체 DTO를 상속받아 페이징/검색 기능을 공유하며, 직렬화를 위해 Serializable을
 * 구현함
 */
public class NoticeVO extends DTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private int noticeSid; // 공지사항 식별번호 (NOTICE_SID)
	private String noticeTitle; // 제목 (NOTICE_TITLE)
	private String noticeContent; // 내용 (NOTICE_CONTENT)
	private String noticeUpdate; // 수정일 (NOTICE_UPDATE)
	private String noticeTime; // 등록시간 (NOTICE_TIME)
	private String regId; // 등록자 아이디 (REG_ID)
	private int totalCnt; // 전체 게시글 수 (페이징 처리를 위해 필요함)

	// 기본 생성자
	public NoticeVO() {
		super();
	}

	// 전체 필드를 포함한 생성자 (상세 조회 등에 활용)
	public NoticeVO(int noticeSid, String noticeTitle, String noticeContent, String noticeUpdate, String noticeTime,
			String regId) {
		this.noticeSid = noticeSid;
		this.noticeTitle = noticeTitle;
		this.noticeContent = noticeContent;
		this.noticeUpdate = noticeUpdate;
		this.noticeTime = noticeTime;
		this.regId = regId;
	}

	// Getter & Setter: 데이터를 읽고 저장하는 표준 메서드
	public int getNoticeSid() {
		return noticeSid;
	}

	public void setNoticeSid(int noticeSid) {
		this.noticeSid = noticeSid;
	}

	public String getNoticeTitle() {
		return noticeTitle;
	}

	public void setNoticeTitle(String noticeTitle) {
		this.noticeTitle = noticeTitle;
	}

	public String getNoticeContent() {
		return noticeContent;
	}

	public void setNoticeContent(String noticeContent) {
		this.noticeContent = noticeContent;
	}

	public String getNoticeUpdate() {
		return noticeUpdate;
	}

	public void setNoticeUpdate(String noticeUpdate) {
		this.noticeUpdate = noticeUpdate;
	}

	public String getNoticeTime() {
		return noticeTime;
	}

	public void setNoticeTime(String noticeTime) {
		this.noticeTime = noticeTime;
	}

	public String getRegId() {
		return regId;
	}

	public void setRegId(String regId) {
		this.regId = regId;
	}

	public int getTotalCnt() {
		return totalCnt;
	}

	public void setTotalCnt(int totalCnt) {
		this.totalCnt = totalCnt;
	}

	// 객체의 상태를 문자열로 확인하기 위한 메서드
	@Override
	public String toString() {
		return "NoticeVO [noticeSid=" + noticeSid + ", noticeTitle=" + noticeTitle + ", noticeContent=" + noticeContent
				+ ", noticeUpdate=" + noticeUpdate + ", noticeTime=" + noticeTime + ", regId=" + regId + ", totalCnt="
				+ totalCnt + "]";
	}
}