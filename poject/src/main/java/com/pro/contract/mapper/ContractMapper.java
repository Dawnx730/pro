package com.pro.contract.mapper;

import com.pro.contract.model.Contract;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ContractMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Contract record);

    int insertSelective(Contract record);

    Contract selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Contract record);

    int updateByPrimaryKey(Contract record);

//     List<Contract> selectContract (List id);

    /**
     * 模糊查询
     * @return
     */
     List<Contract> selectContractLike(@Param("cname") String cname);



}