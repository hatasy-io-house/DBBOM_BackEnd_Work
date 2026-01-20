package com.pcwk.ehr.notice.noticeService;

import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.pcwk.ehr.mapper.NoticeMapper;
import com.pcwk.ehr.notice.domain.NoticeVO;

/**
 * NoticeServiceImpl: 공지사항 서비스 구현체
 * 
 * @Service 어노테이션을 통해 스프링이 관리하는 서비스 객체임을 선언합니다.
 */
@Service("noticeService")
public class NoticeServiceImpl implements NoticeService {

	// 로그 출력을 위한 설정 (에러나 흐름을 추적할 때 사용)
	final Logger log = LogManager.getLogger(getClass());

	// DB 접근을 담당하는 Mapper 인터페이스를 주입받습니다.
	@Autowired
	private NoticeMapper noticeMapper;

	/** 공지사항 등록 실행 */
	@Override
	public int doSave(NoticeVO inVO) {
		// Mapper의 insert 문을 호출하여 결과를 반환합니다.
		return noticeMapper.doSave(inVO);
	}

	/** 공지사항 수정 실행 */
	@Override
	public int doUpdate(NoticeVO inVO) {
		// Mapper의 update 문을 호출합니다.
		return noticeMapper.doUpdate(inVO);
	}

	/** 공지사항 삭제 실행 */
	@Override
	public int doDelete(NoticeVO inVO) {
		// Mapper의 delete 문을 호출합니다.
		return noticeMapper.doDelete(inVO);
	}

	/** 공지사항 단건 조회 실행 */
	@Override
	public NoticeVO doSelectOne(NoticeVO inVO) {
		// 특정 게시글 정보를 가져오기 위해 Mapper를 호출합니다.
		return noticeMapper.doSelectOne(inVO);
	}

	/** 공지사항 목록 조회 실행 */
	@Override
	public List<NoticeVO> doRetrieve(NoticeVO inVO) {
		// 검색 조건에 맞는 리스트를 가져오기 위해 Mapper를 호출합니다.
		return noticeMapper.doRetrieve(inVO);
	}
}