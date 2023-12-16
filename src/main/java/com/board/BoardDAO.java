//com.example/dao 에 있음
package com.board;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.jdbc.core.BeanPropertyRowMapper;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

//import com.example.utli.JDBCUtil;

@Repository
public class BoardDAO{

    @Autowired
    SqlSession sqlSession;

    public int insertBoard(BoardVO vo){
        int count =sqlSession.update("board.insertBoard",vo);
        return count;
    }

    public int deleteBoard(int seq){
        int result =sqlSession.update("board.deleteBoard",seq);
        return result;
    }
    public int updateBoard(BoardVO vo){
        int result =sqlSession.update("board.updateBoard",vo);
        return result;
    }
    public BoardVO getBoard(int seq){
      BoardVO one = sqlSession.selectOne("board.getBoard",seq);
      return one;
    }
    public List<BoardVO> getBoardList(){
      List<BoardVO> list = sqlSession.selectList("board.getBoardList");
        return list;
    }



//
//    public void insertBoard(BoardVO vo){
//        System.out.println("InsertBOARD");
//        mybatis.insert("BoardDAO.insertBoard",vo);
//    }
//




//
//    class BoardRowMapper implements RowMapper<BoardVO>{
//        @Override
//        public BoardVO mapRow(ResultSet rs, int rowNum) throws SQLException{
//            BoardVO vo = new BoardVO();
////            vo.setSeq(rs.getInt("seq"));
//            vo.setName(rs.getString("name"));
//            vo.setBirthday(rs.getString("birthday"));
//            vo.setMbti(rs.getString("mbti"));
//            vo.setCnt((rs.getInt("cnt")));
//            vo.setEmail(rs.getString("email"));
//            vo.setPhonenum(rs.getString("phonenum"));
//            vo.setStudentid(rs.getString("studentid"));
//            vo.setMajor(rs.getString("major"));
//            vo.setRc(rs.getString("rc"));
//            return vo;
//
//        }
//    }


//
//public BoardVO getBoard(int seq){
//        String sql="select * from FriendBOARD where seq=" +seq;
//        return template.queryForObject(sql,new BoardRowMapper());
//}
//
//public List<BoardVO> getBoardList(){
//        String sql="select * from FriendBOARD order by seq desc";
//        return template.query(sql,new BoardRowMapper());
//}


}





























