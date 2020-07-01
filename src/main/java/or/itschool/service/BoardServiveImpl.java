package or.itschool.service;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;
import or.itschool.mapper.BoardMapper;
import or.itschool.model.BoardVO;

@Log4j
@Service
@AllArgsConstructor
public class BoardServiveImpl implements BoardService {
	
	private BoardMapper mapper;

	@Override
	public void insert(BoardVO article) throws Exception {
		log.info("insert ..........." + article);
		mapper.insert(article);
	}

	@Override
	public BoardVO getArticle(int boardNo) throws Exception {
		log.info("getArticle............" + boardNo);
		return mapper.getArticle(boardNo);
	}

	@Override
	public void update(BoardVO article) throws Exception {
		log.info("update............" + article);
		mapper.update(article);

	}

	@Override
	public void delete(int boardNo) throws Exception {
		log.info("delete............" + boardNo);
		mapper.delete(boardNo);
	}

	@Override
	public List<BoardVO> getAllArticles() throws Exception {
		log.info("getAllArticle()............");
		return mapper.getAllArticles();
	}

}
