package com.pcwk.ehr.notice.noticeService;

import java.util.List;
import com.pcwk.ehr.notice.domain.NoticeVO;

/**
 * NoticeService: 공지사항 서비스 인터페이스 컨트롤러가 호출할 수 있는 비즈니스 로직의 표준 규격을 정의합니다.
 */
public interface NoticeService {

	/**
	 * * 공지사항 등록
	 * 
	 * @param inVO 등록할 데이터가 담긴 객체
	 * @return 성공 시 1, 실패 시 0 반환
	 */
	int doSave(NoticeVO inVO);

	/**
	 * * 공지사항 수정
	 * 
	 * @param inVO 수정할 데이터가 담긴 객체
	 * @return 성공 시 1, 실패 시 0 반환
	 */
	int doUpdate(NoticeVO inVO);

	/**
	 * * 공지사항 삭제
	 * 
	 * @param inVO 삭제할 대상의 키값(Sid)이 담긴 객체
	 * @return 성공 시 1, 실패 시 0 반환
	 */
	int doDelete(NoticeVO inVO);

	/**
	 * * 공지사항 단건 상세 조회
	 * 
	 * @param inVO 조회할 게시글 번호가 담긴 객체
	 * @return 조회된 공지사항 정보(VO)
	 */
	NoticeVO doSelectOne(NoticeVO inVO);

	/**
	 * * 공지사항 목록 조회 (검색 및 페이징 포함)
	 * 
	 * @param inVO 검색어, 페이지 번호 등이 담긴 객체
	 * @return 조회된 공지사항 리스트
	 */
	List<NoticeVO> doRetrieve(NoticeVO inVO);
}