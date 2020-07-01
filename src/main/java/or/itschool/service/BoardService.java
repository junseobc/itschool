package or.itschool.service;

import java.util.List;

import or.itschool.model.BoardVO;

public interface BoardService {

	// 1. 게시글 등록기능 메서드 - 게시글 하나 가져와서 등록.
	void insert(BoardVO article) throws Exception;

	// 2. 하나의 게시글 조회 기능 메서드 - 하나를 조회하려면.
	BoardVO getArticle(int boardNo) throws Exception;

	// 3. 게시글 수정 기능 메서드 - 게시물 전체 정보를 가져와.
	void update(BoardVO article) throws Exception;

	// 4. 게시물 삭제기능 메서드 - 게시물 번호의 글을.
	void delete(int boardNo) throws Exception;

	// 5. 모든 게시물 조회
	List<BoardVO> getAllArticles() throws Exception;	
}
