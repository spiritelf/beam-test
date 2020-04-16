package com.hsshy.beam.modular.sys.dao;
import com.hsshy.beam.modular.sys.entity.Dict;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.apache.ibatis.annotations.Param;
/**
 * 字典表
 * 
 * @author hs
 * @email 457030599@qq.com
 * @date 2019-04-12 16:45:03
 */
public interface DictMapper extends BaseMapper<Dict> {

    IPage<Dict> selectPageList(Page page, @Param("dict") Dict dict);

}
